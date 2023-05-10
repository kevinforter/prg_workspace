package ch.hslu.informatik.prg.block3.afg;

import java.util.Scanner;

public class afg_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen
		int numeroUno;
		int numeroDue;
		int numeroTre;
		int i = 0;
		boolean uno = true;
		boolean due = true;
		boolean tre = true;
		
		// Create Scanner
		Scanner sc = new Scanner(System.in);
		
		// Einlesen von drei Zahlen
		System.out.println("Bitte geben Sie drei ganz Zahlen ein:");
		
		numeroUno = sc.nextInt();
		numeroDue = sc.nextInt();
		numeroTre = sc.nextInt();
		
		// Ausgabe drei Zahlen
		
		while (uno == true || due == true || tre == true) {
			
			if (numeroUno == i) {
				System.out.println(numeroUno);
				++i;
				uno = false;
				continue;
			} else if (numeroTre == i) {
				System.out.println(numeroTre);
				++i;
				due = false;
				continue;
			} else if (numeroDue == i) {
				System.out.println(numeroDue);
				++i;
				tre = false;
				continue;
			} 
			
			++i;
		}

	}

}
