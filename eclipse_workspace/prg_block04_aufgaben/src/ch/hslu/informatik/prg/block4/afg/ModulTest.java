package ch.hslu.informatik.prg.block4.afg;

public class ModulTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modul mathe = null;
		Modul englisch = null;
		
		mathe = new Modul();
		
		mathe.Bezeichnung = "Mathe Erweitert";
		mathe.Doz = "Jovan Cici";
		mathe.Zeit = 2.5;
		
		englisch = new Modul();
		
		englisch.Bezeichnung = "Für Anfänger";
		englisch.Doz = "Julia Heiden";
		englisch.Zeit = 2.5;
		
		System.out.println(mathe.Bezeichnung + ";" + mathe.Doz + ";" + mathe.Zeit);
		System.out.println(englisch.Bezeichnung + ";" + englisch.Doz + ";" + englisch.Zeit);
	}

}
