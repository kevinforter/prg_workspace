package ch.hslu.informatik.prg.block06.demo01;

public class FahrzeugTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KraftFahrzeug kfz = new KraftFahrzeug();
		kfz.setFahrzeugNummer(3456);
		kfz.setLeerGewicht(12.5);
		kfz.setLeistung(350);
		System.out.println(kfz.toString());
		
		PersonenWagen pkwA = new PersonenWagen();
		pkwA.setFahrzeugNummer(2311);
		pkwA.setLeerGewicht(1.6);
		pkwA.setLeistung(160);
		pkwA.setAnzahlPlaetze(5);
		System.out.println(pkwA.toString());
		
		Fahrrad f = new Fahrrad(567, 0.015, 24.5);
		System.out.println(f);
		
		PersonenWagen pkwB = new PersonenWagen(9876, 1.2, 110, 4);
		System.out.println(pkwB);
	}

}
