package ch.hslu.informatik.block11.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {

	private static final Logger LOGGER = LogManager.getLogger(MainApp.class);
	
	public static void main(String[] args) {
		
		// Datei, die kopiert weden soll
		String srcFile = "/Users/kevinforter/Documents/org.jpeg"; // ANAPSSEN
		
		// Datei, die als Kopie erstellt werden soll
		String dstFile = "/Users/kevinforter/Documents/copy.jpeg";	// ANPASSEN
		
		// Methode 'copyFile' aufrufen
		try {
			MainApp.copyFile(srcFile, dstFile);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			System.out.println("Leider ist etwas schief gegangen");
		}

	}
	
	// Methode 'copyFile' implementieren 
	private static void copyFile(String src, String dst) throws FileNotFoundException, IOException {
		
		try(FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dst)) {
			
			//Byte for Byte einlesen
			int n = -1;
			
			//So lange nicht am ende des Files
			while((n = fis.read()) != -1) {
				fos.write(n);
			}
		}
	}

}
