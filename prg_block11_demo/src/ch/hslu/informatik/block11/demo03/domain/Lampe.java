package ch.hslu.informatik.block11.demo03.domain;

public class Lampe {

	private int spannung;
	private int leistungInWatt;
	private String fassungTyp;

	public Lampe(int spannung, int leistungInWatt, String fassungTyp) {
		this.spannung = spannung;
		this.leistungInWatt = leistungInWatt;
		this.fassungTyp = fassungTyp;
	}

	public int getSpannung() {
		return spannung;
	}

	public void setSpannung(int spannung) {
		this.spannung = spannung;
	}

	public int getLeistungInWatt() {
		return leistungInWatt;
	}

	public void setLeistungInWatt(int leistungInWatt) {
		this.leistungInWatt = leistungInWatt;
	}

	public String getFassungTyp() {
		return fassungTyp;
	}

	public void setFassungTyp(String fassungTyp) {
		this.fassungTyp = fassungTyp;
	}

	@Override
	public String toString() {
		return "Lampe [spannung=" + spannung + ", leistungInWatt=" + leistungInWatt + ", fassungTyp=" + fassungTyp
				+ "]";
	}
}