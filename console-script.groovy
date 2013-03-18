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

def c = Task.withCriteria {
	between("startDate", new Date()-1, new Date()+1)
	like('name', '%a%')
	order('name', 'asc')
}

