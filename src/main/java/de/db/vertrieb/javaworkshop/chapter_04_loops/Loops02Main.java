package de.db.vertrieb.javaworkshop.chapter_04_loops;

public class Loops02Main {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 10 + 1);
        int guess;

        do {
            System.out.println( "Welche Zahl denke ich mir zwischen 1 und 10?" );
            guess = new java.util.Scanner( System.in ).nextInt();

            if ( number > guess )
                System.out.println( "Falsch, meine Zahl ist größer." );
            else if (number < guess)
                System.out.println( "Falsch, meine Zahl ist kleiner." );

        } while ( number != guess );

        System.out.println( "Super getippt!" );
    }
}