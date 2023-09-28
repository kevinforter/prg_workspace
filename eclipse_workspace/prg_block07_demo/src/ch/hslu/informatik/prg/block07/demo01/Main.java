package ch.hslu.informatik.prg.block07.demo01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommonContainer<PunktImRaum> pContainer = new CommonContainer<>();
		pContainer.add(new PunktImRaum(50, 60, 20));
		
		PunktImRaum p = pContainer.get(0);
		System.out.println(
				"Punkt X: " + p.getX() + 
				" Punkt Y: " + p.getY() + 
				" Punkt Z: " + p.getZ());
		
		CommonContainer<Modul> mContainer = new CommonContainer<>();
		mContainer.add(new Modul("PRG", 6));
		
		Modul m = mContainer.get(0);
		System.out.println(
				"Name: " + m.getName() + 
				" ETCS: " + m.getEcts());
		
	}

}
