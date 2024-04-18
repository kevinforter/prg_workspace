package ch.hslu.informatik.prg.Block_07;

public class Person {

	private String name;
	private String vorname;
	private String email;

	public Person() {

	}

	public Person(String name, String vorname, String email) {
		this.name = name;
		this.vorname = vorname;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name= " + this.name + ", " +
				"Vorname= " + this.vorname + ", " +
				"E-Mail= " + this.email;
	}
}
