package de.db.vertrieb.javaworkshop.chapter_07_classes;

import java.util.ArrayList;

public class Zug {

    private ArrayList<Waggon> waggons = new ArrayList<Waggon>();

    public void addWaggon(Waggon waggon){
        this.waggons.add(waggon);
    }

    public int getGesamtanzahlSitzplätze(){

        int gesamtAnzahl = 0;

        for (Waggon waggon: waggons) {
            gesamtAnzahl = gesamtAnzahl + waggon.getSitzplaetze();
        }

        return gesamtAnzahl;
    }

}
