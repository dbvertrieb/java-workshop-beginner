# Zeichenfolgen


###Klasse "String"
Wenn wir in Java Zeichenketten verwenden, d.h. ein oder mehrere Worte speichern und wieder lesen, dann nutzen wir dazu 
eine Variable vom Typ String. Genauer gesagt ein Objekt der Klasse String.

**Aufgabe 1:** Was ist richtig?
```java
String s = new String("Wort");
String s = "AnderesWort";
```

Wenn wir einen String angelgt haben, können wir ihn nicht mehr ändern -> immutable.

**Aufgabe 2:** Funktioniert das?
```java
String a = "abc";
a = a + "xy";
a = "def";

```

Java bietet auch die Möglichkeit mit veränderbaren Zeichenketten zu arbeiten:

**StringBuilder** und **StringBuffer**



##Welche Operationen werden in Regel auf einem String angewendet?

**Länge eines Strings ermitteln**  
**Prüfen ob ein String leer ist**  
**Nach enthaltenen Zeichen und Zeichenfolgen suchen**  
**Zeichenfolgen an einanderhängen**  
**Alle Zeichen des Strings in Klein-/Großbuchgstaben umwandeln**  
**Leerzeichen am Anfang und am Ende entfernen**  
**Zeichen ersätzen**  
**Strings miteinander vergleihen**  
**Strings teilen**  

```jave
String s;

s.length()

s.isEmpty()

s.contains()

s + " "

s.toLowerCase()
s.toUpperCase()

s.trim()

s.replace()

s.equals()
s.equalsIgnoreCase()

s.sustring()
s.substringBefore()
s.substringAfter()
```

**Aufgabe 4:** Was passiert?
```java
String a = "";
String b = " ";

a.length()
a.isEmpty()
b.length()
b.isEmpty()
```

**Aufgabe 5:** Was passiert?
```java
String s = null;
s.length();
```

**Aufgabe 6:** Erstelle ein Programm um zu ermitteln ob ein Teil-String vorkommt  
Beispiel: "sch" in "schlingelschlangel"

**Aufgabe 7:** Erstelle ein Programm, welches das Alter und die Größe in Variablen speichert und diese dann in einem Satz ausgibt  
z.B. **Alter: 38, Groesse: 180 cm**

**Aufgabe 8:** Wandle alle zeichen in Großbuchstaben um  
DasIstEinTestWort

**Aufgabe 9:** Entferne die Leerzeichen aus der Zeichenkette:
" irgendeinwort     "

**Aufgabe 10:** Ersetze jedes p durch ein m  
papa

**Aufgabe 11:** Lege zwei Strings an und prüfe ob ihr Inhalt (Zeichenkette) identisch ist

**Aufgabe 12:** Teile die Zeichenkette in Worte "Winter" und "auto"  
"Winterauto"



##Zeichen von der Komandozeile entgegennehmen

Klasse Scanner

```java
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
```

**Aufgabe 13:** Erstelle ein Programm um eingaben von der Komandozeile entgegenzunehmen

##Zeichenketten formatiert augeben

```java
String s = String.format("Hallo %s. Es gab einen Anruf von %s", "Chris", "Tom");
System.out.println(s);

```

Platzhalter | Beschreibung
--- | ---
**%s** | String
**%f** | Fließkommezahl
**%b** | Boolean
**%d** | Dezimalzahl
**%t** | Datum und Zeit 

**Aufgabe 14:** Erstelle ein Programm, welches das Alter und die Größe in Variablen speichert und diese dann in einem Satz ausgibt. Benutze dazu die String.format Methode.  
z.B. **Alter: 38, Groesse: 180 cm**





