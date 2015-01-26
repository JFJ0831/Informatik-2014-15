public class SchaltbausteinOR extends Schaltbaustein {	
	
	public SchaltbausteinOR() {
		
	}

	@Override
	public boolean werteAus() {
		if (getEingangX() == true || getEingangY() == true)
			return true;
		else {
			return false;
		}
	}
}		
