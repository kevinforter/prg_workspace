package ch.hslu.informatik.prg.afg01;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int value = Util.getIntZahl("Bitte eine Zahl eingeben: ");
			int fact = Calculator.getFactorial(value);
			System.out.println(fact);
		} catch (Exception e) {
			System.out.println("Caught the exception");
			System.out.println("Exception occured: " + e);
		}

		
	}
}