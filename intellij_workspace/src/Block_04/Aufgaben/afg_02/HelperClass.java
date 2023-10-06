package Block_04.Aufgaben.afg_02;
import java.util.Scanner;

public class HelperClass {

    public static void main(String[] args) {
    // TODO - für jede der in dieser Klasse enthaltenen Methoden einen sinnvollen Aufruf implementieren.

        /* Variablen */
        int from, to, length, input;
        double a, b, c;
        String message = "\nBitte geben Sie eine ganze Zahl ein: ";

        /* Objekte */
        Scanner sc = new Scanner(System.in);
        String[] stringArray = new String[3];
        double[] firstArray = new double[5];
        double[] secondArray = new double[5];
        int [] randomArray = new int[100];

        /* Methode show() */
        System.out.println("Bitte geben Sie 3 Namen ein:");
        for (int i = 0, n = 1; i < stringArray.length; i++, n++) {
            System.out.print("Name " + n + ": ");
            stringArray[i] = sc.next();
        }
        show(stringArray);

        /* Methode create() */
        System.out.println("Bitte geben Sie die Parameter für das Array an:");
        System.out.print("Länge: "); length = sc.nextInt();
        System.out.print("Min: "); from = sc.nextInt();
        System.out.print("Max: "); to = sc.nextInt();
        if (length > 0 && to > from) {
            int[] create = create(length, from, to);
            show(create);
        } else {
            System.out.print("\n");
        }

        /* Methode min() */
        System.out.println("Bitte geben drei Zahlen ein:");
        System.out.print("Zahl 1: "); a = sc.nextDouble();
        System.out.print("Zahl 2: "); b = sc.nextDouble();
        System.out.print("Zahl 3: "); c = sc.nextDouble();
        double min = min(a, b, c);
        System.out.println("Der kleinste Wert lautet: " + min);

        /* Methode readInt() */
        int readInt = readInt();
        System.out.println("Die eingegebene Zahl lautet: " + readInt);

        int readInt2 = readInt(message);
        System.out.println("Die eingegebene Zahl lautet: " + readInt2 + "\n");

        /* Methode merge() */
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = 1 + (int)(Math.random() * 1000);
            secondArray[i] = 1 + (int)(Math.random() * 1000);
        }
        double[] merge = merge(firstArray, secondArray);
        show(merge);

        /* Methode contains() */
        System.out.print("Zu überprüfende Zahl eingeben: ");
        input = sc.nextInt();
        for (int i = 0; i  < randomArray.length; i++) {
            randomArray[i] = 1 + (int)(Math.random() * 1000);
        }
        boolean contains = contains(randomArray, input);
        System.out.println("Is " + input + " present in the array: " + contains);
    }

    /**
     * Zeigt den Inhalt des übergebenen Arrays auf dem Bildschirm an.
     * @param       stringArray das Array
     */
    public static void show(String[] stringArray) {
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }

    public static void show(int[] intArray) {
        for (int j : intArray) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void show(double[] doubleArray) {
        for (double v : doubleArray) {
            System.out.print(v + " ");
        }
        System.out.println("\n");
    }

    /**
     * Erstellt ein Array mit der spezifizierten Länge und initialisiert
       es mit den int-Werten, die sich in dem durch die Parameter from
       und to definierten Bereich befinden.
     * @param       length die Länge des Arrays
     * @param       from die untere Grenze des Bereichs, aus dem die Zufallswerte genommen werden dürfen
     * @param       to die obere Grenze des Bereichs, aus dem die Zufallswerte genommen werden dürfen
     * @return      das Array
     */
    public static int[] create(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * (to - from)) + from);
        }
        return array;
    }

    /**
     * Liefert den kleinsten der übergebenen Werte (Minimum) zurück.
     * @param a     der erste Wert
     * @param b     der zweite Wert
     * @param c     der dritte Wert
     * @return      der kleinste Wert (Minimum)
     * */
    public static double min(double a, double b, double c) {
        double min = a;
        double[] array = new double [] {a, b, c};
        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     * @return      der eingelesene int-Wert
     */
    public static int readInt () {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nBitte geben Sie eine ganze Zahl ein: ");
        return sc.nextInt();
    }

    /**
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     * @param message die Meldung, die vor dem Einlesen angezeigt wird
     * @return der eingelesene int-Wert
     */
    public static int readInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    /**
     * Fügt die beiden übergebenen Arrays zusammen und liefert das
       resultierende Array zurück.
     * @param firstArray    das erste Array
     * @param secondArray   das zweite Array
     * @return das resultierende Array
     */
    public static double[] merge(double[] firstArray, double[] secondArray) {
        int lenght = firstArray.length + secondArray.length;
        double[] mergeArray = new double[lenght];
        System.arraycopy(firstArray, 0, mergeArray, 0, firstArray.length);
                for (int i = 0, y = 5; i < secondArray.length; i++, y++) {
                    mergeArray[y] = secondArray[i];
                }
        return mergeArray;
    }

    /**
     * Sagt, ob der übergebene value-Wert in dem übergebenen
       Array enthalten ist.
     * @param arr           das Array, das untersucht werden soll
     * @param value         der Wert, für den bestimmt werden soll, ob er in dem
                            spezifizierten Array enthalten ist oder nicht.
     * @return              das Resultat (enthalten oder nicht)
     */
    public static boolean contains(int[] arr, int value) {
        for (int j : arr) {
            if (value == j) {
                return true;
            }
        }
        return false;
    }
}
