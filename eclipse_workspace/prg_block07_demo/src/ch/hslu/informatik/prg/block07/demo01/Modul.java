package ch.hslu.informatik.prg.block07.demo01;

public class Modul {
	
	private String name;
	private int ects;
	
	public Modul() {
		
	}
	
	public Modul(String name, int ects) {
		this.name = name;
		this.ects = ects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}
	
	public String toString() {
		return "Name: + " + name + ", ECTS. " + ects;
	}

}
