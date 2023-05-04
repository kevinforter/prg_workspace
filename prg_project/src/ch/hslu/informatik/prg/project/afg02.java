package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import ch.hslu.prg.leds.proxy.LedColor;
import java.util.Scanner;

public class afg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LedService service = new LedService();
		switchEvenOdd(service);
	}

	private static void switchEvenOdd(LedService service) {

		// Variablen definieren
		int anzahlLeds = 0;

		Scanner sc = new Scanner(System.in);


		// 1. Werte eingeben: Vielfaches von 16
		System.out.print("Geben Sie ein Vielfaches von 16 ein, welches aber nicht höher als 256 ist: ");
		anzahlLeds = sc.nextInt();

		// Ueberpruefung anzahlLEDs durch 16 teilbar
		if (anzahlLeds%16 == 0) {

		} else {		
			while (anzahlLeds%16 != 0 && anzahlLeds <= LedService.MAX_NUMBER_OF_LEDS && anzahlLeds >0) {
				System.out.print("Versuchen Sie es erneut. Geben Sie ein Vielfaches von 16 ein: ");
				anzahlLeds = sc.nextInt();
			}
		}

		// 2. Ausfuehrung für 2 Sekunden anhalten
		service.addLeds(anzahlLeds, LedColor.BLUE);
		service.stopExecutionFor(2000);


		// 3. alle Leds mit gerader Zahl eingeschaltet
		for(int i = 0; i <= anzahlLeds; i++) {
			if(i % 2 == 0) {
				service.turnLedOn(i);
			}	
		}

		// 4. Ausführung für 1 Sekunde anhalten
		service.stopExecutionFor(1000);	


		// 5. eingeschaltete LEDs ausschalten, ausgeschaltete einschalten
		for(int i = 0; i <= anzahlLeds; i++) {
			if(i % 2 == 0) {
				service.turnLedOff(i);
			} 
			if(i % 2 != 0 ) {
				service.turnLedOn(i);
			}
		}

		// 6. Ausfuehrung für 1 Sekunde anhalten
		service.stopExecutionFor(1000);


		// 7. alle LEDs ausschalten und Ausfuehrung anhalten
		for (int i = 0; i < anzahlLeds; i++) {
			service.turnLedOff(i);
		}
		service.stopExecutionFor(1000);


		// 8. letzte 5 Schritte 3x wiederholen, verschachtelte Schleife anwenden
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i <= anzahlLeds; i++) {
				if(i % 2 == 0) {
					service.turnLedOn(i);
				}	
			}
			service.stopExecutionFor(1000);	

			for (int i = 0; i <= anzahlLeds; i++) {
				if(i % 2 == 0) {
					service.turnLedOff(i);
				} 
				if(i % 2 != 0 ) {
					service.turnLedOn(i);
				}
			}
			service.stopExecutionFor(1000);

			for (int i = 0; i < anzahlLeds; i++) {
				service.turnLedOff(i);
			}
			service.stopExecutionFor(1000);
		}


		// 9. Anzeige zuruecksetzen
		service.reset();

	}
}
