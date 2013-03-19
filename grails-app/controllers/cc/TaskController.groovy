package cc

import grails.converters.JSON
import grails.converters.XML


class TaskController {
	// true or Task both work, but true is safer
    static scaffold = Task
	
	def sakilaService
	
	def callFilmInStock() {
		render(sakilaService.filmInStock(1,1))
	}
	
	def tasks() {
		[tasks:Task.list()]
	}
	
	def detail() {
		render(template:"detail", bean:Task.get(params.id), var:"task")
	}
	
	/**
	 * Returns the time of the server
	 * @return
	 */
	def time() {
		render "The current time on the server is ${new Date()}."
	}
	
	/**
	 * List all tasks as XML: 
	 * /task/xml/
	 */
	def xml = {
		render Task.list() as XML
	}
	
	/**
	 * List all tasks as JSON:
	 * /task/json/
	 */
	def json = {
		render Task.list() as JSON
	}
}
