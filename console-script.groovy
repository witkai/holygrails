import cc.*

// count
int questCount = Quest.count()
if (questCount == 0) {
    new BootStrap().init()
}

// list
Quest.list()

// findBy
Quest q = Quest.findByName("Seek the grail")
println "Id = ${q.id}"
println "Tasks = ${q.tasks.size()}"

// findAllBy
Quest.findAllByName("Seek the grail")

Task t1 = Task.get(1)
println t1.name

Task.findAllByPriorityGreaterThan(1)
Task.findAllByPriorityLessThanAndStartDateBetween(4, new Date()-1, new Date()+1)

// criteria query
def c = Task.withCriteria {
    between("startDate", new Date()-1, new Date()+1)
    like('name', '%a%')
    order('name', 'asc')
}

// add task
q.addToTasks(name:"t1").save()
println q.tasks.size() // 4
println Task.count()   // 3
// add task with flush
q.addToTasks(name:"t2").save(flush:true)
println q.tasks.size() // 5
println Task.count()   // 5

Task.get(5)  // using sql
Task.get(5)  // loaded from Hybernate l1 cache
