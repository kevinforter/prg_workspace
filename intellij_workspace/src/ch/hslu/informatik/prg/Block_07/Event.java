package ch.hslu.informatik.prg.Block_07;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

    private String eventName;
    private String eventBeschreibung;
    private String location;
    private LocalDate datum;
    private LocalTime startzeit;
    private int dauerInMinuten;
    private Uebersetzer[] uebersetzerListe = new Uebersetzer[3];
    private Teilnehmer[] teilnehmerListe = new Teilnehmer[3];
    private Person eventOwner;

    private int teilnehmerIndex = 0;
    private int uebersetzerIndex = 0;

    public Event(String eventName, String eventBeschreibung, String location, LocalDate datum, LocalTime startzeit,
                 int dauerInMinuten, Person eventOwner) {
        this.eventName = eventName;
        this.eventBeschreibung = eventBeschreibung;
        this.location = location;
        this.datum = datum;
        this.startzeit = startzeit;
        this.dauerInMinuten = dauerInMinuten;
        this.eventOwner = eventOwner;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventBeschreibung() {
        return eventBeschreibung;
    }

    public void setEventBeschreibung(String eventBeschreibung) {
        this.eventBeschreibung = eventBeschreibung;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getStartzeit() {
        return startzeit;
    }

    public void setStartzeit(LocalTime startzeit) {
        this.startzeit = startzeit;
    }

    public int getDauerInMinuten() {
        return dauerInMinuten;
    }

    public void setDauerInMinuten(int dauerInMinuten) {
        this.dauerInMinuten = dauerInMinuten;
    }

    public Uebersetzer[] getUebersetzerListe() {
        return uebersetzerListe;
    }

    public Teilnehmer[] getTeilnehmerListe() {
        return teilnehmerListe;
    }

    public Person getEventOwner() {
        return eventOwner;
    }

    public void setEventOwner(Person eventOwner) {
        this.eventOwner = eventOwner;
    }

    public void teilnehmerHinzufuegen(Teilnehmer teilnehmer) {

        if (!(teilnehmerIndex < teilnehmerListe.length)) {

            /* Array um ein Element vergrössern */
            Teilnehmer[] tempArray = new Teilnehmer[teilnehmerListe.length + 1];
            System.arraycopy(teilnehmerListe, 0, tempArray, 0, teilnehmerListe.length);
            teilnehmerListe = tempArray;
        }

        teilnehmerListe[teilnehmerIndex++] = teilnehmer;
    }

    public void uebersetzerHinzufugen(Uebersetzer uebersetzer) {

        if (!(uebersetzerIndex < uebersetzerListe.length)) {
            /* Array um ein Element vergrössern */
            Uebersetzer[] tempArray = new Uebersetzer[uebersetzerListe.length + 1];
            System.arraycopy(uebersetzerListe, 0, tempArray, 0, uebersetzerListe.length);
            uebersetzerListe = tempArray;
        }

        uebersetzerListe[uebersetzerIndex++] = uebersetzer;
    }

    public void teilnehmerEntfernen(Teilnehmer teilnehmer) {

        for (int i = 0; i < teilnehmerListe.length; i++) {
            if (teilnehmerListe[i].equals(teilnehmer)) {
                teilnehmerListe[i] = null;

                for (int y = i; y < teilnehmerListe.length - 1; y++) {
                    teilnehmerListe[y] = teilnehmerListe[y + 1];
                }

                teilnehmerListe[teilnehmerListe.length - 1] = null;
                break;
            }
        }
    }

    public void uebersetzerEntfernen(Uebersetzer uebersetzer) {

        for (int i = 0; i < uebersetzerListe.length; i++) {
            if (uebersetzerListe[i].equals(uebersetzer)) {
                uebersetzerListe[i] = null;

                for (int y = i; y < uebersetzerListe.length - 1; y++) {
                    uebersetzerListe[y] = uebersetzerListe[y + 1];
                }

                uebersetzerListe[uebersetzerListe.length - 1] = null;
                break;
            }
        }
    }
}
