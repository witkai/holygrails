package cc


/**
 * Methods in the service are transactional
 * 
 * @author kai
 */
class DatabaseService {

    def delete(obj) {
		obj.delete()
    }
	
	def deleteWithKnights(q) {
		q.knights.each{ 
			it.quest = null
		}
	}
	
}
