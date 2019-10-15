# Funktionen
* redundanter Code soll nicht erstellt, sondern zentral an einer Stelle definiert werden
* komplexer Code kann in mehrere Funktionen ausgelagert werden, um Komplexität zu mindern
* Gute Namen für Funktionen wählen
* Namensmuster wie bei Variablen

## Bestandteile
* Methodenkopf
    * Modifizierer
    * Rückgabetyp
    * Funktionsname
    * optionale Parameterliste
* Methodenrumpf

Beispiel:
```java
private static void sayHelloTo(String name){
    System.out.println("Hello " + name);
}
```

```java
private static String createWelcomeText(String name){
    return "Hello " + name;
}
```

### Modifizierer
* Sichbarkeit:
    * public
    * protected
    * ohne Angabe
    * **private**

* static
    * static Methoden dürfen nur static Methoden
    und Variablen aufrufen
    * Aufruf ohne Instanzvariable
    * existieren unabhängig von Objekten

### Rückgabetyp
* void (z.B. zum Speichern von Daten verwendet)
* einen bestimmten Typ, z.B. String, int, boolean, ...

### Parameterliste
* ist optional
* es können mehrere Parameter kommasepariert übergeben werden
* zu viele Parameter erhöhen die Komplexität

### Verwendung
```java
public class Main {

    public static void main(String[] args) {
        String welcomeText = createWelcomeText("Eike");
        System.out.println(welcomeText);
    }

    private static String createWelcomeText(String name){
        return "Hallo " + name + ", willkommen bei der DB Vertrieb.";
    }
}
```

**Aufgabe 1:**
1. Erstelle eine Funktion die eine Liste mit euren Namen als Parameter entgegennimmt
und die Namen in jeweils einer neuen Zeile ausgibt.
2. Erstelle eine Funktion die zwei Ganzzahlen als Parameter entgegennimmt,
die Zahlen addiert und die Summe zurückgibt. Gebe das Ergebnis außerhalb der Funktion aus.

## Quellen
* http://openbook.rheinwerk-verlag.de/javainsel/02_007.html#u2.7