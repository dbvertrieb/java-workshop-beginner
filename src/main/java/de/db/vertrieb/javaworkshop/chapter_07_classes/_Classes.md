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
class Main {
    
    public static void main(String args[]){
        
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

class Main {
    
    public static void main(String args[]){
        Zug zug = new Zug();
        zug.printWhatIAm();
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

Innerhalb einer Klasse sind alle Methoden und Attribute für die Methoden sichtbar. 
Um den Zugriff von außerhalb der Klasse steuern zu können gibt es verschiedene Sichtbarkeitsmodifizierer:

- paketsichtbar (ohne Modifizierer)
Wie der Name sagt, ist alles innerhalb eine Pakets in Java sichtbar

- public (öffentlich)
Von außen für jeden sichtbar sind. Es spielt dabei keine Rolle, ob sich der Nutzer im gleichen oder 
in einem anderen Paket befindet.

- private (privat)
Verbietet allen von außen zugreifenden Klassen den Zugriff auf Eigenschaften

- protected (geschützt)
Hat mit dem weiterführenden Thema Vererbung zu tun, welches nicht Teil dieser Schulung ist.

Diese können an Attribute, Methoden, Konstruktoren und Klassen angebracht werden.

Ist zwar die Klasse public, aber eine Eigenschaft privat, kann eine fremde Klasse dennoch nicht auf 
die Eigenschaft zurückgreifen. Und ist eine Eigenschaft public, aber die Klasse privat, 
dann kann eine andere Klasse erst gar nicht an diese Eigenschaft herankommen.

Beim modellieren von Sichtbarkeitsmodifizierern sollte immer das Geheimnisprinzip umgesetzt werden. 
Verwendet ein Entwickler eine Klasse, sollte so wenig wie möglich über das Innenleben der Klasse 
bekannt, weitgehend geheim und von Außen nicht sichtbar sein. Der Zugriff von Außen funktioniert einzig 
und allein über definierte Schnittstellen. 

### Getter und Setter Methoden 

Ein sehr häufig verwendetes Beispiel für definierte Schnittstellen sind sogenannte Getter- und 
Setter-Methoden. Diese werden auch Zugriffsmethoden genannt. 
Dabei kann für jedes Attribut nach einem festen Namensschema laut JavaBeans-Konvention 
eine Schreib- und Lesemethode deklariert werden.  

```java
public class Zug {

    private String type;

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
```

## Komplexe Datentypen

Attribute können nicht nur von primitiven Datentypen (int, String, ...) sondern auch 
komplexe Datentypen sein. Komplexe Datentypen sind eigene geschriebene Klassen,
die als Datentyp für ein Attribut verwendet werden.

```java
public class Zug {
    
    private String id;
    private Wagon[] wagon;

}
```
