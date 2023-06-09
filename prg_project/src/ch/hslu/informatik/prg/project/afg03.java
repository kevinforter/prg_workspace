package ch.hslu.informatik.prg.project;

import java.util.Scanner;
import java.util.Random;
import ch.hslu.prg.leds.proxy.LedService;
import ch.hslu.prg.leds.proxy.LedColor;

public class afg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufruf Methode
		LedService service = new LedService();
		switchRandom(service);
	}

	// Impelementierung Methode
	public static void switchRandom(LedService service) {

		service.setDelayInMillis(50);
		
		// Variablen
		int half;

		// Erstellung Scanner
		Scanner sc = new Scanner(System.in);


		// 1.) Einlesen eines Vielfachen von 16	
		System.out.print("Geben Sie eine Zahl eines Vielfachen von 16 ein: ");
		int anzahlLED = sc.nextInt();

		// Ueberpruefung anzahlLED/16 teilbar
		if (anzahlLED%16 == 0) {

		} else {		
			while (anzahlLED%16 != 0) {
				System.out.print("Du pisser, geben Sie eine neue Zahl ein: ");
				anzahlLED = sc.nextInt();		
			}
		}


		// 2.) LEDs dem Steckboard hinzufügen und 2 Sekunden anhalten
		service.addLeds(anzahlLED, LedColor.RANDOM);				
		service.stopExecutionFor(2000);

		Random random = new Random();
		
		// 8.) Schritte 3 - 8, 3x wiederholen
		for (int c = 0; c <= 3; c++) {
			
			
			// 3.) Haelfte aller LEDs mit java.util.Random einschalten
			half = anzahlLED / 2;
			int sizeFull = anzahlLED;		

			// Erstellung Array und Random Obj
			int[] arr = new int[sizeFull];

			for (int i = 0; i < arr.length; i++) {
				int randomNummer;

				boolean exklusiv = false;
				do {
					// Zufaellige Nummer erstellen
					randomNummer = random.nextInt(anzahlLED); 

					// Ueberpruefen ob Nummer schon existiert
					exklusiv = true;
					for (int x = 0; x < i; x++) {
						if (randomNummer == arr[x]) {
							exklusiv = false;
							break;
						}
					}
				} while (!exklusiv);        

				// Random Nummer in Array hinzufuegen
				arr[i] = randomNummer;
			}

			// Lampen anschalten
			for (int i = 0; i < half; i++) {
				service.turnLedOn(arr[i]);
			}


			// 4.) Methode 1 Sekunde anhalten
			service.stopExecutionFor(1000);


			// 5.) Switch LedON / LedOFF
			for (int i = 0; i < arr.length; i++) {
				if (service.isOn(arr[i])) {
					service.turnLedOff(arr[i]);
				} else {
					service.turnLedOn(arr[i]);
				}
			}


			// 6.) Methode 1 Sekunde anhalten
			service.stopExecutionFor(1000);


			// 7.) Alle LEDs ausschalten und 1 Sekunde anhalten
			for (int i = 0; i < arr.length; i++) {
				if (service.isOn(arr[i])) {
					service.turnLedOff(arr[i]);
				}
			}
			service.stopExecutionFor(1000);

		}
		
		// 9.) Anzeige zuruechsetzen
		service.reset();
	}
}
