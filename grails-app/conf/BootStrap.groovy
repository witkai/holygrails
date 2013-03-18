import org.junit.internal.runners.statements.FailOnTimeout;

import cc.*

class BootStrap {

    def init = { servletContext ->
		Quest q1 = new Quest(name:"Seek the grail")
			.addToTasks(name:"Buy horse", completed:true)
			.addToTasks(name:"Defeat the Black Knight")
			.addToTasks(name:"Answer the bridgekeeper", priority:4)
			.save(failOnError:true)
    }
	
    def destroy = {
    }
}
