public class TemperaturUmrechner {
	
	/**
	 * Konvertiert ein übergebenes Temperatur Objekt nach Celsius.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Celsius
	 */
	public Celsius nachGradCelsius(Temperatur temp){
		return temp.inCelsius();
	}
	
	/**
	 * Konvertiert ein übergebenes Temperatur Objekt nach Kelvin.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Kelvin
	 */
	public Kelvin nachKelvin(Temperatur temp){
		return temp.inKelvin();
	}
	
	/**
	 * Konvertiert ein übergebenes Temperatur Objekt nach Fahrenheit.
	 * @param temp Objekt vom Typ Temperatur
	 * @return Objekt vom Typ Fahrenheit
	 */
	public Fahrenheit nachGradFahrenheit(Temperatur temp){
		return temp.inFahrenheit();
	}
}