package ch.hslu.informatik.prg.afg04;

import java.util.Objects;

/* Erstellen Sie eine Klasse namens Person1, welche (um es einfach zu halten) 
 * nur zwei Felder (Attribute, Instanzvariablen) hat, in denen der Name und der Vorname der Person verwaltet werden.
 */
public class Person implements Comparable<Person> {

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
		return name + " " + vorName + ", ";
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (!(obj instanceof Person))
	        return false;
	    Person param = (Person) obj;
//	    System.out.print(name + " " + vorName + " " + param.name + " " + param.vorName);
//	    System.out.println(Objects.equals(name, param.name));
	    return this.name.equals(param.name) && this.name.equals(param.vorName);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(vorName);
	}
	
	@Override
    public int compareTo(Person param) {
        if (this.equals(param)) {
            return 0;
        }
//		if  (this.name.equals(param.name)) {
//			return 0;
//		}
        //return this.vorName.compareTo(param.vorName);
        return this.vorName.compareTo(param.vorName);
//        if (this.name.compareTo(param.name) != 0) {
//			return this.name.compareTo(param.name);
//		}
//        return this.vorName.compareTo(vorName);
    }
        
}
