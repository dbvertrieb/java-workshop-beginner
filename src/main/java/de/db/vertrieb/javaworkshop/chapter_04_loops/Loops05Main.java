package de.db.vertrieb.javaworkshop.chapter_04_loops;

public class Loops05Main {

    public static void main(String[] args) {
        int input;

        do {
            System.out.println( "Zum Abbrechen gebe eine 1 ein. Für den nächsten Schleifendurchlauf eine 2." );
            input = new java.util.Scanner( System.in ).nextInt();

            if(input == 1){
                System.out.println("break ausgeführt.");
                break;
            }

            if (input == 2){
                System.out.println("continue ausgeführt.");
                continue;
            }

            System.out.println("Kein Break und Conitinue ausgeführt.");
        } while ( true );
    }
}