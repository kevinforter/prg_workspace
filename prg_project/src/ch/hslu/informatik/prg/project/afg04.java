package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import java.util.Scanner;

public class afg04 {
	
	private static boolean isTrue;
	private static int countLeds;
	private static int countLedsOctets;
	private static String binaryString;

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LedService service = new LedService();
		showBinary(service);
	}

	private static void showBinary(LedService service) {

		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.print("Geben Sie eine ganze positive Zahl ein: ");
			countLeds = scan.nextInt();
			
			// check number
			if(countLeds > 0) {
				isTrue = true;
			}
		}
		
		// use method to convert number to binary string
		afg04.getBinaryString(countLeds);
		
		// get length of binary string
		countLeds = binaryString.length();
		
		countLedsOctets = countLeds;
		isTrue = false;
		while(isTrue == false) {
			countLedsOctets++;
			if(countLedsOctets%8 == 0) {
				isTrue = true;
			}
		}
		// add leds
		service.addLeds(countLedsOctets);
		
		char characterAt;
		
		for(int i = 0; i < countLeds; i++) {
			characterAt = binaryString.charAt(i);
			
			if(characterAt == '1') {
				service.turnLedOn(countLeds -1 -i);
			}
			
		}
		
		service.stopExecutionFor(5000);
		
		service.reset();
		
	}
	
	/* 
	 * getBinaryString method | Aufgabe 4
	 */
	private static String getBinaryString(int numberToConvert) {
		
		//convert number to binary String
		binaryString = Integer.toBinaryString(numberToConvert);
		return binaryString;
		
	}
}
