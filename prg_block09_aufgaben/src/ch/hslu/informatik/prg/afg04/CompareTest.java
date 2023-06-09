package ch.hslu.informatik.prg.afg04;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personenListe = new LinkedList<>();
		personenListe.add(new Person("Weber", "Beat")); 
		personenListe.add(new Person("Pfister", "Ivan")); 
		personenListe.add(new Person("Pechvogel", "Hansli")); 
		personenListe.add(new Person("Weber", "Marcel")); 
		personenListe.add(new Person("Bucher", "Monika")); 
		personenListe.add(new Person("Weber", "Michael")); 
		personenListe.add(new Person("Pfister", "Roger"));

		// Alle Personendaten auf dem Bildschirm ausgeben
		System.out.println("\nAusgabe ’LinkedList’-Inhalt:"); 
		showPersonen(personenListe);

		// Ein TreeSet erstellen und alle Personen aus der Liste übernehmen
		Set<Person> personenSet = new TreeSet<>(); 
		personenSet.addAll(personenListe);

		// Alle Personen aus dem obigen TreeSet ausgeben
		System.out.println("\nAusgabe ’TreeSet’-Inhalt:"); 
		showPersonen(personenSet);

		// TODO - Alle Personen nach Vorname absteigend sortieren und 
		// deren Daten anschliessend auf dem Bildschirm ausgeben
		// Collections.sort(personenListe, Collections.reverseOrder());
		Collections.reverse(personenListe);
		System.out.println("\nAusgabe ’LinkedList’-Inhalt:"); 
		showPersonen(personenListe);

	}

	static void showPersonen (Collection<Person> c) {
		System.out.println("Anzahl Personen: " + c.size());
		for (Iterator<Person> it = c.iterator(); it.hasNext(); ) {
			System.out.print(it.next());
		}
		System.out.println();
	}

//	static void showPersonen (Set<Person> personenSet) {
//		System.out.println("Anzahl Personen: " + personenSet.size());
//		for (Iterator<Person> it = personenSet.iterator(); it.hasNext(); ) {
//			System.out.print(it.next());
//		}
//		System.out.println();
//	}
}
