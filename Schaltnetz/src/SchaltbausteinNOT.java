public class SchaltbausteinNOT extends Schaltbaustein {	
	
	public SchaltbausteinNOT() {
		
	}

	@Override
	public boolean werteAus() {
		if (getAusgang() == true)
			return false;
		else {
			return true;
		}
	}
}		
