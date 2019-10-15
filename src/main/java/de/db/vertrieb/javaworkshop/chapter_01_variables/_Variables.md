# Variablen und Datentypen
* werden genutzt um Werte/Daten zu speichern
* Unterscheidung in primitiven Typen und Referenztypen
* primitive Typen haben einen festen Wertebereich und sind fester Bestandteil von Java (eigene Schlüsselwörter)
* Referenztypen können beliebig selbst definiert 

## Variablen deklarieren und initialisieren
### Deklarieren:
```java
int age; ​
double income; ​
char gender; ​
boolean isVegetarian
```

### Initialisieren:
```java
int age;
age = 25;

int countChildren = 2;
```

**Aufgabe 1:**
1. Deklariere und initialisiere zwei Integer und addiere sie. Verwende System.out.print() zum Ausgeben des Ergebnisses.
2. Gebe zusätzlich vor dem berechneten Wert den Text _'Result: '_ aus.

## Weitere Datenypen
* Sind fester Bestandteil der Sprache (eigene Schlüsselwörter)
* haben einen festgelegten Wertebereich

| Primitiver Typ | Wertebereich                                              | Größe       | Verwendung              | 
| -------------- | --------------------------------------------------------- | ----------- |------------------------ |
| boolean        | true oder false                                           | undefiniert | Wahrheitswerte          |
| char           | 0 bis 65.535                                              | 16 bit      | Alphanumerische Zeichen |
| byte           | -128 bis 127                                              | 8 bit       | ganze Zahlen            |
| short          | -32.768 bis 32.767                                        | 16 bit      | ganze Zahlen            |
| int            | -2.147.483.648 bis 2.147.483.647                          | 32 bit      | ganze Zahlen            |
| long           | –9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807  | 64 bit      | ganze Zahlen            |
| float          | -3.4*10<sup>38</sup> bis +3,4*10<sup>38</sup>             | 32 bit      | Fließkommazahlen        |
| double         | -1.7*10<sup>308</sup> bis +1.7*10<sup>308</sup>           | 64 bit      | Fließkommazahlen        |   

### Boolean
* beschreibt einen Wahrheitswert
* true oder false (reservierte Schlüsselwörter)
* wird für Bedingungen, Verzweigungen oder Schleifen genutzt

```java
boolean isAdult = false;
int age = 35;

isAdult = age>=18; 
```

**Aufgabe 2:**
1. Was ist das Ergebnis von dem Codesnippet?
2. Was ist das Ergebnis wenn du den Wert 13 und 18 für 'age' setzt?
3. Gibt das Ergebnis mit System.out.println() aus.

### Double
* wird zum Speichern von Fließkommazahlen verwendet
* Punkt-Zeichen wird zur Trennung von Nachkommastellen verwendet
* falls ganze Zahlen zugewiesen werden, sollte ein 'D' bzw. 'd' als suffix oder ein Punkt verwendet werden
    * führt bei Berechnungen ansonsten zu fehlerhaften Ergebnis   

```java
double height = 1.78;
...
double age = 8D;
age = 8d;
age = 8.0;
age = 8.;
```

**Aufgabe 4:**
Was ist das Ergebnis von folgendem Code?
```java
int intResult = 3/2;
double doubleResult = 3/2;

System.out.println("Integer result: " + intResult);
System.out.println("Double result: " + doubleResult);
```

## Referenztypen/Objekte
* haben keinen festen Wertebereich
* es wird die Referenz in einer Variablen gespeichert
* Name des Typs fängt mit einem großen Buchtstaben an

```java
Point point = new Point(3,3);
System.out.println(point.toString());

Point changedPoint = point;
changedPoint.x = 1;
changedPoint.y = 1;

System.out.println(point.toString());
``` 

**Aufgabe 5:**
Was ist das Ergebnis von dem Codesnippet?
 
### String
* wird zum Speichern von Zeichenketten verwendet
* Wertzuweisung mit doppelten Hochkommata
* kann wie ein primitiver Datentyp verwendet werden
* zwei Zeichenketten können mit dem '+'-Zeichen konkateniert/zusammengeführt werden
* bietet viele eigene Funktionen zum Bearbeiten einer Zeichenkette

```java
String welcome = "Willkommen bei DB Vertrieb";

String welcome = "Willkommen" + "bei DB Vertrieb";
``` 

**Aufgabe 6:**
Programmiere das Beispiel aus Aufgabe 5 mit dem Datentyp String nach.

### Array
* Speichern mehrere Werte eines Types in einer Liste

#### Deklarieren
```java
int[]   primes; 
Point[] points;
``` 

#### Initialisieren
```java
primes = new int[5];
primes = {2, 3, 5, 7, 11};

String[] strings = {"Haus", "Maus"};
``` 

#### Wert lesen und setzen
**Lesen:**
```java
int[] primes = new int[5];
int[] primes2 = {2, 3, 5, 7, 11};

int value = primes[1]; 
``` 

**Setzen:**
```java
...
primes[1] = 13;
...
```

**Aufgabe 8:**
* Programmiere das Lese-Beispiel nach und gebe den Wert mit System.out.println aus.
* Gebe den Wert für den Index [-1], [0] und [10] aus.

#### Sonstiges
* Auf die Länge zugreifen:
```java
...
System.out.println( primes.length);
...
```

* Mehrdimensionale Arrays
```java
...
int[][] matrix = new int[4][4];
...
```

## Variablennamen
* Lesbare Namen verwenden
* Semantisch korrekte Namen verwenden
* Camel-Case-Konvention
* erster Buchstabe wird kleingeschrieben
* Namen sollten in Englisch deklariert werden

**Don’ts:**
```java
int p;
String animal_String, Animal;
String gamename, GAMENAME;
```

**Dos:**
```java
int prime;
String animal;
String gameName;
```

## Quellen
* https://panjutorials.de/tutorials/java-tutorial-programmieren-lernen-fuer-anfaenger/lektionen/datentyp-integer/
* https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen#cite_note-2
* http://openbook.rheinwerk-verlag.de/javainsel/02_003.html#u2.3
* http://www.scalingbits.com/book/export/html/46
* http://openbook.rheinwerk-verlag.de/javainsel/03_008.html#u3.8
