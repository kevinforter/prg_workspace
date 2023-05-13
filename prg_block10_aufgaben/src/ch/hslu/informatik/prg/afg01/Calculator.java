package ch.hslu.informatik.prg.afg01;

public class Calculator {

	public static int getFactorial (int input) throws ArgumentOutOfRangeException {

		if (input >= 20 || input < 0) {
			String msg = "Zahl muss 0 oder grösser und kleiner als 20 sein";
			ArgumentOutOfRangeException e = new ArgumentOutOfRangeException(msg);
			throw e;
		} else {
			int i,fact=1;
			for(i=1;i<=input;i++){
				fact=fact*i;
			}
			return fact;
		}
	}
}