package ch.hslu.informatik.prg.project;

import java.util.Scanner;
import ch.hslu.prg.leds.proxy.LedService;

public class afg06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LedService service = new LedService();
		showSquare(service);

	}
	private static void showSquare(LedService service) {

		// Variablen definieren
		int topLeft = 0; // Punkt
		int seitenLaenge = 0;
		int anzahlLeds;
		boolean isTrue;

		Scanner sc = new Scanner(System.in);


		// 1. max Anzahl LEDS hinzufuegen
		//int maxAnzahlLeds = LedService.MAX_NUMBER_OF_LEDS;
		service.addLeds(LedService.MAX_NUMBER_OF_LEDS);

		do {
			isTrue = false;
			while(isTrue == false) {	

				// 2. Nummer des LEDs einlesen, welches als Punkt topLeft fungieren soll
				System.out.print("Geben Sie eine Zahl zwischen 0 - 255 für den oberen linken Punkt ein: ");
				topLeft = sc.nextInt();

				// Zahl darf nicht > 255 sein
				if(topLeft >= 0 && topLeft <= 255) {
					isTrue = true;
				}
			}

			// 3. Laenge der Seite des Quadrats einlesen
			isTrue = false;
			while(isTrue == false) {
				System.out.print("Geben Sie eine Zahl zwischen 0 - 16 für die Seitenlänge des Quadrats ein: ");
				seitenLaenge = sc.nextInt();

				// Seitenlaenge darf nicht > 16 sein
				if(seitenLaenge <= 16 && seitenLaenge > 0) {
					isTrue = true;
				}
			}
		}

		while (topLeft / 16 != (topLeft -(seitenLaenge -1)) /16 || topLeft - (16 * (seitenLaenge-1)) < 0);


		// 4. Quadrat zeichnen und Rahmen einschalten

		// obere Seitenlaenge anzeigen
		int obereSeitenLaenge = 0;
		int a = topLeft;
		while (obereSeitenLaenge != seitenLaenge) {
			service.turnLedOn(a);
			a--;
			obereSeitenLaenge++;
		}

		// linke Seitenlaenge anzeigen
		int linkeSeitenLaenge = 0;
		int b = topLeft;
		while (linkeSeitenLaenge != seitenLaenge) {
			service.turnLedOn(b);
			b -= 16;
			linkeSeitenLaenge++;
		}

		// untere Seitenlaenge anzeigen
		int untereSeitenLaenge = 0;
		int bottomLeft = topLeft -16 * (seitenLaenge -1);
		int c = bottomLeft;
		while (untereSeitenLaenge != seitenLaenge) {
			service.turnLedOn(c);
			c--;
			untereSeitenLaenge++;
		}

		// rechte Seitenlaenge anzeigen lassen
		int rechteSeitenLaenge = 0;
		int topRight = topLeft - (seitenLaenge -1);
		int d = topRight;
		while (rechteSeitenLaenge != seitenLaenge) {
			service.turnLedOn(d);
			d -= 16;
			rechteSeitenLaenge++;
		}


		// 5. Ausfuehrung für 5 Sekunden anhalten
		service.stopExecutionFor(5000);

		
		// 6. Anzeige zuruecksetzen
		service.reset();
	}
}


