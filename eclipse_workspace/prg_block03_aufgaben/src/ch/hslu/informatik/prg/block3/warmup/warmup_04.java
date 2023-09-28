package ch.hslu.informatik.prg.block3.warmup;

import java.util.Scanner;

public class warmup_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO 1 - ein Scanner-Objekt erstellen
		Scanner sc = new Scanner(System.in);
		
		// TODO 2 - Variablen für zwei int-Werte deklarieren
		int uno;
		int due;
		
		// TODO 3 - die erste ganze Zahl einlesen
		System.out.println("Geben Sie eine ganze Zahl ein: ");
		uno = sc.nextInt();
		
		/* TODO 4 - Falls die Zahl positiv ist, den Text "POSITIV" 
					ausgeben (Selektion ohne Alternative verwenden).*/
		if (uno >= 0) {
			System.out.println("POSITIV");
		}
		
		/* TODO 5 - Falls die Zahl negativ ist, den Text "NEGATIV" 
					ausgeben (Selektion ohne Alternative verwenden).*/
		if (uno < 0) {
			System.out.println("NEGATIV");
		}
		
		/* TODO 6 - Die TODO 4 und TODO 5 mit einem ’if ... else’ 
					(Selektion mit Alternative) implementieren*/
		if (uno >= 0) {
			System.out.println("POSITIV");
		} else {
			System.out.println("NEGATIV");
		}
		
		// TODO 7 - die zweite ganze Zahl einlesen
		System.out.println("Geben Sie eine ganze Zahl ein: ");
		due = sc.nextInt();
		
		/* TODO 8 - Falls die erste Zahl groesser ist, den Text ’Erste Zahl groesser’ 
					ausgeben. Falls die erste Zahl kleiner ist, ’Erste Zahlkleiner’ ausgeben. 
					Sonst ’Die beiden Zahlen sind gleich’ ausgeben. Dabei soll eine Selektion 
					mit mehreren Alternativen verwendet werden.*/
		if (uno > due) {
			System.out.println("Erste Zahl groesser");
		} else if (uno < due) {
			System.out.println("Zweite Zahl groesser");
		} else {
			System.out.println("Die beiden Zahlen sind gleich");
		}
	}

}
