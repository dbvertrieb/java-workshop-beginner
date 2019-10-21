package de.db.vertrieb.javaworkshop;

import java.util.Scanner;

public class HelloWorldMain {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        String input = new Scanner(System.in).nextLine();

        System.out.println("Your input: " + input);
    }
}
