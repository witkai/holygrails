package cc

class Knight {

    static constraints = {
		title inList: ["Sir", "Lord", "King", "Squire"]
		name blank:false
		castle nullable:true
		quest nullable:true
    }
	
	Castle castle
	Quest quest
	String title
	String name
	
	String toString() {
		"$title $name"
	}
}
