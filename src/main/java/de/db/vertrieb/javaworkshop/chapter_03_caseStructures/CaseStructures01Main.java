package de.db.vertrieb.javaworkshop.chapter_03_caseStructures;

import java.util.Scanner;

public class CaseStructures01Main {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 18) {
            System.out.println("Du bist noch nicht volljähring");
        }
    }
}