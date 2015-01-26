/**
 * Abstrakte Klasse zur Repr&auml;sentation einer konstanten Temperatur.
 */
public abstract class Temperatur {

	private double wert; // Temperaturwert.

	/**
	 * Konstruktor, der die zu repr&auml;sentierende Temperatur
	 * entgegen nimmt.
	 * @param wert Zu repr&auml;sentierende Temperatur.
	 */
	public Temperatur(double wert) {
		this.wert = wert;
	}

	/**
	 * Lies die repr&auml;sentierte Temperatur aus.
	 * @return Die repr&auml;sentierte Temperatur.
	 */
	public double getWert() {
		return wert;
	}
	
	
	/**
	 * Konvertiert das Attribut Wert zu dem entsprechenden Wert in Celsius.
	 * @return Objekt vom Typ Celsius
	 */
	public abstract Celsius inCelsius();
	
	/**
	 * Konvertiert das Attribut Wert zu dem entsprechenden Wert in Kelvin.
	 * @return Objekt vom Typ Kelvin
	 */
	public abstract Kelvin inKelvin();
	
	/**
	 * Konvertiert das Attribut Wert zu dem entsprechenden Wert in Fahrenheit.
	 * @return Objekt vom Typ Fahrenheit
	 */
	public abstract Fahrenheit inFahrenheit();
}