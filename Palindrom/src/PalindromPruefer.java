/**
 * Ueberpruefung der Eigenschaft, ein Palindrom zu sein.
 */
public class PalindromPruefer {

	/**
	 * Ueberpruefe, ob die uebergebene Zeichenkette
	 * ein Palindrom ist. Hierbei soll nicht zwischen Gross- und
	 * Kleinbuchstaben unterschieden werden.
	 * @param eingabe Zu testende Zeichenkette.
	 * @return <CODE>true</CODE>, wenn die Zeichenkette ein Palindrom
	 *         ist, <CODE>false</CODE> sonst.
	 */
	public boolean istPalindrom(String eingabe) {

		boolean ausgabe = true;									// Es wird von einem Palindrom ausgegangen.
		
		if(eingabe == null) {									// Für eine null Eingabe wird die
			ausgabe = false;									// Ausgabe auf false (Kein Palindrom) gesetzt. 
			return ausgabe;
		}
		if(eingabe == "") {										// Hier wird die Zeichenkette der Länge 0 herausgefiltert.
			return ausgabe;
		}
		eingabe = eingabe.toLowerCase();						// Umwandlung der Zeichenkette in eine Zeichenkette 
																// bestehend nur aus Kleinbuchstaben.
		for(int a=0,e=eingabe.length()-1; a<e; a++,e--) {		// Setzen der Variablen a (Anfang Zeichenkette) auf 0 und der Variablen 
																// e (Ende Zeichenkette) auf die Länge der eingegebenen Zeichenkette -1, 
																// da dies der Indexwert des letzten Zeichens ist. 
																// Solange a kleiner e ist, wird a um eins erhöht und e um eins verringert.
			if(eingabe.charAt(a)!=eingabe.charAt(e)) {			// Falls a einmal nicht mit e uebereinstimmt wird
                ausgabe = false;								// die Ausgabe auf false (Kein-Palindrom) gesetzt.
            	return ausgabe;
            }
        }
		
		return ausgabe;											// Ist a nicht (mehr) kleiner als e so wird true (Palindrom) ausgegeben.
		
	}

	/**
	 * Ueberpruefe, ob die uebergebene Zeichenkette
	 * ein Satzpalindrom ist. Hierbei soll nicht zwischen Gross- und
	 * Kleinbuchstaben unterschieden werden.
	 * @param eingabe Zu testende Zeichenkette.
	 * @return <CODE>true</CODE>, wenn die Zeichenkette ein Palindrom
	 *         ist, <CODE>false</CODE> sonst.
	 */
	public boolean istSatzPalindrom(String eingabe) {

		boolean ausgabe = true;									// Es wird von einem Palindrom ausgegangen.
		
		if(eingabe == null) {									// Für eine null Eingabe wird die
			ausgabe = false;									// Ausgabe auf false (Kein Palindrom) gesetzt.
			return ausgabe;
		}
		eingabe = eingabe.toLowerCase();						// Umwandlung der Zeichenkette in eine Zeichenkette bestehend
		eingabe = eingabe.replace(" ", "");						// nur aus Kleinbuchstaben und ohne übliche Interpunktionszeichen. 
		eingabe = eingabe.replace(",", "");
		eingabe = eingabe.replace(".", "");
		eingabe = eingabe.replace("!", "");
		eingabe = eingabe.replace("?", "");
		eingabe = eingabe.replace(":", "");
		eingabe = eingabe.replace(";", "");
		
		for(int a=0,e=eingabe.length()-1; a<e; a++,e--) {		// Setzen der Variablen a (Anfang Zeichenkette) auf 0 und der Variablen 
																// e (Ende Zeichenkette) auf die Länge der eingegebenen Zeichenkette -1, 
																// da dies der Indexwert des letzten Zeichens ist. 
																// Solange a kleiner e ist, wird a um eins erhöht und e um eins verringert.
			if(eingabe.charAt(a)!=eingabe.charAt(e)) {			// Falls a einmal nicht mit e uebereinstimmt wird
				ausgabe = false;								// die Ausgabe auf false (Kein-Palindrom) gesetzt.
				return ausgabe;
			}
		}
		
		return ausgabe;
	}
}