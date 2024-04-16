package ch.hslu.informatik.prg.Block_07;

public class Referat extends Person {

	private String[] kernkompetenzen;

	public Referat(String name, String vorname, String email) {
		super(name, vorname, email);
		kernkompetenzen = new String[32];
	}

	public String[] getKernkompetenzen() {
		return kernkompetenzen;
	}

	public void setKernkompetenzen(String[] kernkompetenzen) {
		this.kernkompetenzen = kernkompetenzen;
	}
}