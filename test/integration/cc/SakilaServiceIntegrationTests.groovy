package cc

import static org.junit.Assert.*
import org.junit.*

class SakilaServiceIntegrationTests {

	def sakilaService

	void testFilmInStock() {
		assert 4 == sakilaService.filmInStock(1,1)
	}
}
