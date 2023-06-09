package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import ch.hslu.prg.leds.proxy.LedColor;

import java.util.Scanner;
import java.util.Random;

public class ClientApp {

	// Erstellung von Objekten
	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();

	// Wiederverwendete Variablen
	private static int countLeds;
	private static int countTriangleLeds;
	private static int countRepetitions;
	
	private static int topLeft;
	private static int topRight;
	private static int bottomRight;
	private static int bottomLeft;
	private static int sideLength;
	
	private static final int summand = 16;

	private static final int maxLeds = LedService.MAX_NUMBER_OF_LEDS;
	private static final int maxColumns = LedService.MAX_COLUMNS;
	private static final int maxRows = LedService.MAX_ROWS;

	private static boolean isTrue;

	private static String binaryString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Erstellung Instanzen
		LedService service = new LedService();

		// Aufruf Methoden
		/* Aufgabe 1  */ ledsOnOff(service);
//		/* Aufgabe 2  */ switchEvenOdd(service);
//		/* Aufgabe 3  */ switchRandom(service);
//		/* Aufgabe 4  */ showBinary(service);
//		/* Aufgabe 5  */ showBorder(service);
//		/* Aufgabe 6  */ showSquare(service);
//		/* Aufgabe 7  */ showRectangle(service);
//		/* Aufgabe 8  */ showTriangle(service);
//		/* Aufgabe 9  */ siebDesEratosthenes(service);
//		/* Aufgabe 10 */ countColor(service);
	}

	// Aufgabe 1 //
	private static void ledsOnOff(LedService service) {
		
		/* Anzahl LEDs einlesen und ausgeben
		 * Kontrolle ob Wertebereich eingehalten ist (1 - 256)
		 */
		
		System.out.print("Anzahl LEDs eingeben [0 - 256]: ");
		countLeds = sc.nextInt();
		
		if(countLeds >= 0 && countLeds <= 256) {
	
		} else {
			while(countLeds < 0 || countLeds > 256) {
				System.out.print("Anzahl LEDs eingeben [0 - 256]: ");
				countLeds = sc.nextInt();
			}
			
		}
		service.addLeds(countLeds, LedColor.RANDOM);
		service.stopExecutionFor(2000);
		
		// LEDs von rechts nach links einschalten
		for(int x = 0; x <= countLeds; x++) {
			service.turnLedOn(x);
			service.setDelayInMillis(50);
		}
		
		service.stopExecutionFor(250);
		
		// LEDs von links nach rechts ausschalten
		for(int y = countLeds; y >= 0; y--) {
			service.turnLedOff(y);
			service.setDelayInMillis(50);
		}
		
		service.stopExecutionFor(250);
		
		// LEDs ein- und ausschalten (3 Wiederholungen)
		for(int i = 0; i < 3; i++) {
			for(int x = 0; x <= countLeds; x++) {
				service.turnLedOn(x);
				service.setDelayInMillis(50);
			}
			
			service.stopExecutionFor(250);
			
			for(int y = countLeds; y >= 0; y--) {
				service.turnLedOff(y);
				service.setDelayInMillis(50);
			}
			
			service.stopExecutionFor(250);
		}
		
		// Halten und Zurücksetzen
		service.stopExecutionFor(2000);
		
		service.reset();
	}
	
	// Aufgabe 2 //
	private static void switchEvenOdd(LedService service) {

		// 1. Werte eingeben: Vielfaches von 16
		System.out.print("Geben Sie ein Vielfaches von 16 ein [0 - 256]: ");
		countLeds = sc.nextInt();

		// Ueberpruefung anzahl LEDs durch 16 teilbar
		if (countLeds%16 == 0 && countLeds <= maxLeds && countLeds >= 0) {

		} else {		
			while (countLeds%16 != 0 || countLeds > maxLeds || countLeds < 0) {
				System.out.print("Geben Sie ein Vielfaches von 16 ein [0 - 256]: ");
				countLeds = sc.nextInt();
			}
		}

		// 2. Ausfuehrung für 2 Sekunden anhalten
		service.addLeds(countLeds, LedColor.BLUE);
		service.stopExecutionFor(2000);

		// 3. alle Leds mit gerader Zahl eingeschaltet
		for(int i = 0; i <= countLeds; i++) {
			if(i % 2 == 0) {
				service.turnLedOn(i);
			}	
		}

		// 4. Ausführung für 1 Sekunde anhalten
		service.stopExecutionFor(1000);	

		// 5. eingeschaltete LEDs ausschalten, ausgeschaltete einschalten
		for(int i = 0; i <= countLeds; i++) {
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
		for (int i = 0; i < countLeds; i++) {
			service.turnLedOff(i);
		}
		service.stopExecutionFor(1000);

		// 8. letzte 5 Schritte 3x wiederholen, verschachtelte Schleife anwenden
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i <= countLeds; i++) {
				if(i % 2 == 0) {
					service.turnLedOn(i);
				}	
			}
			service.stopExecutionFor(1000);	

			for (int i = 0; i <= countLeds; i++) {
				if(i % 2 == 0) {
					service.turnLedOff(i);
				} 
				if(i % 2 != 0 ) {
					service.turnLedOn(i);
				}
			}
			service.stopExecutionFor(1000);

			for (int i = 0; i < countLeds; i++) {
				service.turnLedOff(i);
			}
			service.stopExecutionFor(1000);
		}

		// 9. Anzeige zuruecksetzen
		service.reset();
	}

	// Aufgabe 3 //
	public static void switchRandom(LedService service) {

		// Methoden relevante Var
		int randomNummer;
		boolean exklusiv;
		int halfSize;
		int fullSize;

		service.setDelayInMillis(50);

		// 1.) Einlesen eines Vielfachen von 16	
		System.out.print("Geben Sie ein Vielfaches von 16 ein [0 - 256]: ");
		countLeds = sc.nextInt();

		// Ueberpruefung countLeds/16 teilbar
		if (countLeds%16 == 0 && countLeds <= maxLeds && countLeds >= 0) {

		} else {		
			while (countLeds%16 != 0 || countLeds > maxLeds || countLeds < 0) {
				System.out.print("Geben Sie ein Vielfaches von 16 ein [0 - 256]: ");
				countLeds = sc.nextInt();		
			}
		}

		// 2.) LEDs dem Steckboard hinzufügen und 2 Sekunden anhalten
		service.addLeds(countLeds, LedColor.RANDOM);				
		service.stopExecutionFor(2000);

		// 8.) Schritte 3 - 8, 3x wiederholen
		for (int c = 0; c <= 3; c++) {

			// 3.) Haelfte aller LEDs mit java.util.Random einschalten
			halfSize = countLeds / 2;
			fullSize = countLeds;		

			// Erstellung Array
			int[] arr = new int[fullSize];

			for (int i = 0; i < arr.length; i++) {	
				exklusiv = false;			
				do {
					// Zufaellige Nummer erstellen
					randomNummer = random.nextInt(countLeds); 

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
			for (int i = 0; i < halfSize; i++) {
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

	// Aufgabe 4 //
	private static void showBinary(LedService service) {

		// Methoden relevante Var
		char characterAt;
		int countLedsOctets;

		// 1.) Positive ganze Zahl einlesen
		isTrue = false;
		while(isTrue == false) {

			// Anzahl LEDs abfragen
			System.out.print("Geben Sie eine ganze positive Zahl ein: ");
			countLeds = sc.nextInt();

			// Ueberpruefung Nummer
			if(countLeds > 0) {
				isTrue = true;
			}
		}

		// 2.) eingelesene dezimale Zahl in eine Binärzahl umwandeln
		ClientApp.getBinaryString(countLeds);

		// 3.) LEDs hinzufuegen
		// Laenge von Binary String
		countLeds = binaryString.length();

		countLedsOctets = countLeds;
		isTrue = false;
		while(isTrue == false) {
			countLedsOctets++;
			if(countLedsOctets%8 == 0) {
				isTrue = true;
			}
		}
		service.addLeds(countLedsOctets);

		// 4.) LEDs einschalten
		for(int i = 0; i < countLeds; i++) {
			characterAt = binaryString.charAt(i);

			if(characterAt == '1') {
				service.turnLedOn(countLeds -1 -i);
			}	
		}		
		service.stopExecutionFor(5000);		
		service.reset();		
	}	

	// Aufgabe 4 // getBinaryString Methode
	private static String getBinaryString(int numberToConvert) {

		// 2.) eingelesene dezimale Zahl in eine Binärzahl umwandeln
		binaryString = Integer.toBinaryString(numberToConvert);
		return binaryString;
	}
	
	// Aufgabe 5 //
	private static void showBorder(LedService service) {
		
		// Methoden relevante Var
		int topRight = 240;
		int topLeft = 255;
		int i;
		bottomLeft = 15;
		
		// LEDs hinzufügen
		service.addLeds(maxLeds, readLedColor());
		
		service.stopExecutionFor(2000);
		
		// Alle LEDs die sich am äusseren Rand befinden einschalten
		i = 0;
		while(i < maxLeds) {
			if(i <= bottomLeft || (i >= topRight && i <= topLeft)){
				service.turnLedOn(i);
				service.setDelayInMillis(50);
			}
			for(int x = i; x < maxLeds; x++) {
				if(x % summand == bottomRight || x % summand == bottomLeft) {
					service.turnLedOn(x);
					service.setDelayInMillis(50);
				} else {
					break;
				}
			}
			i++;
		}
		
		service.stopExecutionFor(5000);
		
		// LEDs wieder ausschalten
		i = 0;
		while(i < maxLeds) {
			if(i <= bottomLeft || (i >= topRight && i <= topLeft)){
				service.turnLedOff(i);
				service.setDelayInMillis(50);
			}
			for(int x = i; x < maxLeds; x++) {
				if(x % summand == bottomRight || x % summand == bottomLeft) {
					service.turnLedOff(x);
					service.setDelayInMillis(50);
				} else {
					break;
				}
			}
			i++;
		}
		
		// Halten und Zurücksetzen
		service.stopExecutionFor(2000);	
		service.reset();	
	}
	
	// Aufgabe 5 // readLedColor Methode
	private static LedColor readLedColor() {
		
		// Methoden relevante Var
		int gewünschteFarbe;
		LedColor farbe = null;
		
		/* Farbenauswahl ausgeben und einlesen
		 * Kontrolle ob Wertebereich eingehalten ist (1 - 5)
		 */
		System.out.print("Folgende Farben stehen zur Auswahl:\n1 Rot\n2 Blau\n3 Gelb\n4 Grün\n5 Zufall\nBitte eine der oben genannten Optionen wählen (1 - 5): ");
		gewünschteFarbe = sc.nextInt();
		
		if(gewünschteFarbe > 0 && gewünschteFarbe <= 5) {
			
		} else {
			while(gewünschteFarbe <= 0 || gewünschteFarbe > 5) {
				System.out.print("Bitte geben Sie eine neue Zahl zwischen 1 und 5 ein: ");
				gewünschteFarbe = sc.nextInt();
			}
		}
		
		// gewünschte Farbe gemäss Auswahl zurückgeben
		switch(gewünschteFarbe) {
		
		case 1: farbe = LedColor.RED; break;
		case 2: farbe = LedColor.BLUE; break;
		case 3: farbe = LedColor.YELLOW; break;
		case 4: farbe = LedColor.GREEN; break;
		case 5: farbe = LedColor.RANDOM; break;
		}
		return farbe;
		
	}

	// Aufgabe 6 //
	private static void showSquare(LedService service) {

		// Methoden relevante Var
		int topSideLength = 0;
		int leftSideLength = 0;
		int lowerSideLength = 0;
		int rightSideLength = 0;
		int a;
		int b;
		int c;
		int d;

		// 1. max Anzahl LEDS hinzufuegen
		service.addLeds(maxLeds);

		do {
			isTrue = false;
			while(isTrue == false) {	

				// 2. Nummer des LEDs einlesen, welches als Punkt topLeft fungieren soll
				System.out.print("Geben Sie Punkt topLeft an [0 - 255]: ");
				topLeft = sc.nextInt();

				// Zahl darf nicht > 255 sein
				if(topLeft >= 0 && topLeft <= 255) {
					isTrue = true;
				}
			}

			// 3. Laenge der Seite des Quadrats einlesen
			isTrue = false;
			while(isTrue == false) {
				System.out.print("Geben Sie die Seitenlänge des Quadrats ein [0 - 16]: ");
				sideLength = sc.nextInt();

				// Seitenlaenge darf nicht > 16 sein
				if(sideLength <= 16 && sideLength > 0) {
					isTrue = true;
				}
			}
		}
		while (topLeft / 16 != (topLeft -(sideLength -1)) /16 || topLeft - (16 * (sideLength-1)) < 0);

		// 4. Quadrat zeichnen und Rahmen einschalten

		// obere Seitenlaenge anzeigen
		a = topLeft;
		while (topSideLength != sideLength) {
			service.turnLedOn(a);
			a--;
			topSideLength++;
		}

		// linke Seitenlaenge anzeigen		
		b = topLeft;
		while (leftSideLength != sideLength) {
			service.turnLedOn(b);
			b -= 16;
			leftSideLength++;
		}

		// untere Seitenlaenge anzeigen		
		bottomLeft = topLeft -16 * (sideLength -1);
		c = bottomLeft;
		while (lowerSideLength != sideLength) {
			service.turnLedOn(c);
			c--;
			lowerSideLength++;
		}

		// rechte Seitenlaenge anzeigen lassen		
		topRight = topLeft - (sideLength -1);
		d = topRight;
		while (rightSideLength != sideLength) {
			service.turnLedOn(d);
			d -= 16;
			rightSideLength++;
		}

		// 5. Ausfuehrung für 5 Sekunden anhalten
		service.stopExecutionFor(5000);

		// 6. Anzeige zuruecksetzen
		service.reset();
	}

	// Aufgabe 7 //
	// Aufgabe 7 //
	public static void showRectangle(LedService service) {

		// Methoden relevante Var
		int innerBottomRight;
		int innerTopleft;
		int x;

		// 1.) Maximale Anz LED hinzufügen
		service.addLeds(maxLeds);

		do {
			// 2.) Einlesen von topLeft
			System.out.print("Geben Sie Punkt topLeft an [0 - 255]: ");
			topLeft = sc.nextInt();

			if (topLeft < maxLeds && topLeft >= 0) {

			} else {		
				while (topLeft >= maxLeds || topLeft < 0) {
					System.out.print("Geben Sie Punkt topLeft an [0 - 255]: ");
					topLeft = sc.nextInt();		
				}
			}

			// 3.) Einlesen von bottemRight
			System.out.print("Geben Sie Punkt bottomRight an [0 - 255]: ");
			bottomRight = sc.nextInt();

			// Ueberpruefung bottomRight kleiner als topLeft
			if (topLeft >= bottomRight && bottomRight >= 0) {

			} else {		
				while (topLeft < bottomRight || bottomRight < 0) {
					System.out.print("Geben Sie Punkt bottomRight an [0 - 255]: ");
					bottomRight = sc.nextInt();		
				}
			}

			// Berechnung topRight und bottomLeft
			for ( int i = bottomRight; i < topLeft; i += summand) {
				topRight = i;
			}			
			sideLength = topLeft - topRight;
		}
		while (topLeft / 16 != (topLeft -(sideLength -1)) / 16);

		// 4.) Quadrat ausfüllen
		x = 0;
		for (int i = bottomRight; i < topLeft; i++) {
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
		innerBottomRight = (bottomRight + summand) + 1;
		innerTopleft = (topLeft - summand) - 1;

		x = 0;
		for (int i = innerBottomRight; i <= innerTopleft; i++) {
			for(x = i; x <= innerTopleft; x += summand) {
				service.turnLedOff(x);
			}
			if(x == innerTopleft + summand) {
				break;
			}
		}

		// 7.) Methode 3 Sekunde anhalten
		service.stopExecutionFor(3000);

		// 8.) Anzeige zuruechsetzen
		service.reset();
	}
	
	// Aufgabe 8 //

	// Aufgabe 8 //
	private static void showTriangle(LedService service) {

		// Methoden relevante Var
		int statusTriangle;

		isTrue = false;
		while(isTrue == false) {

			// Anzahl LEDs abfragen
			System.out.print("Geben Sie die Hoehe des Dreiecks an (Zahl zwischen 2 und 8): ");
			countLeds = sc.nextInt();

			// ueberpruefung ob Zahl zwischen 2 und 8 ist
			if(countLeds <= 8 && countLeds > 1) {
				isTrue = true;
			}			
		}

		// Anzahl LEDs berechnen und hinzufuegen
		countTriangleLeds = countLeds * maxColumns;

		for(int i = 0; i < countTriangleLeds; i++) {
			service.addLeds(countTriangleLeds);
		}

		// Methode fuer 1 Sekunde anhalten
		service.stopExecutionFor(1000);

		statusTriangle = maxColumns-1;

		for(int j = 1; j <= countLeds; j++) {

			for(int k = 0; k < j; k++) {				
				service.turnLedOn(statusTriangle + k * maxColumns);
				service.setDelayInMillis(50);			
			}			
			statusTriangle--;			
		}

		for(int j = countLeds; j > 0; j--) {			
			for(int k = -1; k < j-1; k++) {			
				service.turnLedOn(statusTriangle + k * maxColumns);
				service.setDelayInMillis(50);			
			}			
			statusTriangle--;		
		}

		service.stopExecutionFor(1000);

		ClientApp.moveTriangle(service);

		service.stopExecutionFor(5000);
		service.reset();
	}
	
	// Aufgabe 8 // moveTriangle Methode

	// Aufgabe 8 // moveTriangle Methode
	private static void moveTriangle(LedService service) {

		isTrue = false;
		while(isTrue == false) {

			// Anzahl LEDs abfragen
			System.out.print("Wie oft soll das 3-Eck verschoben werden? ");
			countRepetitions = sc.nextInt();

			// ueberpruefung ob Zahl zwischen 2 und 8 ist
			if(countRepetitions > -1) {
				isTrue = true;
			}			
		}

		// x mal wiederholen
		for(int m = 0; m < countRepetitions; m++) {

			isTrue = false;
			while(isTrue == false) {

				// LEDs nach rechts verschieben
				for(int i = 0; i < countTriangleLeds; i++) {
					if(service.isOn(i) == true) {
						service.turnLedOff(i);
						service.turnLedOn(i-1);
						service.setDelayInMillis(25);
					}
				}
				// anhalten wenn Dreieck ganz rechts ist
				if(service.isOn(0) == true) {
					isTrue = true;
				}
			}

			// Methode 1 Sekunde anhalten
			service.stopExecutionFor(1000);

			isTrue = false;
			while(isTrue == false) {
				// LEDs nach links verschieben
				for(int i = countTriangleLeds - 1; i >= 0; i--) {
					if(service.isOn(i) == true) {
						service.turnLedOff(i);
						service.turnLedOn(i+1);
						service.setDelayInMillis(25);
					}
				}

				// anhalten, wenn Dreieck links ist
				if(service.isOn(maxColumns-1) == true) {
					isTrue = true;
				}
			}

			// Methode 1 Sekunde anhalten
			service.stopExecutionFor(1000);

		}
	}
	
	// Aufgabe 9 //
	
	// Aufgabe 9 //
	private static void siebDesEratosthenes(LedService service) {
	
		// LEDs hinzufügen
		service.addLeds(maxLeds);
		
		// Alle LEDs einschalten
		for(int i = 0; i < maxLeds; i++) {
			service.turnLedOn(i);
		}
		
		// Alle LEDs ausschalten, die keine Primzahl als Nummer haben
		for(int i = 0; i < maxLeds; i++) {
			service.isOn(i);
			if(i == 0 || i == 1) {
				service.turnLedOff(i);
				service.setDelayInMillis(50);
			}
			else if(service.isOn(i) == true && Math.sqrt(i) < maxLeds) {
				for(int x = i + 1; x < maxLeds; x++) {
					if(x % i == 0) {
						service.turnLedOff(x);
						service.setDelayInMillis(50);
					}
				}
			}
		}
		
		// Halten und Zurücksetzen
		service.stopExecutionFor(2000);
		
		service.reset();
	}
	
	// Aufgabe 10 //
	
	// Aufgabe 10 //
	public static void countColor(LedService service) {

		// Methoden relevante Var
		int value;
		int largestCounter;
		int rowIndex;

		// 1.) Max Anz LEDs und Color Random
		service.addLeds(maxLeds, LedColor.RANDOM);

		// 2.) Anschalten aller LEDs
		int[] arrAddLed = new int[maxLeds];
		LedColor[] arrLedColor = new LedColor[maxLeds];

		for (int i = 0; i < arrAddLed.length; i++) {
			arrAddLed[i] = i;
			service.turnLedOn(arrAddLed[i]);
			arrLedColor[i] = service.color(arrAddLed[i]);
		}	

		service.stopExecutionFor(2000);

		// 3.) Anz Farben bestimmen
		LedColor[] arrColor = {LedColor.RED, LedColor.GREEN, LedColor.YELLOW, LedColor.BLUE};

		for (int i = 0; i < arrColor.length; i++) {

			countRepetitions = 0;
			for (int j = 0; j < arrLedColor.length; j++) {
				if (arrColor[i] == arrLedColor[j]) {
					countRepetitions++;
				}
			}

			// 4.) Ausgabe Anz LEDs
			System.out.println(arrColor[i] + ":" + "\t" + countRepetitions + " LEDs");  
		}
		
		// 5.) Max Anz farbige LED pro reihe
		System.out.println();
		System.out.println("Zeile-Nummer ist Null-Basiert (die unterste Zeile hat die Nr. 0):");

		LedColor[][] arrLeds = new LedColor[maxRows][maxColumns];
		
		value = 0;
		for (int i = 0; i < maxRows; i++) {
			for (int j = 0; j < maxColumns; j++) {
				arrLeds[i][j] = arrLedColor[value];
				value++;
			}
		}	

		for (int i = 0; i < arrColor.length; i++) {

			largestCounter = 0;
			rowIndex = 0;
			for (int j = 0; j < maxRows; j++) {

				countRepetitions = 0;
				for (int x = 0; x < maxColumns; x++) {
					if(arrLeds[j][x] == arrColor[i]) {
						countRepetitions++;
					}
				}
				if (countRepetitions >= largestCounter) {
					largestCounter = countRepetitions;
					rowIndex = j;
				}				
			}
			System.out.println(arrColor[i] + ":" + "\t" + largestCounter + " LEDs in Zeile: " + rowIndex);
		}
	}
}
