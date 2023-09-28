package ch.hslu.informatik.prg.block4.afg;

import java.util.Scanner;
import java.util.Arrays;

public class aufgabe_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablen
		double zahl1, zahl2, zahl3;
		String message = "Geben Sie eine ganze Zahl an";
		
		// Arrays
		String[] arr = {"Kätty", "Kevin", "Jovan", "Flo"};
		double[] firstArray = {23, 45, 12, 78, 4, 90, 1};
		double[] secondArray = {77, 11, 45, 88, 32, 56, 3};
		int[] container = {23, 45, 12, 78, 4, 90, 1};
		
		// Scanner erstellen
		Scanner sc = new Scanner(System.in);
		
		// Werte einlesen
		System.out.println("Geben Sie bitte 3 Zahlen ein:");
		zahl1 = sc.nextDouble();
		zahl2 = sc.nextDouble();
		zahl3 = sc.nextDouble();
		
		// Aufruf Methoden	
		show(arr);
		
		int[] showArray = create(100, 5, 10);
		show(showArray);
		
		double kleinsterWert = min(zahl1, zahl2, zahl3);
		System.out.println("Der kleinste Wert lautet: " + kleinsterWert);
		
		int showInt = readInt();
		System.out.println("Die eingegebene Zahl lautet: " + showInt);
		
		int showIntdue = readInt(message);
		System.out.println("Die eingegebene Zahl lautet: " + showIntdue);
		
		double[] newArray = merge(firstArray, secondArray);
		show(newArray);
		
		boolean test = contains(container, 7);
		System.out.println("Is " + 7 + " present in the array: " + test);
	}
	
	/**
	* Zeigt den Inhalt des übergebenen Arrays auf dem Bildschirm an. 
	* * @param das Array
	*/	
	public static void show(String[] stringArray){
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
	
	public static void show(int[] intArray){
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		//System.out.println(Arrays.toString(intArray)); 
	}
	
	public static void show(double[] intArray){
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		//System.out.println(Arrays.toString(intArray)); 
	}
	
	/**
	* Erstellt ein Array mit der spezifizierten Länge und initialisiert
	es mit den int-Werten, die sich in dem durch die Parameter from und to definierten Bereich befinden.
	* @param length
	* @param from
	* @param to
	die Länge des Arrays
	die untere Grenze des Bereichs, aus dem die Zufallswerte genommen werden dürfen
	die obere Grenze des Bereichs, aus dem die Zufallswwerte genommen werden dürfen
	* @return das Array
	*/
	public static int[] create(int length, int from, int to){
		
		int arr[] = new int[length];
		int range = (to - from) + 1;
		
		for (int i = 0; i < length; i++) {
			arr[i] = (int) (Math.random() * range) + from;
		}
		
		return arr;
	}
	
	/**
	* Liefert den kleinesten der übergebenen Werte (Minimum) zurück.
	* @param a
	* @param b
	* @param c
	* @return der kleinste Wert (Minimum) */	
	public static double min(double a, double b, double c){
		
		if (a <= b && b <= c) {
			return a;
		} else if (b<=c && c<=a) {
			return b;
		} 
		
	return c;
	}
	
	/**
	* Liest einen int-Wert von der Tastatur und liefert sie zurück.
	* @return der eingelesene int-Wert
	*/
	public static int readInt () {
		Scanner sc = new Scanner(System.in);
		int zahlIn;
		
		System.out.println("Geben Sie eine ganze Zahl an");
		zahlIn = sc.nextInt();
		
	return zahlIn;
	}
	
	
	/**
	* Liest einen int-Wert von der Tastatur und liefert sie zurück.
	* @param message die Meldung, die vor dem Einlesen angezeigt wird * 
	* @return der eingelesene int-Wert
	*/
	public static int readInt(String message) {
		Scanner sc = new Scanner(System.in);
		int zahlIn;
		
		System.out.println(message);
		zahlIn = sc.nextInt();
	return zahlIn;
	}
	
	/**
	* Fügt die beiden übergebenen Arrays zusammen und liefert das
	resultierende Array zurück.
	* @param firstArray das erste Array
	* @param secondArray das zweite Array
	* @return das resultierende Array
	*/
	public static double[] merge(double[] firstArray, double[] secondArray) {
		int fal = firstArray.length;
		int sal = secondArray.length;
		double[] newArray = new double[fal + sal];
		System.arraycopy(firstArray, 0, newArray, 0, fal);  
		System.arraycopy(secondArray, 0, newArray, fal, sal);  
	return newArray;
	}
	
	/**
	* Sagt, ob der übergebene value-Wert im dem übergebenen
	Array enthalten ist.
	* @param arr das Array, das untersucht werden soll
	* @param value der Wert, für den bestimmt werden soll, ob er in dem
	spezifizierten Array enthalten ist oder nicht.
	* @return das Resultat (enthalten oder nicht)
	*/
	public static boolean contains(int[] arr, int value){
		boolean test = false;
        for (int element : arr) {
            if (element == value) {
                test = true;
                break;
            }
        }
    return test;
	} 
	

}