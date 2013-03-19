package cc

class GeocoderService {

	//TODO: FileNotFoundException
	//public final static String GOOGLE_URL = "http://maps.googleapis.com/maps/api/geocode/xml?"

	void fillInLatLng(Castle castle) {
		def encoded = [castle.city, castle.state].collect {
			URLEncoder.encode(it, "UTF-8")
		}.join(",+")
		def qs = [address:encoded, sensor:false].collect {
			k,v -> "$k=$v"
		}.join("&")
		def root = new XmlSlurper().parse("http://maps.googleapis.com/maps/api/geocode/xml?" + qs)
		castle.latitude = root.result[0].geometry.location.lat.toDouble()
		castle.longitude = root.result[0].geometry.location.lng.toDouble()
	}
}
