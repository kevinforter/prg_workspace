package ch.hslu.informatik.prg.block3.warmup;

import java.util.Scanner;

public class warmup_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* TEILAUFGABE 1

for > kopfgesteuert
while > kopfgesteuert
do-while > fussgesteuert

*/
		
// TEILAUFGABE 2
		
		// Variablen
		int zahlX;
		
		// Create Scanner	
		Scanner sc = new Scanner(System.in);
		
		// Zahl einlesen
		System.out.println("Bitte geben Sie eine positive ganze Zahl ein:");
		zahlX = sc.nextInt();
		
		// Ausgabe Zahlen 0 bis zahlX
		for (int i = 0; i <= zahlX; i++) {
			System.out.println(i);
		}
		
		// Ausgabe Zahlen zahlX bis 0
		for (int i = zahlX; i <= zahlX && i >= 0; i--) {
			System.out.println(i);
		}
		
	}

}
