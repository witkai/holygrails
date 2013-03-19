package cc

import groovy.sql.Sql

class SakilaService {

	def dataSource_sakila
	
    def filmInStock(filmId, storeId) {
		def sql = new Sql(dataSource_sakila)
        int result = 0
		sql.call( "{call film_in_stock(?,?,?)}", [filmId, storeId, Sql.INTEGER]) { count ->
			println count
			result = count
		}
		return result
    }
}
