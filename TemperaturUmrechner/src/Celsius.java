public class Celsius extends Temperatur {

	/**
	 * Setzt das Attribut wert.
	 * @param wert Wert f�r das Attribut wert.
	 */
	public Celsius(double wert) {
		super(wert);
	}
	
	
	/**
	 * Gibt this zur�ck, da nichts konvertiert werden muss.
	 */
	public Celsius inCelsius() {
		return this;
	}
	
	
	/**
	 * @see Temperatur#inKelvin()
	 */
	public Kelvin inKelvin() {
		return new Kelvin(this.getWert() + 273.15);
	}
	
	/**
	 * @see Temperatur#inFahrenheit()
	 */
	public Fahrenheit inFahrenheit() {
		return new Fahrenheit(this.getWert() * 1.8 + 32);
	}
}