package de.db.vertrieb.javaworkshop;

public class VariablenTask7Main {
    public static void main(String[] args) {
        String welcome = "Willkommen bei DB Vertrieb.";
        System.out.println(welcome.toLowerCase());
        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.length());
        System.out.println(welcome.contains("Vertrieb"));
        System.out.println(welcome.endsWith("b."));
    }
}