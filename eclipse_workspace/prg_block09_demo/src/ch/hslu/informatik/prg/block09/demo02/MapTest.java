package ch.hslu.informatik.prg.block09.demo02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Modul> module = new HashMap<>();
		
		module.put("PRG", new Modul(6, "Programmierung"));
		module.put("DIBA", new Modul(3, "Digital Basics"));
		module.put("PTA", new Modul(6, "Projekt und Team-Arbeit"));
		module.put("MWI1", new Modul(1, "Management fuer Wirtschaftsinformatik 1"));
		
		System.out.println("Anzahl Module: " + module.size());
		
		Modul pta = module.get("PTA");
		System.out.println(pta);
		
		System.out.println("\n");
		
		// mit Schlüssel
		Set<String> keys = module.keySet();
		
		for (String key : keys) {
			System.out.println(module.get(key));
		}
		
		System.out.println("\n");
		
		Collection<Modul> c = module.values();
		
		for (Modul m : c) {
			System.out.println(m);
		}
	}

}
