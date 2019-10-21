package de.db.vertrieb.javaworkshop.chapter_07_classes;

public class Waggon {
    private int anzahlSitzplaetze = 200;

    Waggon(){ }

    Waggon(int sitzpaltzanzahl){
        this.anzahlSitzplaetze = sitzpaltzanzahl;
    }

    public int getSitzplaetze(){
        return this.anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze){
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }
}
