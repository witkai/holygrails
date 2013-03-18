package cc

import grails.test.mixin.*
import org.junit.*


/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Task)
class TaskTests {

	Task task = new Task(name:'t0')
	
	@Before
	void setup() {
		task.quest = new Quest(nqme:'q0')
		mockForConstraintsTests(Task, [task])
	}
	
    void testDuration() {
       assert 1 == task.duration
	   task.endDate = task.startDate + 1
	   assert 2 == task.duration
    }
	
	void testValid() {
		assert task.validate()
	}
	
	void testBlankName() {
		task.name = ''
		assert !task.validate()
		assert 'blank' == task.errors.name
	}
	
	void testPriorityTooLow() {
		task.priority = Task.MIN_PRIORITY - 1
		assert !task.validate()
		assert 'range' == task.errors.priority
	}
	
	void testPriorityTooHigh() {
		task.priority = Task.MAX_PRIORITY + 1
		assert !task.validate()
		assert 'range' == task.errors.priority
	}
	
	void testPriorityOK() {
		(Task.MIN_PRIORITY..Task.MAX_PRIORITY).each { p ->
			task.priority = p
			assert task.validate()
		}
	}
	
	void testEndDateBeforeStartDate() {
		task.endDate = task.startDate -1
		assert !task.validate()
		assert 'validator' == task.errors['endDate']
	}

}
