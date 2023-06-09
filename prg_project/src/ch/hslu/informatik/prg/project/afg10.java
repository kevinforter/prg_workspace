package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import ch.hslu.prg.leds.proxy.LedColor;

public class afg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufruf Methode
		LedService service = new LedService();
		countColor(service);

	}

	// Impelementierung Methode
	public static void countColor(LedService service) {


		// 1.) Max Anz LEDs und Color Random
		int max = LedService.MAX_NUMBER_OF_LEDS;
		service.addLeds(max, LedColor.RANDOM);


		// 2.) Anschalten aller LEDs
		int[] arrAddLed = new int[max];
		LedColor[] arrLedColor = new LedColor[max];

		for (int i = 0; i < arrAddLed.length; i++) {
			arrAddLed[i] = i;
			service.turnLedOn(arrAddLed[i]);
			arrLedColor[i] = service.color(arrAddLed[i]);
		}	

		service.stopExecutionFor(2000);


		// 3.) Anz Farben bestimmen
		LedColor[] arrColor = {LedColor.RED, LedColor.GREEN, LedColor.YELLOW, LedColor.BLUE};

		for (int i = 0; i < arrColor.length; i++) {

			int counter = 0;
			for (int j = 0; j < arrLedColor.length; j++) {
				if (arrColor[i] == arrLedColor[j]) {
					counter++;
				}
			}


			// 4.) Ausgabe Anz LEDs
			System.out.println(arrColor[i] + ":" + "\t" + counter + " LEDs");  
		}

		
		// 5.) Max Anz farbige LED pro reihe
		System.out.println();
		System.out.println("Zeile-Nummer ist Null-Basiert (die unterste Zeile hat die Nr. 0):");
		
		int rows = LedService.MAX_ROWS;
		int columns = LedService.MAX_COLUMNS;

		LedColor[][] array = new LedColor[rows][columns];

		int value = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = arrLedColor[value];
				value++;
			}
		}	

		for (int i = 0; i < arrColor.length; i++) {

			int largestCounter = 0;
			int rowIndex = 0;
			for (int j = 0; j < rows; j++) {

				int counter = 0;
				for (int x = 0; x < columns; x++) {
					if(array[j][x] == arrColor[i]) {
						counter++;
					}
				}
				if (counter >= largestCounter) {
					largestCounter = counter;
					rowIndex = j;
				}				
			}
			System.out.println(arrColor[i] + ":" + "\t" + largestCounter + " LEDs in Zeile: " + rowIndex);
		}
	}
}
