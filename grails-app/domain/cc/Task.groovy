package cc

import groovy.transform.ToString

// AST (abstract syntax tree)
@ToString
class Task {
	
	public static final int MIN_PRIORITY = 1
	public static final int MAX_PRIORITY = 5
	public static final int DEFAULT_PRIORITY = 3
	
	static belongsTo = [quest:Quest]
	
	String name
	int priority = DEFAULT_PRIORITY
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
		priority range:MIN_PRIORITY..MAX_PRIORITY
		startDate()
    		endDate validator: { value, task -> 
				value >= task.startDate
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
