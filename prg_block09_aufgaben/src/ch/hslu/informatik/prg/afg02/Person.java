package ch.hslu.informatik.prg.afg02;

/* Erstellen Sie eine Klasse namens Person1, welche (um es einfach zu halten) 
 * nur zwei Felder (Attribute, Instanzvariablen) hat, in denen der Name und der Vorname der Person verwaltet werden.
 */
public class Person {

	/* Erstellen Sie anschliessend die entsprechenden Zugriffsmethoden (set- und get-Methoden) 
	 * und einen parametrisieren (benutzerdefinierten) Konstruktor, dem bei der Erstellung des Objekts 
	 * Werte für Name und Vorname übergeben werden, um das Objekt vollständig initialisieren zu können.
	 */
	private String name;
	private String vorName;
	
	public Person () {
		
	}
	
	public Person (String name, String vorName) {
		this.name = name;
		this.vorName = vorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Vorname: " + vorName;
	}
	
	
}
