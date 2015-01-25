import static org.junit.Assert.*;

import org.junit.Test;


public class SchaltnetzTest {

	@Test
	public void testEvalBooleanBoolean() {
		
		//  Erzeuge ein Schaltnetz zum Testen.
		Schaltnetz meinNetz = new Schaltnetz();
		
		//  Erzeuge einen OR-Baustein.
		//  Erzeuge einen AND-Baustein.
		SchaltbausteinOR  or  = new SchaltbausteinOR();
		SchaltbausteinAND and = new SchaltbausteinAND();

		//  Verbinde den x-Eingang des OR-Bausteins mit dem Ausgang des AND-Bausteins.
		//  Verbinde den y-Eingang des OR-Bausteins mit dem y-Eingang des Schaltnetzes.
		or.setEingangX(and);
		or.setEingangY(meinNetz.getEingangY());

		//  Verbinde den x-Eingang des AND-Bausteins mit dem x-Eingang des Schaltnetzes.
		//  Verbinde den y-Eingang des AND-Bausteins mit dem y-Eingang des Schaltnetzes.
		and.setEingangX(meinNetz.getEingangX());
		and.setEingangY(meinNetz.getEingangY());

		//  Verbinde des Ausgang des Schaltnetzes mit dem Ausgang des OR-Bausteins.
		meinNetz.setAusgang(or);

		// Teste Schaltnetz 1 fuer TRUE/TRUE.
		assertEquals("Schaltnetz 1 wertet fuer TRUE/TRUE nicht korrekt aus.",
				true,
				meinNetz.werteAus(true,true));

		// Teste Schaltnetz 1 fuer TRUE/FALSE.
		assertEquals("Schaltnetz 1 wertet fuer TRUE/FALSE nicht korrekt aus.",
				false,
				meinNetz.werteAus(true,false));

		// Teste Schaltnetz 1 fuer FALSE/TRUE.
		assertEquals("Schaltnetz 1 wertet fuer FALSE/TRUE nicht korrekt aus.",
				true,
				meinNetz.werteAus(false,true));

		// Teste Schaltnetz 1 fuer FALSE/FALSE.
		assertEquals("Schaltnetz 1 wertet fuer FALSE/FALSE nicht korrekt aus.",
				false,
				meinNetz.werteAus(false,false));

		//  Erzeuge einen NOT-Baustein.
		SchaltbausteinNOT not = new SchaltbausteinNOT();

		//  Verbinde den Eingang des NOT-Bausteins mit dem Ausgang des OR-Bausteins.
		not.setEingang(or);
		
		//  Verbinde des Ausgang des Schaltnetzes mit dem Ausgang des NOT-Bausteins.
		meinNetz.setAusgang(not);

		// Teste Schaltnetz 2 fuer TRUE/TRUE.
		assertEquals("Schaltnetz 2 wertet fuer TRUE/TRUE nicht korrekt aus.",
				false,
				meinNetz.werteAus(true,true));

		// Teste Schaltnetz 2 fuer TRUE/FALSE.
		assertEquals("Schaltnetz 2 wertet fuer TRUE/FALSE nicht korrekt aus.",
				true,
				meinNetz.werteAus(true,false));

		// Teste Schaltnetz 2 fuer FALSE/TRUE.
		assertEquals("Schaltnetz 2 wertet fuer FALSE/TRUE nicht korrekt aus.",
				false,
				meinNetz.werteAus(false,true));

		// Teste Schaltnetz 2 fuer FALSE/FALSE.
		assertEquals("Schaltnetz 2 wertet fuer FALSE/FALSE nicht korrekt aus.",
				true,
				meinNetz.werteAus(false,false));

	}

}