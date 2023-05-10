package ch.hslu.informatik.prg.afg03;

import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class ContainerTest {

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
		
		// Ein Set erstellen und alle Personen aus der obigen Liste übernehmen
		Set<Person> personenSet = new HashSet<>(); 
		personenSet.addAll(personenListe);
		
		// Alle Personen aus dem obigen Set ausgeben
		System.out.println("\nAusgabe ’HashSet’-Inhalt:");
		showPersonen(personenSet);
	}
	
	static void showPersonen(List<Person> personenListe) {
		System.out.println("Anzahl Personen: " + personenListe.size());
		System.out.println();
		for (Iterator<Person> it = personenListe.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}

	static void showPersonen(Set<Person> personenSet) {
		System.out.println("Anzahl Personen: " + personenSet.size());
		System.out.println();
		for (Iterator<Person> it = personenSet.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
}
