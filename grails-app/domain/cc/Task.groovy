package cc

import groovy.transform.ToString

// AST (abstract syntax tree)
@ToString
class Task {

	String name
	int priority = 3
	Date startDate = new Date()
	Date endDate = new Date()
	boolean completed
	
	/**
	 * Calculate the duration based on start and end dates.
	 * 
	 * @return Duration of Task in days
	 */
	int getDuration() {
		endDate - startDate + 1
	}
	
	/**
	 * Order in constraints defines order in scaffolded HTML form.
	 * Default is alphabetical (e.g. endDate, startDate)
	 */
    static constraints = {
		name blank:false
		priority range:1..5
		startDate()
    		endDate validator: { 
			value, Task task -> value >= task.startDate
		}
		completed()
	}

	/**
	 * Don't put the duration, which is calculated, into the DB
	 */
	static transients = {
		['duration']
	}	
	
}
