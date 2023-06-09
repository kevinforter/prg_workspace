package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import java.util.Scanner;

public class afg08 {
	
	private static boolean isTrue;
	private static int countRepetitions;
	private static int countTriangleLeds;
	private static int countLeds;
	private static int statusTriangle;

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LedService service = new LedService();
		showTriangle(service);
		moveTriangle(service);
	}
	
	private static void showTriangle(LedService service) {

		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.println("Geben Sie die H�he des Dreiecks an (Zahl zwischen 2 und 8): ");
			countLeds = scan.nextInt();
			
			// check if number is between 2 and 8 | otherwise repeat query
			if(countLeds <= 8 && countLeds > 1) {
				isTrue = true;
			}			
		}
		
		// calculate and add leds to board
		countTriangleLeds = countLeds * LedService.MAX_COLUMNS;
		
		for(int i = 0; i < countTriangleLeds; i++) {
			service.addLeds(countTriangleLeds);
		}
		
		//wait for a second
		service.stopExecutionFor(1000);
		
		statusTriangle = LedService.MAX_COLUMNS-1;
		
		for(int j = 1; j <= countLeds; j++) {
			
			for(int k = 0; k < j; k++) {
				
				service.turnLedOn(statusTriangle + k * LedService.MAX_COLUMNS);
				service.setDelayInMillis(50);
				
			}
			
			statusTriangle--;
			
		}
		
		for(int j = countLeds; j > 0; j--) {
			
			for(int k = -1; k < j-1; k++) {
				
				service.turnLedOn(statusTriangle + k * LedService.MAX_COLUMNS);
				service.setDelayInMillis(50);
				
			}
			
			statusTriangle--;
			
		}
		
		service.stopExecutionFor(1000);
		
		afg08.moveTriangle(
				service);
		
		service.stopExecutionFor(5000);
		service.reset();
		
	}

	private static void moveTriangle(LedService service) {

		isTrue = false;
		while(isTrue == false) {

			// get amount of leds
			System.out.println("Wie oft soll das 3-Eck verschoben werden? ");
			countRepetitions = scan.nextInt();

			// check if number is between 2 and 8 | otherwise repeat query
			if(countRepetitions > -1) {
				isTrue = true;
			}			
		}

		// repeat x times
		for(int m = 0; m < countRepetitions; m++) {

			isTrue = false;
			while(isTrue == false) {

				//move each activated led to the right
				for(int i = 0; i < countTriangleLeds; i++) {
					if(service.isOn(i) == true) {
						service.turnLedOff(i);
						service.turnLedOn(i-1);
						service.setDelayInMillis(25);
					}
				}

				//stop, when the triangle is on the right side
				if(service.isOn(0) == true) {
					isTrue = true;
				}
			}

			//wait for a second
			service.stopExecutionFor(1000);

			isTrue = false;
			while(isTrue == false) {

				//move each activated led to the left
				for(int i = countTriangleLeds - 1; i >= 0; i--) {
					if(service.isOn(i) == true) {
						service.turnLedOff(i);
						service.turnLedOn(i+1);
						service.setDelayInMillis(25);
					}
				}

				//stop, when the triangle is on the left side
				if(service.isOn(LedService.MAX_COLUMNS-1) == true) {
					isTrue = true;
				}
			}

			//wait for a second
			service.stopExecutionFor(1000);

		}
	}
}
