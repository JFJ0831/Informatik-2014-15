public class SchaltbausteinAND extends Schaltbaustein {	
	
	public SchaltbausteinAND() {

	}
		
	@Override
	public boolean werteAus() {
		this.WertX = getEingangX();
		this.WertY = getEingangY();
		if (WertX == true && WertY == true)
			ausgang = true;
		return ausgang;
	}
}