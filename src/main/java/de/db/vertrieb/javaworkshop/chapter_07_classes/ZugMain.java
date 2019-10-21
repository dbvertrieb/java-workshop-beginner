package de.db.vertrieb.javaworkshop.chapter_07_classes;

public class ZugMain {

    public static void main(String[] args){

        Zug zug = new Zug();

        Waggon waggon1 = new Waggon(200);
        Waggon waggon2 = new Waggon(134);
        Waggon waggon3 = new Waggon(55);

        zug.addWaggon(waggon1);
        zug.addWaggon(waggon2);
        zug.addWaggon(waggon3);

        System.out.println(zug.getGesamtanzahlSitzplätze());

    }

}
