/**
 * Modellierung eines Schaltbausteins, z.B. AND, OR oder NOT.
 * Der Baustein hat genau einen Ausgang, an dem der berechnete
 * Boolesche Wert anliegt.
 */
abstract public class Schaltbaustein {

	/**
	 * Auslesen des durch den Schaltbaustein berechneten Werts.
	 * @return Berechneter Wert.
	 */
	abstract public boolean werteAus();
	
	boolean ausgang;
	boolean WertX;
	boolean WertY;
	
	public void setEingangX(boolean WertX) {
		// TODO Auto-generated method stub
		
	}

	public void setEingangY(boolean WertY) {
		// TODO Auto-generated method stub
		
	}
	
	public void setEingang(boolean ausgang) {
		// TODO Auto-generated method stub
		
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
	
	
}