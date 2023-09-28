package ch.hslu.informatik.block11.demo03.test;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.*;

import ch.hslu.informatik.block11.demo03.domain.Lampe;
import ch.hslu.informatik.block11.demo03.persister.LampePersister;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {
		// TODO - Methoden der Klasse 'LampePersister' testen
		
		List<Lampe> list = new ArrayList<>();
		
		list.add(new Lampe (230, 60, "ABC"));
		list.add(new Lampe (230, 60, "DEF"));
		
		try {
			LampePersister.writeObject(list, "/Users/kevinforter/Documents/lampe.obj");
			List<Lampe> LampeGelsen = LampePersister.readObjects("/Users/kevinforter/Downloads/produktTypDataPlainText.txt");
			int anzahl = LampeGelsen.size();
			System.out.println(anzahl);
			System.out.println(LampeGelsen.get(0));
			System.out.println(LampeGelsen.get(1));
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			System.out.println("Es ist leider ein Fehler passiert");
		}
	}
	
}
