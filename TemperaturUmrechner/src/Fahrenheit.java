public class Fahrenheit extends Temperatur {

	/**
	 * Setzt das Attribut wert.
	 * @param wert Wert f�r das Attribut wert.
	 */
	public Fahrenheit(double wert) {
		super(wert);
	}

	/**
	 * @see Temperatur#inCelsius()
	 */
	public Celsius inCelsius() {
		return new Celsius((this.getWert() - 32) * 5 / 9);
	}

	/**
	 * @see Temperatur#inKelvin()
	 */
	public Kelvin inKelvin() {
		return new Kelvin((this.getWert() + 459.67) * 5 / 9);
	}
	
	/**
	 * Gibt this zur�ck, da nichts konvertiert werden muss.
	 */
	public Fahrenheit inFahrenheit() {
		return this;
	}
}