package ch.hslu.informatik.prg.block3.warmup;

import java.util.Scanner;

public class warmup_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Codefragmetn A:
//			Scanner scA = new Scanner(System.in); 
//			System.out.print("Bitte eine ganze Zahl eingeben: "); 
//			
//			int zahlA = scA.nextInt();
//			while(zahlA > 0){
//			System.out.println("Aktueller Wert: " + zahlA);
//			zahlA--; }
//			
//		// Codefragmetn B:
//			Scanner scB = new Scanner(System.in); 
//			System.out.print("Bitte eine ganze Zahl eingeben: "); 
//			
//			int zahlB = scB.nextInt();
//			do {
//				System.out.println("Aktueller Wert: " + zahlB); 
//				zahlB--;
//				}while(zahlB > 0);
	
/* Teilaufgabe 1
 * Ausgabe:
 * A: 2
 * 	  1
 * B: 2
 *    1
 *    
 * A: 
 * 
 * B: -2
 */
			
// Teilaufgabe 2
		
			Scanner sc = new Scanner(System.in); 
			System.out.print("Bitte eine ganze Zahl eingeben: "); 
			
			int zahl = sc.nextInt();
			int temp = zahl;
			
			while(zahl > 0){
			System.out.println("Aktueller Wert: " + zahl);
			zahl--; }
			
			zahl = temp;
			do {
				System.out.println("Aktueller Wert: " + zahl); 
				zahl--;
				}while(zahl > 0);
	}

}
