# Zeichenfolgen


Klasse "String"
Wenn wir in Java Zeichenketten verwenden, d.h. ein oder mehrere Worte speichern und wieder lesen, dann nutzen wir dazu 
eine Variable vom Typ String. Genauer gesagt ein Objekt der Klasse String.

**Was ist richtig?**
```java
String s = new String("Wort");
String s = "AnderesWort";
```

Wenn wir einen String angelgt haben, können wir ihn nicht mehr ändern -> immutable.

**Funktioniert das?**
```java
String a = "abc";
a = a + "xy";
a = "def";

```

Java bietet auch die Möglichkeit mit veränderbaren Zeichenketten zu arbeiten:

StringBuilder
StringBuffer



##Welche Operationen werden in Regel auf einem String angewendet?**

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
s.isNullOrEmpty()

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


##Zeichen von der Komandozeile entgegennehmen

Klasse Scanner

```java
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
```

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



```java
"Hi Chris".length();
```




```

### String-Länge und Test auf Leer-String

**Aufgabe:** Was passiert?
````java
"".length()
"".isEmpty()
" ".length()
" ".isEmpty()
````

**Aufgabe:** Was passiert?
````java
String s = null;
s.length();
````

### Zugriff auf ein bestimmtes Zeichen mit charAt( )

```java
charAt( )
```
**Aufgabe:** Gib das **erste** und das **letzte** Zeichen einer Zeichenkette aus


### Nach enthaltenen Zeichen und Zeichenfolgen suchen

```java
contains(CharSequence) 
```

**Aufgabe:** Erstelle zwei Strings. Der zweite String soll ein Teilstring des ersten sein. Suche nach dem zweiten String im ersten String


#### Fundstelle mit indexOf(…) zurückgeben

```java
indexOf(…)
```
**Aufgabe:** Suche die Stelle an der ein Bestimmtes Zeichen einer Zeichenkette vorkommt

#### Vom Ende an suchen

```java
lastIndexOf(…)
```

#### Anzahl der Teil-Strings einer Zeichenkette 

**Aufgabae** Erstelle ein Programm um zu ermitteln wie oft ein Teil-String vorkommt

Beispiel: "sch" in "schlingelschlangel"

