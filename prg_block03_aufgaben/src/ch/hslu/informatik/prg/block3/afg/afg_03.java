package ch.hslu.informatik.prg.block3.afg;

import java.util.Scanner;

public class afg_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variablen
		double gewicht;
		double groesse;
		double bmi;
		
		// Einlesen der Daten
		System.out.println("Bitte geben Sie ihr Gewicht an");
		gewicht = sc.nextInt();
		
		System.out.println("Bitte geben Sie ihre Groesse in Zentimeter an");
		groesse = sc.nextInt();
		groesse = groesse / 100;
		
		// Berrechnung BMI
		bmi = gewicht / Math.pow(groesse, 2);
		
		if (bmi < 18.5) {
			System.out.println("Ihr BMI: " + bmi + " (Untergewicht)");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Ihr BMI: " + bmi + " (Normalgewicht)");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Ihr BMI: " + bmi + " (Uebergewicht)");
		} else {
			System.out.println("Ihr BMI: " + bmi + " (Adipositas)");
		}
		
	}

}
