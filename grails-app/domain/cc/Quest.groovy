package cc

class Quest {

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
