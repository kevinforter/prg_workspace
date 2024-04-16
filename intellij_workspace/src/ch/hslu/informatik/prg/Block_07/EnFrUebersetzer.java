package ch.hslu.informatik.prg.Block_07;

public class EnFrUebersetzer extends Uebersetzer {

	public EnFrUebersetzer(String name, String vorname, String email, String muttersprache, String fremdsprache,
			double stundenansatz) {
		super(name, vorname, email, muttersprache, fremdsprache, stundenansatz);
	}

	@Override
	public void uebersetze() {
		System.out.println("\n Je suis prêt ...");
	}

}
