package cc

class Quest {
	
	static hasMany = [tasks:Task]

	static constraints = {
		name blank:false
	}

	String name
	Date dateCreated
	Date lastUpdated
	
	String toString() {
		name
	}
	
}
