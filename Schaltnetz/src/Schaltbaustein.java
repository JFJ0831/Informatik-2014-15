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
	
	boolean WertX;
	boolean WertY;
	boolean ausgang;
	
	public void setEingangX(boolean WertX) {
		
	}
	
	public void setEingangY(boolean WertY) {
		
	}
	
	public boolean getEingangX() {
		return WertX;
	}
	
	public boolean getEingangY() {
		return WertY;
	}

	public boolean getAusgang() {
		return ausgang;
	}
}