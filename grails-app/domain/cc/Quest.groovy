package cc

class Quest {
	
	static hasMany = [tasks:Task]

	String name
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
		name blank:false
    }
	
	String toString() {
		name
	}
	
}
