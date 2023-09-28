package ch.hslu.informatik.prg.project;

import ch.hslu.prg.leds.proxy.LedService;
import ch.hslu.prg.leds.proxy.LedColor;

import java.util.Random;
import java.util.Scanner;

public class ClientApp_solution {
	
	public static void main(String[] args) {
		
		// run method ledsOnOff 			(Aufgabe 1)
		ClientApp_solution.ledsOnOff();		
		
		// run method switchEvenOdd 		(Aufgabe 2)
		ClientApp_solution.switchEvenOdd();
		
		// run method switchEvenOdd 		(Aufgabe 3)
		ClientApp_solution.switchRandom();
		
		// run method showBinary 			(Aufgabe 4)
		ClientApp_solution.showBinary();
		
		// run method showBorder 			(Aufgabe 5)
		ClientApp_solution.showBorder();
		
		// run method showSquare			(Aufgabe 6)
		ClientApp_solution.showSquare();
		
		// run method showRectangle			(Aufgabe 7)
		ClientApp_solution.showRectangle();
		
		// run method showTriangle 			(Aufgabe 8)
		ClientApp_solution.showTriangle();
		
		// run method siebDesEratosthenes 	(Aufgabe 9)
		ClientApp_solution.siebDesEratosthenes();
		
		// run method ledsOnOff 			(Aufgabe 10.1)
		ClientApp_solution.countColors();
		
		// run method countColorsExt 		(Aufgabe 10.2)
		ClientApp_solution.countColorsExt();
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	// 																								//
	// 																								//
	//											variables											//
	// 																								//
	// 																								//	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static int countLeds; 
	private static int countRepetitions;
	private static boolean isTrue;
	private static int minValue = 0;
	private static String binaryString;
	private static int countLedsOctets;
	private static int countTriangleLeds;
	private static int statusTriangle;
	private static int topLeft;
	private static int squareSize;
	private static double squareOfNumber;
	private static int bottomRight;
	private static int rectangleLength;
	private static int rectangleStatus;
	private static int countRed;
	private static int countGreen;
	private static int countBlue;
	private static int countYellow;
	private static int countRedRow;
	private static int countGreenRow;
	private static int countBlueRow;
	private static int countYellowRow;
	private static int redRowNumber;
	private static int greenRowNumber;
	private static int blueRowNumber;
	private static int yellowRowNumber;

	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	// 																								//
	// 																								//
	//											instances											//
	// 																								//
	// 																								//	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	static LedService service01 = new LedService();
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	// 																								//
	// 																								//
	//											methods												//
	// 																								//
	// 																								//	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	// create new Scanner instance
	private static Scanner scan = new Scanner(System.in);
	
	/* 
	 * ledsOnOff method | Aufgabe 1
	 */
	private static void ledsOnOff() {
		
		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.println("Geben Sie die Anzahl gew�nschter LEDs an (max. 256): ");
			countLeds = scan.nextInt();
			
			// check if number is less than 256 | otherwise repeat query
			if(countLeds <= LedService.MAX_NUMBER_OF_LEDS && countLeds > 0) {
				isTrue = true;
			}			
		}
		
		// Add leds to board
		service01.addLeds(countLeds, LedColor.RANDOM);
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);

