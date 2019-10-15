package de.db.vertrieb.javaworkshop.chapter_06_strings;

public class String11Main {

    public static void main(String[] args) {

        String p = "papa";
        String b = "papa";
        String m = "mama";

        boolean w = p.equals(m);
        System.out.println(w);

        w = m.equals(b);
        System.out.println(w);

        w = p.equals(b);
        System.out.println(w);

        w = b.equals(p);
        System.out.println(w);

    }

}
