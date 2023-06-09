package ch.hslu.informatik.prg.project;

import java.util.Scanner;
import ch.hslu.prg.leds.proxy.LedService;

public class afg07 {

	public static int lenght;
	public static int bottomRight;
	public static int topLeft;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufruf Methode
		LedService service = new LedService();
		showRectangle(service);
	}

	// Impelementierung Methode
	public static void showRectangle(LedService service) {

		int summand = LedService.MAX_COLUMNS;

		Scanner sc = new Scanner(System.in);

		// 1.) Maximale Anz LED hinzufügen
		int max = LedService.MAX_NUMBER_OF_LEDS;
		service.addLeds(max);

		do {
			// 2.) Einlesen von topLeft
			System.out.print("Bitten geben Sie topLeft an (Max: 255): ");
			topLeft = sc.nextInt();

			if (topLeft <= max-1) {

			} else {		
				while (topLeft > max-1) {
					System.out.print("Die Zahl muss kleiner als 256 sein: ");
					topLeft = sc.nextInt();		
				}
			}

			// 3.) Einlesen von bottemRight

			System.out.print("Bitten geben Sie bottomRight an: ");
			bottomRight = sc.nextInt();

			// Ueberpruefung bottomRight kleiner als topLeft
			if (topLeft >= bottomRight && bottomRight >= 0) {

			} else {		
				while (topLeft < bottomRight || bottomRight < 0) {
					System.out.print("bottomRight muss kleiner als topLeft und groesser als 0 sein: ");
					bottomRight = sc.nextInt();		
				}
			}

			// Berechnung topRight und bottomLeft
			int topRight = 0;
			for ( int i = bottomRight; i < topLeft; i += summand) {
				topRight = i;
			}			
			lenght = topLeft - topRight;
		}
		while (topLeft / 16 != (topLeft -(lenght -1)) / 16);



		// 4.) Quadrat ausfüllen
		int i;
		int x = 0;
		for (i = bottomRight; i < topLeft; i++) {
			for(x = i; x <= topLeft; x += summand) {
				service.turnLedOn(x);
			}
			if(x == topLeft + summand) {
				break;
			}
		}


		// 5.) Methode 3 Sekunde anhalten
		service.stopExecutionFor(3000);	


		// 6.) Innere LEDs ausschalten
		// Innere Struktur definieren
		int innerBottomRight = (bottomRight + summand) + 1;
		int innerTopleft = (topLeft - summand) - 1;

		x = 0;
		for (i = innerBottomRight; i <= innerTopleft; i++) {
			for(x = i; x <= innerTopleft; x += summand) {
				service.turnLedOff(x);
			}
			if(x == innerTopleft + summand) {
				break;
			}
		}

		//		// Berechnung topRight und bottomLeft
		//		int topRight = 0;
		//		for ( int i = bottomRight; i < topLeft; i += summand) {
		//			topRight = i;
		//		}			
		//		int bottomLeft = (topLeft - topRight) + bottomRight;	
		//		int trueBottomLeft = bottomLeft;
		//
		//		// Lampen einschalten
		//		for ( int i = bottomRight; i < topLeft; i += summand) {
		//
		//			for ( int j = i; j <= bottomLeft; j++) {
		//				service.turnLedOn(j);
		//			}
		//			bottomLeft += summand;
		//		}

		//		int innerBottomRight = bottomRight + summand + 1;
		//		int innerBottomLeft = trueBottomLeft + summand - 1;
		//		int innerTopleft = topLeft - summand - 1;
		//
		//		// Lampen ausschalten
		//		for ( int i = innerBottomRight; i <= innerTopleft; i += summand) {
		//
		//			for ( int j = i; j <= innerBottomLeft; j++) {
		//				service.turnLedOff(j);
		//			}
		//			innerBottomLeft += summand;
		//		}


		// 7.) Methode 3 Sekunde anhalten
		service.stopExecutionFor(3000);


		// 8.) Anzeige zuruechsetzen
		service.reset();

	}
}
