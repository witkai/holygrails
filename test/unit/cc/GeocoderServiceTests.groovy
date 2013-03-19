package cc

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(GeocoderService)
class GeocoderServiceTests {

	void testMountainViewCA() {
		Castle castle = new Castle(city:"Mountain View", state:"CA")
		service.fillInLatLng(castle)
		assertEquals(37.4, castle.latitude, 0.1)
		assertEquals(-122.1, castle.longitude, 0.1)
	}
}
