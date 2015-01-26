public class Kelvin extends Temperatur {

	/**
	 * Setzt das Attribut wert.
	 * @param wert Wert f�r das Attribut wert.
	 */
	public Kelvin(double wert) {
		super(wert);
	}
	
	/**
	 * @see Temperatur#inCelsius()
	 */
	public Celsius inCelsius() {
		return new Celsius(this.getWert() - 273.15);
	}
	
	/**
	 * Gibt this zur�ck, da nichts konvertiert werden muss.
	 */
	public Kelvin inKelvin() {
		return this;
	}
	
	/**
	 * @see Temperatur#inFahrenheit()
	 */
	public Fahrenheit inFahrenheit() {
		return new Fahrenheit(this.getWert() * 1.8 - 459.67);
	}
}