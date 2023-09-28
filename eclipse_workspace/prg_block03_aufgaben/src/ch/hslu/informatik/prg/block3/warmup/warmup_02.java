package ch.hslu.informatik.prg.block3.warmup;

import java.util.Scanner;

public class warmup_02 {
	
	public static void main(String[] args) {
		
		// Variablen
		int[] arrP;
		int minIndex;
		int maxIndex;
		int summe = 0;
		
		// Scanner einrichten
		Scanner sc = new Scanner(System.in);
		
		// Erzeugung Array
		arrP = new int [5];
		arrP = new int[] {19, 17, 13, 11, 7, 5, 3, 2};
		
		// Ausgabe Laenge Array
		System.out.println("Die Laenge des Array ist: " + arrP.length);
		
		// Ausgabe Primzahlen
		for (int i = 0; i < arrP.length; i++) {
			System.out.println(arrP[i]);
		}
		
		// kleinste und groesste Primzahl		
		
		for (int i = 0; i == 0; ) {
			
			System.out.println("Geben Sie den kleinsten Index an: ");
			minIndex = sc.nextInt();
			
			if (minIndex != 0) {
				System.out.println("Index muss 0 sein. ");
				continue;
			}
			++i;
		}
		
		for (int i = 0; i == 0; ) {
			
			System.out.println("Geben Sie den groessten Index an: ");
			maxIndex = sc.nextInt();
			
			if (maxIndex != 7) {
				System.out.println("Index muss 17 sein. ");
				continue;
			}
			++i;
		}
		
		System.out.println("Die kleinste Primzahl lautet: " + arrP[0]);
		System.out.println("Die groesste Primzahl lautet: " + arrP[7]);
		
		// Summe aller Primzahlen
		
		for (int i = 0; i < arrP.length; i++) {
			summe = summe + arrP[i];
		}
		
		System.out.println("Die Summe aller Primzahlen lautet: " + summe);
	}

}
