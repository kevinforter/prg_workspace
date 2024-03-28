package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.Led;
import ch.hslu.prg.ledboard.proxy.BoardService;
import ch.hslu.prg.ledboard.proxy.LedColor;

import java.util.Scanner;

public class ClientApp {

    // Variablen
    private static final int MAX_ROWS = BoardService.MAX_ROWS;
    private static final int MAX_COLS = BoardService.LEDS_PER_ROW;
    private static int rows;
    private static Led[][] ledArr;
    private static boolean validInput = false;
    public static void main(String[] args) {

        // Instanzen
        final BoardService service = new BoardService();
        final Scanner sc = new Scanner(System.in);

        // Aufruf Methoden
        //ledsOnOff(service, sc);
        switchEvenOdd(service, sc);

    }

    private static void ledsOnOff(BoardService service, Scanner sc) {

        // 1. Eingabe
        do {
            System.out.print("Geben sie die Anzahl hinzuzufügenden LED Reihen an: ");
            rows = sc.nextInt();

            if (rows > MAX_ROWS || rows < 1) {
                System.out.println("Gültige anzahl Reihen [1 - " + MAX_ROWS + "]");
                validInput = false;
            } else {
                validInput = true;
            }
        } while (!validInput);

        // 1.2 Eingabe Farbe
        int colorSelect = 0;
        do {
            System.out.print("Geben sie die Farbe der LEDs an\n (1) ROT\n (2) GRUEN\n (3) GELB\n (4) BLAU\n (5) FARBIG\nAuswahl: ");
            colorSelect = sc.nextInt();

            if (colorSelect < 1 || colorSelect > 5) {
                System.out.println("Gültige Auswahl [1 - 5]");
                validInput = false;
            } else {
                validInput = true;
            }

        } while (!validInput);


        LedColor color = switch (colorSelect) {
            case 1 -> LedColor.RED;
            case 2 -> LedColor.GREEN;
            case 3 -> LedColor.YELLOW;
            case 4 -> LedColor.BLUE;
            case 5 -> LedColor.RANDOM;
            default -> null;
        };

        // 2. LED hinzufügen
        ledArr = service.add(rows, color);

        // 3. Pause
        service.pauseExecution(2000);

        // 8. Wiederholung 4-7 (3x)
        for (int i = 0; i <= 3; i++) {

            // 4. Einschalten
            for (int y = rows - 1; y >= 0; y--) {
                for (int j = MAX_COLS -1; j >= 0; j--) {
                    (ledArr[y][j]).turnOn();
                    service.pauseExecution(50);
                }
            }

            // 5. Pause
            service.pauseExecution(250);

            // 6. Ausschalten
            for (int y = 0; y < rows; y++) {
                for (int j = 0; j < MAX_COLS; j++) {
                    (ledArr[y][j]).turnOff();
                    service.pauseExecution(50);
                }
            }

            // 7. Pause
            service.pauseExecution(250);
        }

        // 9. Pause
        service.pauseExecution(2000);

        // 10. Zurücksetzen
        service.removeAllLeds();
    }

    private static void switchEvenOdd(BoardService service, Scanner sc) {

        // 1. Eingabe
        do {
            System.out.print("Geben sie die Anzahl hinzuzufügenden LED Reihen an: ");
            rows = sc.nextInt();

            if (rows > MAX_ROWS || rows < 1) {
                System.out.println("Gültige anzahl Reihen [1 - " + MAX_ROWS + "]");
                validInput = false;
            } else {
                validInput = true;
            }
        } while (!validInput);

        // 2. LED hinzufügen und Pause
        ledArr = service.add(rows);
        service.pauseExecution(2000);

        // 3. Gerade Lampen einschalten
        for (int y = 0; y < rows; y++) {
            for (int j = 0; j < MAX_COLS; j++) {
                if ((ledArr[y][j]).getLedId() % 2 == 0) (ledArr[y][j]).turnOn();
            }
        }

        // 4. Pause
        service.pauseExecution(1000);

        // 5. Ein Aus Switch
        for (int y = 0; y < rows; y++) {
            for (int j = 0; j < MAX_COLS; j++) {
                if ((ledArr[y][j]).isOn()) {
                    (ledArr[y][j]).turnOff();
                } else {
                    (ledArr[y][j]).turnOn();
                }
            }
        }
    }
}