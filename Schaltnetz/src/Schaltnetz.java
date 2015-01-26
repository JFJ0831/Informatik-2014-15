/**
 * Modellierung eines Schaltnetzes mit zwei Eingaengen (X und Y),
 * an denen jeweils Boolesche Werte anliegen koennen. Das Schaltnetz
 * hat genau einen Ausgang, der dem Ausgang eines Schaltbausteins
 * entspricht.
 */
public class Schaltnetz {

    // Schaltbaustein, dessen Ausgabe der Ausgabe des
    // Schaltnetzes entspricht.
	private Schaltbaustein ausgang; 

	boolean WertX;
	boolean WertY;
	
	public Schaltnetz() {
		
	}
	
	/**
	 * Setzt die Eingabe am Eingang X des Schaltnetzes.
	 * @param wert Neuer Wert für den Eingang X des Schaltnetzes
	 */
	public void setWertX(boolean wert) {
		this.WertX = wert;
    }
    
	/**
	 * Setzt die Eingabe am Eingang Y des Schaltnetzes.
	 * @param wert Neuer Wert für den Eingang Y des Schaltnetzes
	 */
	public void setWertY(boolean wert) {
		this.WertY = wert;
    }
	
	/**
	 * Liest die Eingabe am Eingang X des Schaltnetzes.
	 * @return WertX des Eingangs X des Schaltnetzes.
	 */
	public boolean getEingangX() {
		return WertX;
	}
	
	/**
	 * Liest die Eingabe am Eingang Y des Schaltnetzes.
	 * @return WertY des Eingangs Y des Schaltnetzes.
	 */
	public boolean getEingangY() {
		return WertY;
	}
	
	
	/**
	 * Wertet das Schaltnetz für die aktuell an den 
	 * Eingängen X und Y anliegenden Booleschen Werte aus.
	 * @return Ergebnis der Auswertung.
	 */
	public boolean werteAus() {
		return ausgang.werteAus();
	}

	/**
	 * Wertet das Schaltnetz aus, wobei angenommen wird, dass
	 * die als Parameter uebergebenen Booleschen Werte an den 
	 * Eingaengen X und Y anliegen.
	 * @param x Boolescher Wert, der am Eingang X anliegt.
	 * @param y Boolescher Wert, der am Eingang Y anliegt.
	 * @return Ergebnis der Auswertung.
	 */
	public boolean werteAus(boolean x, boolean y) {
		setWertX(x);
		setWertY(y);
		return ausgang.werteAus();
	}
}