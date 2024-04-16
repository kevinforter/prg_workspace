package ch.hslu.informatik.prg.Block_07;

public class Teilnehmer extends Person {

	private String rolle;

	public Teilnehmer(String name, String vorname, String email, String rolle) {
		super(name, vorname, email);
		this.rolle = rolle;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	public static final String ENTWICKLER = "Entwickler";
	public static final String SW_ARCHITEKT = "SW Architekt";
	public static final String PROJEKTLEITER = "Projektleiter";
	public static final String ANDERS = "Anders";

	@Override
	public boolean equals(final Object object) {
		if (object == this) {
			return true;
		}
		return (object instanceof Teilnehmer t)
				&& (t.getName().equals(this.getName()))
				&& (t.getVorname().equals(this.getVorname()))
				&& (t.getEmail().equals(this.getEmail()));
	}

}