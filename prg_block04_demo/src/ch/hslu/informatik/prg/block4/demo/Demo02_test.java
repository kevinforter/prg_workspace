package ch.hslu.informatik.prg.block4.demo;

public class Demo02_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buch python = null;
		Buch wirtschaft = null;		
		
		python = new Buch();
		
		python.titel = "Python in 21 Tagen";
		python.preis = 49.95;
		
		System.out.println();
		
		wirtschaft = new Buch();
		wirtschaft.isbn = "234-224-X1X";
		wirtschaft.titel = "Strukturen und Prozesse";
		
		System.out.println(python.titel);
		System.out.println(wirtschaft.titel);
	}

}
