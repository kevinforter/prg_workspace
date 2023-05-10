package ch.hslu.informatik.prg.block3.warmup;

import java.util.Scanner;

public class warmup_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.print("Eine ganze Zahl einlesen: "); 
		
		int n = sc.nextInt();
		
//		while(n > 0){
//		System.out.println(n + " * " + n + " = " + (n*n));
//		n--; }
		
/* Teilaufgabe 1		
 * Ausgabe:
 * 3 * 3 = 9
 * 2 * 2 = 4
 * 1 * 1 = 1
 */
		
// Teilaufgabe 2
		
//		for (int i = 0; n > i; n--) {
//			System.out.println(n + " * " + n + " = " + (n*n));
//		}
		
// Teilaufgabe 3
		
		do {
			System.out.println(n + " * " + n + " = " + (n*n));
			n--;
		} while (n > 0);
			
/* Teilaufgabe 4
 * Sie können einfach umgewandelt werden
 * für jede Schleife gibt es eigene Verwendungen
 */
	}

}
