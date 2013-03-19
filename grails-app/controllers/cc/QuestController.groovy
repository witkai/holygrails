package cc

import org.springframework.dao.DataIntegrityViolationException;

class QuestController {

	/**
	 * Dependency injection of service
	 */
	def databaseService
	
    static scaffold = Quest
	
	def delete(long id) {
		def questInstance = Quest.get(id);
		try {
			databaseService.delete(questInstance)
			//databaseService.deleteWithKnights(questInstance)
		} catch (DataIntegrityViolationException) {
			flash.message = "Data integrity violation when deleting the quest $id"
			redirect(action:"list", id:id)
		}
	}
	
}
