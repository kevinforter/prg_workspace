package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.Led;
import ch.hslu.prg.ledboard.proxy.BoardService;
import ch.hslu.prg.ledboard.proxy.LedColor;

import java.util.Scanner;

public class ClientApp {

    private static final BoardService service = new BoardService();
    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX_ROWS = BoardService.MAX_ROWS;

    public static void main(String[] args) {

        ledsOnOff();

    }

    private static void ledsOnOff() {

        // 1. Eingabe
        System.out.print("Geben sie die Anzahl hinzuzufügenden LED Reihen an: ");
        int rows = sc.nextInt();

        // 2. LED hinzufügen
        Led[][] ledArr = null;
        if (rows > MAX_ROWS) {
            System.out.println("Die Anzahl der Reihen darf nicht größer als 32 sein.");
        } else {
            ledArr = service.add(rows);
        }

        // 3. Pause
        service.pauseExecution(2000);

        // 4. Einschalten
        for (int i = rows-1; i >= 0; i--) {
            for (int j = ledArr.length-1; j >= 0; j--) {
                (ledArr[i][j]).turnOn();
            }
        }

        // 5. Pause
        service.pauseExecution(250);

        // 6. Ausschalten
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < ledArr.length; j++) {
                (ledArr[i][j]).turnOff();
            }
        }

        // 6. Pause
        service.pauseExecution(250);
    }
}
