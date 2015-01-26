public class SchaltbausteinAND extends Schaltbaustein {	
	
	public SchaltbausteinAND() {
		
	}

	@Override
	public boolean werteAus() {
		if (WertX == true && WertY == true)
			return true;
		else {
			return false;
		}
	}
}		
	
