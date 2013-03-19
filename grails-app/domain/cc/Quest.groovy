package cc

class Quest {
	
	static hasMany = [tasks:Task, knights:Knight]

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
