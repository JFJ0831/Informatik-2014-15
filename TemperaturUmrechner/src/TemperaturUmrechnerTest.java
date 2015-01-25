import static org.junit.Assert.*;

import org.junit.Test;

public class TemperaturUmrechnerTest {

	/*
	 * Erzeugen Sie hier Objekte, die die folgenden 
	 * Temperaturen repraesentieren
	 
	 	nullGradCelsius 					= // Eine Temperatur in Grad Celsius, Wert: 0.
	 	Celsius nullGradCelsius 			= new Celsius(0)
		zehnGradCelsius 					= // Eine Temperatur in Grad Celsius, Wert: 10.
		Celsius zehnGradCelsius 			= new Celsius(10)
	
 		nullGradFahrenheit    				= // Eine Temperatur in Grad Fahrenheit, Wert: 0.
 		Fahrenheit nullGradFahrenheit 		= new Fahrenheit(0)
 		zwanzigGradFahrenheit 				= // Eine Temperatur in Grad Fahrenheit, Wert: 20.
 		Fahrenheit zwanzigGradFahrenheit 	= new Fahrenheit(20)

		nullKelvin    						= // Eine Temperatur in Kelvin, Wert: 0.
		Kelvin nullKelvin 					= new Kelvin(0)
		zehnKelvin    						= // Eine Temperatur in Kelvin, Wert: 0.
		Kelvin zehnKelvin 					= new Kelvin(10)
		zwanzigKelvin 						= // Eine Temperatur in Kelvin, Wert: 0.
		Kelvin zwanzigKelvin 				= new Kelvin(20)
      */
	
	double epsilon = 0.01; // Rundungstoleranz.
	
	@Test
	public void testNachKelvin() {
		// Erzeuge ein Objekt zum Testen.
		TemperaturUmrechner einTemperaturUmrechner = new TemperaturUmrechner();
		
		// Teste Identitaet.
		assertEquals("Es wurde nicht das identische Objekt zurueckgeliefert.",
				nullKelvin,
				einTemperaturUmrechner.nachKelvin(nullKelvin));
		
		// Teste Umrechnung von Grad Fahrenheit nach Kelvin.
		assertEquals("Umrechnung Grad Fahrenheit -> Kelvin ist nicht korrekt.",
				266.48,
				einTemperaturUmrechner.nachKelvin(zwanzigGradFahrenheit).getWert(),
				epsilon);

		// Teste Umrechnung von Grad Celsius nach Kelvin.
		assertEquals("Umrechnung Grad Celsius -> Kelvin ist nicht korrekt.",
				283.15,
				einTemperaturUmrechner.nachKelvin(zehnGradCelsius).getWert(),
				epsilon);
	}

	@Test
	public void testNachGradFahrenheit() {
		// Erzeuge ein Objekt zum Testen.
		TemperaturUmrechner einTemperaturUmrechner = new TemperaturUmrechner();
		
		// Teste Identitaet.
		assertEquals("Es wurde nicht das identische Objekt zurueckgeliefert.",
				zwanzigGradFahrenheit,
				einTemperaturUmrechner.nachGradFahrenheit(zwanzigGradFahrenheit));
		
		// Teste Umrechnung von Kelvin nach Grad Fahrenheit.
		assertEquals("Umrechnung Kelvin -> Grad Fahrenheit ist nicht korrekt.",
				-423.67,
				einTemperaturUmrechner.nachGradFahrenheit(zwanzigKelvin).getWert(),
				epsilon);

		// Teste Umrechnung von Grad Celsius nach Grad Fahrenheit.
		assertEquals("Umrechnung Grad Celsius -> Grad Fahrenheit ist nicht korrekt.",
				32,
				einTemperaturUmrechner.nachGradFahrenheit(nullGradCelsius).getWert(),
				epsilon);
	}

	@Test
	public void testNachGradCelsius() {
		// Erzeuge ein Objekt zum Testen.
		TemperaturUmrechner einTemperaturUmrechner = new TemperaturUmrechner();
		
		// Teste Identitaet.
		assertEquals("Es wurde nicht das identische Objekt zurueckgeliefert.",
				zehnGradCelsius,
				einTemperaturUmrechner.nachGradCelsius(zehnGradCelsius));
		
		// Teste Umrechnung von Kelvin nach Grad Celsius.
		assertEquals("Umrechnung Kelvin -> Grad Celsius ist nicht korrekt.",
				-263.15,
				einTemperaturUmrechner.nachGradCelsius(zehnKelvin).getWert(),
				epsilon);

		// Teste Umrechnung von Grad Fahrenheit nach Grad Celsius.
		assertEquals("Umrechnung Grad Fahrenheit -> Grad Celsius ist nicht korrekt.",
				-17.78,
				einTemperaturUmrechner.nachGradCelsius(nullGradFahrenheit).getWert(),
				epsilon);
	}

}