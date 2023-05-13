package ch.hslu.informatik.prg.afg01;

public class ArgumentOutOfRangeException extends Exception{
	
	public ArgumentOutOfRangeException() {
		
	}
	
	public ArgumentOutOfRangeException(String errorMessage){
        super(errorMessage);
    }
}
