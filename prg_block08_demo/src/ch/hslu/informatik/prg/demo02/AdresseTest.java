package ch.hslu.informatik.prg.demo02;

public class AdresseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse a = new Adresse("Pilatusstrasse 12", 6000, "Luzern");
		Adresse b = new Adresse("Pilatusstrasse 14", 6000, "Luzern");
		
		System.out.println("Adressen a und b sind" + (a.equals(b) ? " gleich" : " nicht gleich"));

		System.out.println("HashCode von a: " + a.hashCode());
		System.out.println("HashCode von b: " + b.hashCode());
		
		System.out.println("CompareTo: " + a.compareTo(b));
	}

}
