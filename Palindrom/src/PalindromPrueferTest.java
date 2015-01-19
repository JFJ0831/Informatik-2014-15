import static org.junit.Assert.*;

import org.junit.Test;


/**
 * The Class PalindromPrueferTest.
 */
public class PalindromPrueferTest {

	/**
	 * Test ist palindrom.
	 */
	@Test
	public void testIstPalindrom() {
		// Erzeuge ein Objekt zum Testen.
		PalindromPruefer einPalindromPruefer = new PalindromPruefer();
		
		// Teste die null-Referenz.
		String text = null;		
		assertEquals("null-Referenz wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));

		// Teste Zeichenkette der Laenge 0.
		text = "";		
		assertEquals("String der Laenge 0 wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istPalindrom(text));
		
		// Teste Zeichenkette der Laenge 1.
		text = "A";		
		assertEquals("String der Laenge 1 wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die kein Palindrom ist.
		text = "ANANAS";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die kein Palindrom ist.
		text = "TIMO";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die ein Palindrom ist.
		text = "ANNA";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istPalindrom(text));

		// Teste Zeichenkette mit ungerader Anzahl Buchstaben, die ein Palindrom ist.
		text = "RADAR";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istPalindrom(text));
		
		// Teste Zeichenkette mit Gross- und Kleinbuchstaben, die kein Palindrom ist.
		text = "Paul";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));
		
		// Teste Zeichenkette mit Gross- und Kleinbuchstaben, die ein Palindrom ist.
		text = "Radar";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istPalindrom(text));
				
		// Teste Satz, der ein Palindrom ist.
		text = "Vitaler Nebel mit Sinn ist im Leben relativ.";		
		assertEquals("Satzpalindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));
		
		// Teste Satz, der kein Palindrom ist.
		text = "Rise, please, sir.";		
		assertEquals("Nicht-Satzpalindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));

		// Teste Satz, der ein Palindrom ist.
		text = "Rise to vote, sir.";		
		assertEquals("Satzpalindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istPalindrom(text));

	}

	/**
	 * Test ist satz palindrom.
	 */
	@Test
	public void testIstSatzPalindrom() {
		// Erzeuge ein Objekt zum Testen.
		PalindromPruefer einPalindromPruefer = new PalindromPruefer();
		
		// Teste die null-Referenz.
		String text = null;		
		assertEquals("null-Referenz wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Zeichenkette der Laenge 1.
		text = "A";		
		assertEquals("String der Laenge 1 wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die kein Palindrom ist.
		text = "ANANAS";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die kein Palindrom ist.
		text = "TIMO";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Zeichenkette mit gerader Anzahl Buchstaben, die ein Palindrom ist.
		text = "ANNA";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Zeichenkette mit ungerader Anzahl Buchstaben, die ein Palindrom ist.
		text = "RADAR";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));
		
		// Teste Zeichenkette mit Gross- und Kleinbuchstaben, die kein Palindrom ist.
		text = "Paul";		
		assertEquals("Nicht-Palindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istSatzPalindrom(text));
		
		// Teste Zeichenkette mit Gross- und Kleinbuchstaben, die ein Palindrom ist.
		text = "Radar";		
		assertEquals("Palindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));
		
		// Teste Satz, der ein Palindrom ist.
		text = "Vitaler Nebel mit Sinn ist im Leben relativ.";		
		assertEquals("Satzpalindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));
		
		// Teste Satz, der ein Palindrom ist.
		text = "A man, a plan, a canal. Panama.";		
		assertEquals("Satzpalindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));
		
		// Teste Satz, der kein Palindrom ist.
		text = "Rise, please, sir.";		
		assertEquals("Nicht-Satzpalindrom wurde nicht korrekt verarbeitet.",
				false,
				einPalindromPruefer.istSatzPalindrom(text));

		// Teste Satz, der ein Palindrom ist.
		text = "Rise to vote, sir.";		
		assertEquals("Satzpalindrom wurde nicht korrekt verarbeitet.",
				true,
				einPalindromPruefer.istSatzPalindrom(text));

	}
}