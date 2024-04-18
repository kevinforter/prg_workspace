package ch.hslu.informatik.prg.Block_07;

import java.util.Objects;

public abstract class Uebersetzer extends Person {

	private String muttersprache;
	private String fremdsprache;
	private double stundenansatz;

	public Uebersetzer(String name, String vorname, String email, String muttersprache, String fremdsprache,
			double stundenansatz) {
		super(name, vorname, email);
		this.muttersprache = muttersprache;
		this.fremdsprache = fremdsprache;
		this.stundenansatz = stundenansatz;
	}

	public String getMuttersprache() {
		return muttersprache;
	}

	public void setMuttersprache(String muttersprache) {
		this.muttersprache = muttersprache;
	}

	public String getFremdsprache() {
		return fremdsprache;
	}

	public void setFremdsprache(String fremdsprache) {
		this.fremdsprache = fremdsprache;
	}

	public double getStundenansatz() {
		return stundenansatz;
	}

	public void setStundenansatz(double stundenansatz) {
		this.stundenansatz = stundenansatz;
	}

	/**
	 * Übersetzt die Rede des Referats
	 */
	public abstract void uebersetze();

	public static final String DEUTSCH = "Deutsch";
	public static final String ENGLISCH = "Englisch";
	public static final String FRANZOESISCH = "Französisch";
	public static final String ITALIENISCH = "Italienisch";

	@Override
	public boolean equals(final Object object) {
		if (object == this) {
			return true;
		}
		return (object instanceof Uebersetzer u)
				&& (u.getName().equals(this.getName()))
				&& (u.getVorname().equals(this.getVorname()))
				&& (u.getEmail().equals(this.getEmail()));
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getVorname(), getEmail());
	}

	@Override
	public String toString() {
		return "Teilnehmer [" +
				"Name= " + getName() + ", " +
				"Vorname= " + getVorname() + ", " +
				"E-Mail= " + getEmail() +
				']';
	}
}
