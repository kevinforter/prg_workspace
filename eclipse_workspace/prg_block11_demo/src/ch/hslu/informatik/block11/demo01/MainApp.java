package ch.hslu.informatik.block11.demo01;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);

	public static void main(String[] args) {

		// TODO - Methode 'writeWithFileWriter' aufrufen
		String text = "Heute ist ein so schoener Tag!";
		String path = "/Users/kevinforter/Downloads/produktTypDataPlainText.txt";

		//		try {
		//			Util.writeWithFileWriter(text, path);
		//		} catch(IOException ioe) {
		//			LOGGER.error(ioe.getMessage(), ioe);
		//			System.out.println("Es ist leider ein Fehler passiert");
		//		}

		// TODO - Methode 'writeWithBufferedWriter' aufrufen
		String fileName = "/Users/kevinforter/Documents/file01.txt";
		try {
			Util.writeWithBufferedWriter(fileName);
		} catch(IOException e) {
			LOGGER.error(e.getMessage(), e);
			System.out.println("Es ist leider ein Fehler passiert");
		}

		// TODO - Methode 'readWihtFileReader' aufrufen
		//		try {
		//		String inhalt = Util.readWithFileReader(path);
		//		System.out.println(inhalt);
		//		
		//		
		//		} catch (IOException e) {
		//			LOGGER.error(e.getMessage(), e);
		//			System.out.println("Es ist ein Fehler passiert");
		//		}

		// TODO - Methode 'readWithBufferedReader' aufrufen
		try {
			String inhalt = Util.readWithBufferedReader(path);
			System.out.println(inhalt);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			System.out.println("Es ist ein Fehler passiert");
		}

	}
}
