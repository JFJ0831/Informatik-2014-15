public class TemperaturUmrechner {
	
	/**
	 * Konvertiert ein �bergebenes Temperatur Objekt nach Celsius.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Celsius
	 */
	public Celsius nachGradCelsius(Temperatur temp){
		return temp.inCelsius();
	}
	
	/**
	 * Konvertiert ein �bergebenes Temperatur Objekt nach Kelvin.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Kelvin
	 */
	public Kelvin nachKelvin(Temperatur temp){
		return temp.inKelvin();
	}
	
	/**
	 * Konvertiert ein �bergebenes Temperatur Objekt nach Fahrenheit.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Fahrenheit
	 */
	public Fahrenheit nachGradFahrenheit(Temperatur temp){
		return temp.inFahrenheit();
	}
}