		// turn on/off leds for 3 times
		countRepetitions = 3;
		while(countRepetitions > 0) {
			
			countRepetitions--;
		
			// turn leds on
			for(int i = 0; i < countLeds; i++) {
				service01.turnLedOn(i);
				service01.setDelayInMillis(50);
			}
			
			// stop execution for 0.25 seconds
			service01.stopExecutionFor(250);
			
			for(int i = countLeds; i >= 0; i--) {
				service01.turnLedOff(i);
				service01.setDelayInMillis(50);
			}
			
			// stop execution for 0.25 seconds
			service01.stopExecutionFor(250);
		}
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);
		
		// reset board
		service01.reset();
		
	}
	
	/* 
	 * switchEvenOdd method | Aufgabe 2
	 */
	private static void switchEvenOdd() {
		
		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.println("Geben Sie ein Vielfaches von 16 ein (max. 256): ");
			countLeds = scan.nextInt();
			
			// check if number is divisible by 16 and less than 256| otherwise repeat query
			if(countLeds%16 == 0 && countLeds <= LedService.MAX_NUMBER_OF_LEDS && countLeds > 0) {
				isTrue = true;
			}			
		}
		
		// Add leds to board
		service01.addLeds(countLeds, LedColor.BLUE);
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);
		
		// turn on/off leds for 3 times
		countRepetitions = 3;
		while(countRepetitions > 0) {
			
			countRepetitions--;
			
			for(int i = 0; i < countLeds; i++) {
				if(i%2 == 0) {
					service01.turnLedOn(i);
					service01.setDelayInMillis(50);
				}
			}
			// stop execution for 1 seconds
			service01.stopExecutionFor(1000);
			
			// change every led, depending on current state
			for(int i = 0; i < countLeds; i++) {
				if(service01.isOn(i) == true) {
					service01.turnLedOff(i);
					service01.setDelayInMillis(50);
				}
				else {
					service01.turnLedOn(i);
					service01.setDelayInMillis(50);
				}
			}
			// stop execution for 1 seconds
			service01.stopExecutionFor(1000);
			
			// turn all leds off
			for(int i = 0; i < countLeds; i++) {
				service01.turnLedOff(i);
				service01.setDelayInMillis(50);
			}
		}
		
		// stop execution for 1 seconds
		service01.stopExecutionFor(1000);
		service01.reset();
	}
	
	/* 
	 * switchRandom method | Aufgabe 3
	 */
	private static void switchRandom() {

		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.println("Geben Sie ein Vielfaches von 16 ein (max. 256): ");
			countLeds = scan.nextInt();
			
			// check if number is divisible by 16 and less than 256| otherwise repeat query
			if(countLeds%16 == 0 && countLeds <= LedService.MAX_NUMBER_OF_LEDS && countLeds > 0) {
				isTrue = true;
			}			
		}
		
		// Add leds to board
		service01.addLeds(countLeds, LedColor.RANDOM);
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);
		
		Random rand = new Random();
		
		int[] ledsArr = new int[countLeds/2];
		for(int i = 0; i < ledsArr.length; i++) {
			ledsArr[i] = rand.nextInt((countLeds - minValue)) + minValue;
		}
		
		// turn on/off leds for 3 times
		countRepetitions = 3;
		while(countRepetitions > 0) {
			
			countRepetitions--;

			for(int i = 0; i < ledsArr.length; i++) {
				
				while(isTrue == false) {
					
					if(service01.isOn(ledsArr[i]) == false) {
						service01.turnLedOn(ledsArr[i]);
						isTrue = true;
					}
					else {
						ledsArr[i] = rand.nextInt((countLeds - minValue)) + minValue;
					}
				
				}
				isTrue = false;
			}
			
			// stop execution for 1 second
			service01.stopExecutionFor(1000);
			
			// change every led, depending on current state
			for(int i = 0; i < countLeds; i++) {
				if(service01.isOn(i) == true) {
					service01.turnLedOff(i);
				}
				else {
					service01.turnLedOn(i);
				}
			}
			// stop execution for 1 second
			service01.stopExecutionFor(1000);
			
			// turn all leds off
			for(int i = 0; i < countLeds; i++) {
				service01.turnLedOff(i);
			}

			// stop execution for 1 second
			service01.stopExecutionFor(1000);
		}
		
		service01.reset();
		
	}
	
	/* 
	 * showBinary method | Aufgabe 4
	 */
	private static void showBinary() {

		isTrue = false;
		while(isTrue == false) {
			
			// get amount of leds
			System.out.println("Geben Sie eine ganze positive Zahl ein: ");
			countLeds = scan.nextInt();
			
			// check number
			if(countLeds > 0) {
				isTrue = true;
			}
		}
		
		// use method to convert number to binary string
		ClientApp_solution.getBinaryString(countLeds);
		
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
		service01.addLeds(countLedsOctets);
		
		char characterAt;
		
		for(int i = 0; i < countLeds; i++) {
			characterAt = binaryString.charAt(i);
			
			if(characterAt == '1') {
				service01.turnLedOn(countLeds -1 -i);
			}
			
		}
		
		service01.stopExecutionFor(5000);
		
		service01.reset();
		
	}
	
	/* 
	 * getBinaryString method | Aufgabe 4
	 */
	private static String getBinaryString(int numberToConvert) {
		
		//convert number to binary String
		binaryString = Integer.toBinaryString(numberToConvert);
		return binaryString;
		
	}
	
	/* 
	 * showBorder method | Aufgabe 5
	 */
	private static void showBorder() {
		
		//add leds with requested color
		ClientApp_solution.readLedColor();
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);
		
		countRepetitions = 0;
		
		for(int i = 0; i < LedService.MAX_COLUMNS; i++) {
			
			for(int j = 0; j < LedService.MAX_ROWS ; j++) {
				
				countRepetitions = LedService.MAX_ROWS * i;
				
				if(j + countRepetitions < LedService.MAX_COLUMNS) {
					service01.turnLedOn(j + countRepetitions);
					service01.setDelayInMillis(50);
				}
				else if((j + countRepetitions)%16 == 0) {
					service01.turnLedOn(j + countRepetitions);
					service01.setDelayInMillis(50);
					service01.turnLedOn(j + countRepetitions - 1);
					service01.setDelayInMillis(50);
				}
				else if(j + countRepetitions > LedService.MAX_ROWS * (LedService.MAX_ROWS - 1)) {
					service01.turnLedOn(j + countRepetitions);
					service01.setDelayInMillis(50);
				}
			}
			
		}
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(5000);
		
		countRepetitions = 0;
		
		for(int i = 0; i < LedService.MAX_COLUMNS; i++) {
			
			for(int j = 0; j < LedService.MAX_ROWS ; j++) {
				
				countRepetitions = LedService.MAX_ROWS * i;
				
				if(j + countRepetitions < LedService.MAX_COLUMNS) {
					service01.turnLedOff(j + countRepetitions);
				}
				else if((j + countRepetitions)%16 == 0) {
					service01.turnLedOff(j + countRepetitions);
					service01.turnLedOff(j + countRepetitions - 1);
				}
				else if(j + countRepetitions > LedService.MAX_ROWS * (LedService.MAX_ROWS - 1)) {
					service01.turnLedOff(j + countRepetitions);
				}
			}
			
		}
		
		// stop execution for 2 seconds
		service01.stopExecutionFor(2000);
		
		// reset
		service01.reset(); 
	
	}
	
	/*
	 * readLedColor method | Aufgabe 5
	 */
	private static void readLedColor() {

		isTrue = false;
		while(isTrue == false) {
			
			// text output for color choices 
			System.out.println("Folgende Farben stehen zur Auswahl:");
			
			System.out.println("1 Rot");
			System.out.println("2 Blau");
			System.out.println("3 Gelb");
			System.out.println("4 Gr�n");
			System.out.println("5 Zufall");
			
			// get amount of leds
			System.out.println("Bitte die Zahl der gew�nschten Farbe eingeben: ");
			int	chooseColor = scan.nextInt();
		
			// check number
			if (chooseColor <= 5 && chooseColor > 0) {
				
				//choose color 
				switch (chooseColor) {
					case 1:
						service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.RED);
						break;
					case 2:
						service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.BLUE);
						break;
					case 3:
						service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.YELLOW);
						break;
					case 4:
						service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.GREEN);
						break;
					case 5:
						service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.RANDOM);
						break;
				}
				
				isTrue = true;
				
			}
				
		}	
	}
	
	/* 
	 * showSquare method | Aufgabe 6
	 */
	private static void showSquare() {
		
		//add max LEDS
		service01.addLeds(LedService.MAX_NUMBER_OF_LEDS);

		do {
		//check input
		isTrue = false;
		while(isTrue == false) {
			
			//get topLeft
			System.out.println("Geben Sie die Nummer des LED's f�r topLeft ein (max. 255): ");
			topLeft = scan.nextInt();
			
			// check if number is less than 256 | otherwise repeat query
			if(topLeft <= 255 && topLeft >= 0) {
			isTrue = true;
			}		
		}
		
		isTrue = false;
		while(isTrue == false) {
			//get square size
			System.out.println("Geben Sie die L�nge der Seite des Quadrats ein (max. 16): ");
			squareSize = scan.nextInt();
			
			// check if number is less than 256 | otherwise repeat query
			if(squareSize <= 16 && squareSize > 0) {
			isTrue = true;
			}
		}	
		}
		while (topLeft / 16 != (topLeft -(squareSize -1)) /16 || topLeft - (16 * (squareSize-1)) < 0);
		
		//draw square
		
		//show upper line A
		int countA = 0;
		int a = topLeft;
		while (countA != squareSize) {
			service01.turnLedOn(a);
			a--;
			countA++;	
		}
		
		//show left line B
		int countB = 0;
		int b = topLeft;
		while (countB != squareSize) {
			service01.turnLedOn(b);
			b -= 16;
			countB++;
		}
		
		//show lower line C
		int bottomLeft = topLeft -16 * (squareSize -1);
		int c = bottomLeft;
		int countC = 0;
		while (countC != squareSize) {
			service01.turnLedOn(c);
			c--;
			countC++;
		}
		
		//show right line D
		int topRight = topLeft - (squareSize -1);
		int countD = 0;
		int d = topRight;
		while (countD != squareSize) {
			service01.turnLedOn(d);
			d -= 16;
			countD++;
		}
	
		service01.stopExecutionFor(5000);
		service01.reset();
		
	}
	
	/* 
	 * showRectangle method | Aufgabe 7
	 */
	private static void showRectangle() {
		
		// add max amount of leds
		service01.addLeds(LedService.MAX_NUMBER_OF_LEDS);
		
		do {
			isTrue = false;
			while(isTrue == false) {
				
				// get amount of leds
				System.out.println("Geben Sie die Zahl f�r die obere linke Ecke des Rechtecks an: ");
				topLeft = scan.nextInt();
				
				// check if number is between 0 and 255 | otherwise repeat query
				if(topLeft > -1 && topLeft < LedService.MAX_NUMBER_OF_LEDS) {
					isTrue = true;
				}			
			}
	
			isTrue = false;
			while(isTrue == false) {
				
				// get amount of leds
				System.out.println("Geben Sie die Zahl f�r die untere rechte Ecke des Rechtecks an: ");
				bottomRight = scan.nextInt();
				
				// check if number is between 0 and 255 and smaller than topLeft | otherwise repeat query
				if(bottomRight > -1 && bottomRight < LedService.MAX_NUMBER_OF_LEDS && bottomRight < topLeft) {
					isTrue = true;
				}			
			}
			
			//get length of rectangle
			rectangleStatus = bottomRight;
			rectangleLength = 0;
			countRepetitions = topLeft;
			
			while(rectangleStatus < topLeft) {
				rectangleStatus = rectangleStatus + LedService.MAX_COLUMNS;
			}
			
			while(countRepetitions >= rectangleStatus - LedService.MAX_COLUMNS) {
				rectangleLength++;
				countRepetitions--;			
			}
		}
		while (topLeft / 16 != (topLeft -(rectangleLength -1)) / 16);
				
		//draw Rectangle
		rectangleStatus = topLeft;
		for(int i = topLeft; i >= bottomRight; i--) {
			
			if(i > rectangleStatus - rectangleLength && i <= rectangleStatus) {
				service01.turnLedOn(i);
				service01.setDelayInMillis(50);
			}
			
			else if(i <= rectangleStatus - rectangleLength) {
				rectangleStatus = rectangleStatus - LedService.MAX_COLUMNS;
				if(bottomRight == 0 && service01.isOn(rectangleStatus) == false) {
					service01.turnLedOn(rectangleStatus);
				}
			}
			
		}
		
		// wait for 3 seconds
		service01.stopExecutionFor(3000);
		
		//turn all leds off, except border
		rectangleStatus = topLeft;
		for(int i = topLeft - LedService.MAX_COLUMNS; i >= bottomRight + LedService.MAX_COLUMNS; i--) {
			
			if(i > rectangleStatus - rectangleLength + 1 && i < rectangleStatus) {
				service01.turnLedOff(i);
				service01.setDelayInMillis(50);
			}
			
			else if(i <= rectangleStatus - rectangleLength) {
				rectangleStatus = rectangleStatus - LedService.MAX_COLUMNS;
			}
			
		}
		
		// wait for 3 seconds
		service01.stopExecutionFor(3000);
		
		// reset board
		service01.reset();
		
	}
	
	/* 
	 * showTriangle method | Aufgabe 8
	 */
	private static void showTriangle() {

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
			service01.addLeds(countTriangleLeds);
		}
		
		//wait for a second
		service01.stopExecutionFor(1000);
		
		statusTriangle = LedService.MAX_COLUMNS-1;
		
		for(int j = 1; j <= countLeds; j++) {
			
			for(int k = 0; k < j; k++) {
				
				service01.turnLedOn(statusTriangle + k * LedService.MAX_COLUMNS);
				service01.setDelayInMillis(50);
				
			}
			
			statusTriangle--;
			
		}
		
		for(int j = countLeds; j > 0; j--) {
			
			for(int k = -1; k < j-1; k++) {
				
				service01.turnLedOn(statusTriangle + k * LedService.MAX_COLUMNS);
				service01.setDelayInMillis(50);
				
			}
			
			statusTriangle--;
			
		}
		
		service01.stopExecutionFor(1000);
		
		ClientApp_solution.moveTriangle();
		
		service01.stopExecutionFor(5000);
		service01.reset();
		
	}
		
	/* 
	 * moveTriangle method  | Aufgabe 8
	 */
	private static void moveTriangle() {
		
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
					if(service01.isOn(i) == true) {
						service01.turnLedOff(i);
						service01.turnLedOn(i-1);
						service01.setDelayInMillis(25);
					}
				}

				//stop, when the triangle is on the right side
				if(service01.isOn(0) == true) {
					isTrue = true;
				}
			}
			
			//wait for a second
			service01.stopExecutionFor(1000);
			
			isTrue = false;
			while(isTrue == false) {
				
				//move each activated led to the left
				for(int i = countTriangleLeds - 1; i >= 0; i--) {
					if(service01.isOn(i) == true) {
						service01.turnLedOff(i);
						service01.turnLedOn(i+1);
						service01.setDelayInMillis(25);
					}
				}
				
				//stop, when the triangle is on the left side
				if(service01.isOn(LedService.MAX_COLUMNS-1) == true) {
					isTrue = true;
				}
			}
			
			//wait for a second
			service01.stopExecutionFor(1000);
			
		}
	}
	
	/* 
	 * siebDesEratosthenes method | Aufgabe 9
	 */
	private static void siebDesEratosthenes() {
		
		// add max amount of leds
		service01.addLeds(LedService.MAX_NUMBER_OF_LEDS);
		
		// turn on every led
		for(int i = 0; i < LedService.MAX_NUMBER_OF_LEDS; i++) {
			service01.turnLedOn(i);
			service01.setDelayInMillis(25);			
		}
		
		// get square of max amount of leds
		squareOfNumber = Math.sqrt(LedService.MAX_NUMBER_OF_LEDS);
		
		// turn off led(0) & led(1)
		service01.turnLedOff(0);
		service01.turnLedOff(1);
		
		// turn off all leds, which are not prime numbers
		for(int i = 2; i <= squareOfNumber; i++) {
			
			if(service01.isOn(i) == true) {
				for(int j = 2; j < LedService.MAX_NUMBER_OF_LEDS/i + 1; j++) {
					service01.turnLedOff(i*j);
					service01.setDelayInMillis(25);
				}
			}
		}
		
		// wait for 5 seconds
		service01.stopExecutionFor(5000);
		
		// reset board
		service01.reset();
		
	}
	
	/* 
	 * countColors method | Aufgabe 10
	 */
	private static void countColors() {
		
		// add max amount of leds
		service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.RANDOM);
		
		// turn on every led
		for(int i = 0; i < LedService.MAX_NUMBER_OF_LEDS; i++) {
			service01.turnLedOn(i);
			service01.setDelayInMillis(25);			
		}
		
		// wait for 2 seconds
		service01.stopExecutionFor(2000);
		
		countRed = 0;
		countGreen = 0;
		countBlue = 0;
		countYellow = 0;
		
		for(int i = 0; i < LedService.MAX_NUMBER_OF_LEDS; i++) {
			
			switch(service01.color(i)) {
			
				case RED:
					++countRed;
					break;
				
				case GREEN:
					++countGreen;
					break;
				
				case BLUE:
					++countBlue;
					break;
					
				case YELLOW:
					++countYellow;
					break;
					
					default:
					break;
					
			}
		
		}
		
		System.out.println("RED: \t \t" + countRed);
		System.out.println("GREEN: \t \t" + countGreen);
		System.out.println("BLUE: \t \t" + countBlue);
		System.out.println("YELLOW: \t" + countYellow);
		
		// wait for 5 seconds
		service01.stopExecutionFor(5000);
		
		// reset board
		service01.reset();
	}
	
	/* 
	 * countColorsExt method | Aufgabe 10
	 */
	private static void countColorsExt() {
		// add max amount of leds
		service01.addLeds(LedService.MAX_NUMBER_OF_LEDS, LedColor.RANDOM);
		
		// turn on every led
		for(int i = 0; i < LedService.MAX_NUMBER_OF_LEDS; i++) {
			service01.turnLedOn(i);
			service01.setDelayInMillis(25);			
		}
		
		// wait for 2 seconds
		service01.stopExecutionFor(2000);
		
		countRepetitions = 0;
		countRedRow = 0;
		countGreenRow = 0;
		countBlueRow = 0;
		countYellowRow = 0;
		
		for(int i = 0; i < LedService.MAX_ROWS; i++) {
			
			countRed = 0;
			countGreen = 0;
			countBlue = 0;
			countYellow = 0;
			
			for(int j = 0; j < LedService.MAX_COLUMNS; j++) {
				
				countRepetitions = LedService.MAX_COLUMNS * i;
								
				switch(service01.color(j + countRepetitions)) {
				
					case RED:
						++countRed;
						break;
					
					case GREEN:
						++countGreen;
						break;
					
					case BLUE:
						++countBlue;
						break;
						
					case YELLOW:
						++countYellow;
						break;
					
					default:
						break;

				}
			}
			
			if(countRed > countRedRow) {
				countRedRow = countRed;
				redRowNumber = i;
			}
			else if(countGreen > countGreenRow) {
				countGreenRow = countGreen;
				greenRowNumber = i;

			}
			else if(countBlue > countBlueRow) {
				countBlueRow = countBlue;
				blueRowNumber = i;

			}
			else if(countYellow > countYellowRow) {
				countYellowRow = countYellow;
				yellowRowNumber = i;

			}			
		}
		
		System.out.println("Die Zeilen-Nr. ist Null-basiert (die unterste Zeile hat die Nr. 0):");
		System.out.println("RED: \t \t" + countRedRow + " LEDs in der Zeile Nr. " + redRowNumber);
		System.out.println("GREEN: \t \t" + countGreenRow + " LEDs in der Zeile Nr. " + greenRowNumber);
		System.out.println("BLUE: \t \t" + countBlueRow + " LEDs in der Zeile Nr. " + blueRowNumber);
		System.out.println("YELLOW: \t" + countYellowRow + " LEDs in der Zeile Nr. " + yellowRowNumber);
		
		// wait for 5 seconds
		service01.stopExecutionFor(5000);
		
		// reset board
		service01.reset();
	}	
	
}