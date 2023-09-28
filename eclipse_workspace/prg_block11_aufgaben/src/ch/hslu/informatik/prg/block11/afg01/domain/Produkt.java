package ch.hslu.informatik.prg.block11.afg01.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Produkt implements Serializable {

	private static final long serialVersionUID = -361009854809075466L;

	private int produktNummer;
	private String beschreibung;
	private int maxBestand;
	private int minBestand;
	private String produktName;
	private double preis;
	private String produktCode;
	private int tablarNummer;
	private int lieferantNummer;
	private LocalDate verfuegbarAb;

	public Produkt(int produktNummer, String beschreibung, int maxBestand, int minBestand, String produktName,
			double preis, String produktCode, int tablarNummer, int lieferantNummer, LocalDate verfuegbarAb) {
		this.produktNummer = produktNummer;
		this.beschreibung = beschreibung;
		this.maxBestand = maxBestand;
		this.minBestand = minBestand;
		this.produktName = produktName;
		this.preis = preis;
		this.produktCode = produktCode;
		this.tablarNummer = tablarNummer;
		this.lieferantNummer = lieferantNummer;
		this.verfuegbarAb = verfuegbarAb;
	}

	public int getProduktNummer() {
		return produktNummer;
	}

	public void setProduktNummer(int produktNummer) {
		this.produktNummer = produktNummer;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public int getMaxBestand() {
		return maxBestand;
	}

	public void setMaxBestand(int maxBestand) {
		this.maxBestand = maxBestand;
	}

	public int getMinBestand() {
		return minBestand;
	}

	public void setMinBestand(int minBestand) {
		this.minBestand = minBestand;
	}

	public String getProduktName() {
		return produktName;
	}

	public void setProduktName(String produktName) {
		this.produktName = produktName;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getProduktCode() {
		return produktCode;
	}

	public void setProduktCode(String produktCode) {
		this.produktCode = produktCode;
	}

	public int getTablarNummer() {
		return tablarNummer;
	}

	public void setTablarNummer(int tablarNummer) {
		this.tablarNummer = tablarNummer;
	}

	public int getLieferantNummer() {
		return lieferantNummer;
	}

	public void setLieferantNummer(int lieferantNummer) {
		this.lieferantNummer = lieferantNummer;
	}

	public LocalDate getVerfuegbarAb() {
		return verfuegbarAb;
	}

	public void setVerfuegbarAb(LocalDate verfuegbarAb) {
		this.verfuegbarAb = verfuegbarAb;
	}

	@Override
	public String toString() {
		return "Produkt [produktNummer=" + produktNummer + ", beschreibung=" + beschreibung + ", maxBestand="
				+ maxBestand + ", minBestand=" + minBestand + ", produktName=" + produktName + ", preis=" + preis
				+ ", produktCode=" + produktCode + ", tablarNummer=" + tablarNummer + ", lieferantNummer="
				+ lieferantNummer + ", verfuegbarAb=" + verfuegbarAb + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(produktNummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Produkt)) {
			return false;
		}
		Produkt other = (Produkt) obj;

		return produktNummer == other.produktNummer;
	}

}
