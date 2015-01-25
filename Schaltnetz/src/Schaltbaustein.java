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
	
	public class SchaltbausteinOR extends Schaltbaustein {
		public SchaltbausteinOR() {
			if (WertX == true || WertY == true)
				ausgang = true;
		}

		@Override
		public boolean werteAus() {
			// TODO Auto-generated method stub
			return false;
		}
	}
	public class SchaltbausteinAND extends Schaltbaustein {	
		public SchaltbausteinAND() {
			if (WertX == true && WertY == true)
				ausgang = true;
		}

		@Override
		public boolean werteAus() {
			// TODO Auto-generated method stub
			return false;
		}
	}
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
}