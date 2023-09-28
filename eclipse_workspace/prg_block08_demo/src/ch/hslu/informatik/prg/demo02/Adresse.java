package ch.hslu.informatik.prg.demo02;

import java.util.Objects;

public class Adresse {
	
	private String strasse;
	private int plz;
	private String ort;

	public Adresse() {
		
	}
	
	public Adresse (String strasse,int plz,String ort) {
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public boolean equals(Object obj) {
		
		//Schritt 1:
		if (this == obj) {
			return true;
		}
		
		//Schritt 2:
		if (!(obj instanceof Adresse)) {
			return false;
		}
		
		//Schritt 3:
		Adresse param = (Adresse)obj;
		
		return this.strasse.equals(param.strasse) && this.plz == param.plz && this.ort.equals(param.ort);
	}
	
	public int hashCode() {
		return Objects.hash(this.strasse, this.plz, this.ort);
	}
	
	public int compareTo(Adresse param) {
		
		if (this.equals(param)) {
			return 0;
		}
		
		if (Integer.compare(this.plz, param.plz) != 0) {
			return Integer.compare(this.plz, param.plz);
		}
		
		if (this.ort.compareTo(param.ort) != 0) {
			return this.ort.compareTo(param.ort);
		}
		
		return this.strasse.compareTo(param.strasse);
		
		
	}

	@Override
	public String toString() {
		return "Adresse [strasse=" + strasse + ", plz=" + plz + ", ort=" + ort + "]";
	}
	
	
}
