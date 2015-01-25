public class SchaltbausteinOR extends Schaltbaustein {
	
	public SchaltbausteinOR() {
		
	}

	@Override
	public boolean werteAus() {
		this.WertX = getEingangX();
		this.WertY = getEingangY();
		if (WertX == true || WertY == true)
			ausgang = true;
		return ausgang;
	}
}