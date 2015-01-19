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

		boolean ausgabe = true;
		
		if(eingabe == null) {
			ausgabe = false;
			return ausgabe;
		}
		if(eingabe == "") {
			return ausgabe;
		}	
		for(int a=0,e=eingabe.length()-1; a<e; a++,e--) {
			eingabe = eingabe.toLowerCase();
			if(eingabe.charAt(a)!=eingabe.charAt(e)) {
                ausgabe = false;
            	return ausgabe;
            }
        }
		
		return ausgabe;
		
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

boolean ausgabe = true;
		
		if(eingabe == null) {
			ausgabe = false;
			return ausgabe;
		}
		eingabe = eingabe.toLowerCase();
		eingabe = eingabe.replace(" ", "");
		eingabe = eingabe.replace(",", "");
		eingabe = eingabe.replace(".", "");
		eingabe = eingabe.replace("!", "");
		eingabe = eingabe.replace("?", "");
		eingabe = eingabe.replace(":", "");
		eingabe = eingabe.replace(";", "");
		for(int a=0,e=eingabe.length()-1; a<e; a++,e--) {
			if(eingabe.charAt(a)!=eingabe.charAt(e)) {
                ausgabe = false;
            	return ausgabe;
            }
        }
		
		return ausgabe;
	}
}