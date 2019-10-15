# Klassen und Objektorientierung

Java ist eine objekorientierte Programmiersprache. Das Konzept der 
Objektorientierung soll Objekte der realen Welt mit ihren
Eigenschaften und ihrem Verhalten in geeigneter Weise nachbilden. 
Man versucht dabei ein Programm so modellieren, dass unterschiedliche Objekte 
mit einander interagieren.  

## Klassen

Eine Klasse ist der Bauplan eines Objektes in Java. Durch das herunterbrechen des 
Quellcodes eines Programms in viele kleine Teile (Klassen) schafft 
man es die Komplexität zu verringern. 
Für einen Entwickler wird der Quellcode dadurch übersichtlicher und 
wesentlich leichter zu verstehen. 

Eine Klasse wird durch das Schlüsselwort *class* eingeleitet. 

```java 
class Zug { }
```

### Eigenschaften deklarieren

Innerhalb einer Klasse können folgende Eigenschaften deklariert werden:

* Attribute (Variablen)
* Methoden
* Konstruktoren
* Klassen- sowie Exemplarinitialisierer
* innere Klassen, innere Schnittstellen und innere Aufzählungen

Klassen sind also eine Art Container für diese Eigenschaften. 

#### Attribute

In Attributen einer Klasse werden die Eigenschaften eines Objektes definiert. 
Diese werden auch Variable genannt. Eine Variable in Java wird immer mit einem 
Datentyp definiert. Dieser Datentyp sagt aus, was wir in dieser Variablen 
speichern dürfen. Beispielsweise primitive Datentypen wie Ganzzahlen (int), 
Zeichenketten (Strings), Fließkommazahlen (float), usw.

``` 
    Datentyp Name;
```  

oder 

``` 
    Datentyp Name = Wert;
```

Beispiel:
```java
class Zug {

    String id;
    String typ = "ICE";
    int anzahl_wagons;
    boolean speisewagen;
}
```

#### Methoden

Funktionen innerhalb eines Klassenkontext nennt man eine Methode. In Methoden 
wird das Verhalten eines Objektes abgebildet.

Die Main Methode der Einstiegspunkt jedes Java Programms

```java
class Zug {
    
    public static void main(String args){
        
    }

}
```

Die Methodendeklaration besteht aus einem Methodenkopf und einem Methodenrumpf.
Der Methodenkopf besteht mindestens aus einem Rückgabetypen und dem Methodennamen.
Optional kann die Methode statisch aufgerufen werden, einen 
Sichtbarkeitsmodifizierer definieren und eine Parameterliste beinhalten.


```java
class Zug {

    void printWhatIAm(){
        System.out.println("Ich bin ein Zug!");
    }

}
```

#### Methoden mit Parametern und Argumenten

Einer Methode können Werte übergeben werden, welche sie in ihrem Ablauf 
verwenden kann. 

```java
class Zug {
    
    int currentSpeedInKmh;

    static void accelerate(int acceleration){
        currentSpeedInKmh = currentSpeedInKmh + acceleration; 
    }

}
```

#### Methoden mit Rückgaben

Methoden haben die Möglichkeit Rückgabewerte an den Aufrufer zurückzuliefern.
Dies ist mit dem Schlüsselwort `return` möglich.

Die return-Anweisung gibt einen Wert in dem Typen der Methodendeklaration 
zurück. Diese darf nicht `void` sein.

```java
class Zug {

    int speed;

    static int speed(){
        return speed;
    }

}
```

## Sichtbarkeitsmodifizierer

- public
- protected
- privat

Geheimnisprinzip 

##### Getter und Setter Methoden 




## Komplexe Datentypen