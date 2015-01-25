/**
 * Abstrakte Klasse zur Repraesentation einer konstanten Temperatur.
 */
public abstract class Fahrenheit {

	private double wert; // Temperaturwert.

	/**
	 * Konstruktor, der die zu repraesentierende Temperatur
	 * entgegen nimmt.
	 * @param wert Zu repraesentierende Temperatur.
	 */
	public Fahrenheit(double wert) {
		this.wert = wert;
	}

	/**
	 * Lies die repraesentierte Temperatur aus.
	 * @return Die repraesentierte Temperatur.
	 */
	public double getWert() {
		return wert;
	}
	
	/*
	 * Hier koennen bei Bedarf noch Methoden ergaenzt werden.
	 */
}