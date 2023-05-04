package ch.hslu.informatik.prg.block09.demo02;

public class Modul {

	private int ects;
	private String name;
	
	public Modul () {
		
	}
	
	public Modul (int ects, String name) {
		this.ects = ects;
		this.name = name;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Modul [ects=" + ects + ", name=" + name + "]";
	}
	
	
}
