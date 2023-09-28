package ch.hslu.informatik.prg.block1.afg;

public class afg_03 {
	
	public static void main(String[] args) {
		
	// Variablen
	int jahre = 1;
	int guthaben = 1000;
	double zinsSatz = 3;
	double guthabenMitZinsen = 0;
	double q = 1 + zinsSatz/100;
	
	// Verarbeitung
	//guthabenMitZinsen = guthaben * Math.pow(1 + zinsSatz / 100, jahre);
	guthabenMitZinsen = guthaben * Math.pow(q, jahre);
	
	// Ausgabe
	System.out.println(guthabenMitZinsen);
	}
}
