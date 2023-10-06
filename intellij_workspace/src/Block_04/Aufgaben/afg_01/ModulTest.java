package Block_04.Aufgaben.afg_01;

public class ModulTest {
    public static void main(String[] args) {
        Modul prg = new Modul();
        Dozent sucur = new Dozent();

        sucur.name = "Sucur";
        sucur.vorname = "Jordan";
        sucur.modul = "PRG";
        sucur.alter = 55;

        prg.name = "PRG";
        prg.beschreibung = "Programmieren";
        prg.dozent = sucur;
        prg.anzSchueler = 25;

        System.out.print("Modulname: " + prg.name + "\nBeschreibung: " + prg.beschreibung + "\nDozent: " + sucur.name + " " + sucur.vorname + "\nAnzahl Schüler: " + prg.anzSchueler);
    }
}
