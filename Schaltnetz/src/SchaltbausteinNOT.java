public class SchaltbausteinNOT extends Schaltbaustein {
	
	public SchaltbausteinNOT() {
		if (WertX == false)
			ausgang = true;
		else {
			ausgang = false;
		}
	}

	@Override
	public boolean werteAus() {
		// TODO Auto-generated method stub
		return false;
	}
}