import cc.*

class BootStrap {
	def geocoderService

	def init = { servletContext ->
		if (!Quest.findByName("Seek the grail")) {
			Quest q1 = new Quest(name:"Seek the grail")
			.addToTasks(name:"Buy horse", completed:true)
			.addToTasks(name:"Defeat the Black Knight")
			.addToTasks(name:"Answer the bridgekeeper", priority:4)
			.save(failOnError:true)
			Castle camelot = new Castle(name:"Camelot", city:"Boston", state:"MA")
			.addToKnights(title:"King", name:"Arthur", quest:q1)
			.addToKnights(title:"Sir", name:"Lancelot", quest:q1)
			.addToKnights(title:"Sir", name:"Robin", quest:q1)
			.save(failOnError:true)
			println camelot.toString()
			geocoderService.fillInLatLng(camelot)
			println camelot.toString()
			camelot.save(failOnError:true)
		}
	}

	def destroy = {
	}
}
