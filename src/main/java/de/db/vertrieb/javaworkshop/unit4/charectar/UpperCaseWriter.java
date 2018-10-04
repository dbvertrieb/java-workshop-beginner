package de.db.vertrieb.javaworkshop.unit4.charectar;

public class UpperCaseWriter {
    public static void main(String[] args) {

        String input = new java.util.Scanner( System.in ).nextLine();

        for ( int i = 0; i < input.length(); i++ ) {
            char c = input.charAt( i );

            if ( Character.isWhitespace( c ) )
                System.out.print( '_' );
            else if ( Character.isLetter( c ) )
                System.out.print( Character.toUpperCase( c ) );
        }
    }
}
