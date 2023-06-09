package ch.hslu.informatik.prg.afg01;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// Definieren Sie eine Klasse namens ArrayListDemoTest, in der nur die Methode main enthalten ist.
public class ArrayListDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definieren Sie drei Person-Instanzen namens dani, marco und beat.
		Person dani = new Person("cesar", "dani");
		Person marco = new Person("alfonso", "marco");
		Person beat = new Person("magteburg", "beat");

		/* Erstellen Sie eine ArrayList-Instanz namens personenListe und fügen Sie 
		 * alle drei Person-Instanzen in die liste ein.
		 */
		List<Person> personenListe = new ArrayList<>();

		personenListe.add(dani);
		personenListe.add(beat);
		personenListe.add(marco);

		// Geben Sie den Inhalt der personenListe auf dem Bildschirm aus.
		show(personenListe);
		
		/* Geben Sie Namen aller in der personenListe enthalten Personen auf dem Bildschirm aus.
		 * Es wird verlangt, dass nur die Nachnamen ausgegeben werden (ohne Vornamen). 
		 * Setzen Sie dabei die Methode getName ein, welche in der Klasse Person definiert ist.
		 */
		System.out.println();
        for (Person person : personenListe) {
            System.out.println(person.getName());
        }
        
        // Geben Sie die Daten für das Person-Objekt mit dem Index-Wert 2 auf dem Bildschirm aus.
        System.out.println();
        System.out.println(personenListe.get(2));
        
        /* Definieren Sie ein Array namens arr vom Typ Person. Kopieren Sie anschliessend den Inhalt 
         * der personenListe ins Array arr. Benutzen Sie dabei die Methode toArray der Klasse ArrayList.
         */
        Person[] arr = personenListe.toArray(new Person[0]);
        
        // Geben Sie anschliessend den arr-Inhalt in einer Schleife auf dem Bildschirm aus.
        System.out.println();
        for (Person i : arr) {
        	System.out.println(i);
        }
        
        /* Geben Sie die Personendaten für die erste und die letzte Person-Instanz in der 
         * personenListe auf dem Bildschirm aus.
         */
        System.out.println();
        System.out.println(personenListe.get(0));
        System.out.println(personenListe.get(personenListe.size()-1));
        
        /* Stellen Sie fest, ob sich die Person-Instanz, welche mit marco referenziert wird, 
         * in der personenListe befindet oder nicht. Falls ja, geben Sie die Position6 dieser 
         * Instanz auf dem Bildschirm aus.
         */
        System.out.println();
        if (personenListe.contains(marco)) {
        	System.out.println(personenListe.indexOf(marco));
        }
        
        /* Prüfen Sie, ob die personenListe leer ist. Falls nicht, geben Sie die Anzahl der 
         * Elemente in der personenListe auf dem Bildschirm aus.
         */
        System.out.println();
        if (! personenListe.isEmpty()) {
        	System.out.println(personenListe.size());
        }
        
        /* Entfernen Sie die Person-Instanz aus der personenListe, welche mit marco referenziert wird. 
         * Geben Sie anschliessend die Anzahl Objekte in der personenListe auf dem Bildschirm aus.
         */
        System.out.println();
        if (personenListe.contains(marco)) {
        	personenListe.remove(marco);
        	System.out.println(personenListe.size());
        }
        
        /* Testen Sie, ob die marco-Instanz in der personenListe enthalten ist. 
         * Falls nicht, geben Sie an, dass die Person (Name der Person) marco in der 
         * personenListe nicht vorhanden ist.
         */
        System.out.println();
        if (! personenListe.contains(marco)) {
        	System.out.println("marco ist in 'personenListe' nicht vorhanden");
        }

        /* Falls die personenListe noch nicht leer ist, löschen Sie den ganzen personenListe-Inhalt. 
         * Geben Sie anschliessend die Anzahl der in der personenListe enthaltenen Elemente auf dem 
         * Bildschirm aus und kontrollieren Sie, ob die Liste leer ist.
         */
        System.out.println();
        if (! personenListe.isEmpty()) {
        	personenListe.clear();
        	for (Person i : personenListe) {
            	System.out.println(i);
            }
        }
	}
	
	/* Dazu wird empfohlen, eine separate Methode namens showPersonen zu definieren. 
	 * Die Ausgabe soll in dieser Methode mit Hilfe eines Iterator-Objekts realisiert werden.
	 */
	public static void show(List<Person> personenListe) {
		System.out.println("Anzahl Personen: " + personenListe.size());
		System.out.println();
		for (Iterator<Person> it = personenListe.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
}