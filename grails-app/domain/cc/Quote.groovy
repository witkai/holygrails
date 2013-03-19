package cc

class Quote {

    static constraints = {
    }
	
	static mapping = {
		table "famous_quotes"
		character column:"role"
		line column:"quote"
		version false
	}
	
	String character
	String line
}
