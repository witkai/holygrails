package cc



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quest)
class QuestTests {

	Quest quest = new Quest(name:'Quest no. 1')
	
	@Before
	void setup() {
		mockForConstraintsTests(Quest, [quest])
	}
	
    void testValid() {
       assert quest.validate()
    }
	
	void testBlankName() {
		quest.name = ''
		assert !quest.validate()
		assert 'blank' == quest.errors['name']
	}
}
