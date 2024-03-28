package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.*;

import java.util.Scanner;
import java.util.random.*;

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
        //switchEvenOdd(service, sc);
        //switchRandom(service, sc);
        showSquare(service, sc);

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
            for (int row = ledArr.length - 1; row >= 0; row--) {
                for (int col = ledArr[row].length - 1; col >= 0; col--) {
                    (ledArr[row][col]).turnOn();
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

        // 7. Wiederholung 3-6 (3x)
        for (int i = 0; i <= 3; i++) {

            // 3. Gerade Lampen einschalten
            for (int y = 0; y < rows; y++) {
                for (int j = 0; j < MAX_COLS; j++) {
                    if ((ledArr[y][j]).getLedId() % 2 == 0) {
                        (ledArr[y][j]).turnOn();
                    } else {
                        (ledArr[y][j]).turnOff();
                    }
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

            // 6. Pause
            service.pauseExecution(1000);
        }

        // 8. Alle ausschalten
        for (int y = 0; y < rows; y++) {
            for (int j = 0; j < MAX_COLS; j++) {
                (ledArr[y][j]).turnOff();
            }
        }

        // 9. Pause
        service.pauseExecution(2000);

        // 10. Zurücksetzen
        service.removeAllLeds();
    }

    private static void showSquare(BoardService service, Scanner sc) {

        // 1. Max Reihen hinzufügen
        ledArr = service.add(MAX_ROWS);

        // 2.
        System.out.println("Geben sie die Koordinaten für [topLeft] an");
        System.out.print("Zeile  [0 - 31]: ");
        int rowTopLeft = sc.nextInt();
        System.out.print("Spalte [0 - 31]: ");
        int colTopLeft = sc.nextInt();

        // 3.
        System.out.println("Geben sie die länge des Quadrates an: ");
        System.out.print("Länge [0 - 32]: ");
        int squareLength = sc.nextInt();

        // Aufruf 6.1
        System.out.println("Wollen Sie mit oder ohne Diagonalen?\n [1] - YES\n [2] - NO");
        int digSelect = sc.nextInt();

        boolean dig = digSelect == 1;

        // 4
        for (int i = 0; i < squareLength; i++) {
            (ledArr[rowTopLeft][colTopLeft + i]).turnOn();
            (ledArr[rowTopLeft + i][colTopLeft]).turnOn();
            (ledArr[rowTopLeft + squareLength - 1][colTopLeft + i]).turnOn();
            (ledArr[rowTopLeft + i][colTopLeft + squareLength - 1]).turnOn();
        }

        if (dig) showSquare(squareLength, rowTopLeft, colTopLeft);
    }

    // 6.2
    private static void showSquare(int squareLength, int rowTopLeft, int colTopLeft) {
        for (int i = 0; i < squareLength; i++) {
            (ledArr[rowTopLeft + i][colTopLeft + i]).turnOn();
            (ledArr[(rowTopLeft + squareLength - 1) - i][colTopLeft + i]).turnOn();
        }
    }
}