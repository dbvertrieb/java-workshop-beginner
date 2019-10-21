# Objekte 

Objekte in der Software haben drei wichtige Eigenschaften:

Jedes Objekt:

- hat eine Identität
- hat einen Zustand
- zeigt ein Verhalten

Identität des Objektes bleibt während des Lebens bis zum Tod die gleich 
und ändert sich nicht. Diese wird über den sogenannten `IdentityHashCode` 
repräsentiert.

## Objekte initialisieren

``` java 
    Zug zug = new Zug();
```

Das Schlüsselwort `new` erzeugt eine neue Instanz eines Objekts vom Typen der 
Klasse. In diesem Beispiel von der Klasse Zug. 
Bei jeder Verwendung des Schlüsselwortes `new` wird ein Bereich 
in der entsprechenden Größe im Arbeitsspeicher (RAM) reserviert.

> Übung:
>
> * Erstelle eine dritte Klasse neben Zug und Waggon mit dem Namen ZugMain
> * Erstelle dort eine Main-Methode
> * Initialisiere in der Main-Methode ein Objekt vom Typ Zug
> * Initialisiere in der Main-Methode drei Objekte vom Typ Waggon 
> * Füge die drei Waggons dem Zug mit deiner selbst definierten Methode hinzu 
 
### Garbage-Collector

Wird dieser Bereich im Arbeitsspeicher nicht mehr benötigt, wird dieser 
in Java durch den sogenannten `Garbage-Collector` wieder freigegeben. 
Der Entwicklungsprozess wird dadurch im Vergleich zu hardwarenahnen Sprachen 
wie `C` oder `C++` wesentlich vereinfacht. Im Gegenzug kostet der Prozess der 
automatischen Speicherbereinigung allerdings etwas an Ressourcen und somit auch
an Performance.


## Null und NullPointerException

Die null-Referenz sagt aus, dass ein Objekt nicht initialisiert wurde. Jedoch wird im weiteren Programmcode 
versucht, auf Methoden des nicht initialisierte Objektes zuzugreifen. Und dies führt zu der sogenannten
`NullPointerException`.

```java
class Zug {

  private Wagon wagon;

  public void setType( String type ) {

    wagon.setType( type );  // inline NullPointerException

  }

}
```

Tony Hoare erfand 1965 die null-Referenz. Heute nennt er seine Entscheidung "my billion-dollar mistake"
da dies zu unzähligen Fehlern, Schwachstellen und Systemabstürzen geführt hat, die in den 
letzten vierzig Jahren wahrscheinlich eine Milliarde Dollar an Schmerzen und Schäden verursacht haben.

## Konstruktoren

Wenn das Schlüsselwort `new` ein Objekt erzeugt, wird der sogenannte Konstruktor 
der Klasse automatisch aufgerufen. Der Konstruktor trägt immer den selben Namen
wie die Klasse.

```java 
class Zug {
    
    Zug(){
    
    }
}
```

Mit dem Konstruktor lässt sich das erzeugten Objekt in einen sinnvollen 
Anfangszustand bringen. Konstruktordeklarationen sehen ähnlich wie 
Methodendeklarationen aus, besitzen jedoch keinen Rückgabetyp, also 
noch nicht einmal `void`.

Wir in einer Klasse kein Konstruktor definiert, legt der Java Compiler 
automatisch einen `default constructor` an.

---

> Übung:
>
> * Erstelle einen Konstruktor für die Klasse Waggon
> * Lege im Konstruktor die Anzahl der vorhandenen Sitzplätze für diesen Wagon fest

---

### Gültigkeitsbereich, Sichtbarkeit und Lebensdauer

Lokale Variablen beginnen ihr Leben in dem Moment, in dem sie deklariert und 
initialisiert werden. Endet der Block, ist die lokale Variable nicht mehr 
gültig, und sie kann nicht mehr verwendet werden, da sie aus dem 
Sichtbarkeitsbereich verschwunden ist. 
Bei Objektvariablen ist das anders. Eine Objektvariable lebt ab dem Moment, 
zu dem das Objekt mit new aufgebaut wurde, und sie lebt so lange, bis der 
Garbage-Collector das Objekt wegräumt. Sichtbar und gültig ist die Variable 
aber immer im gesamten Objekt und in allen Blöcken. 

---

> Zusatzübung:
>
> * Gebe die gesammte Anzahl der verhandenen Sitzplätze des Zuges aus
> * Erstelle dafür eine Methode `getGesamtanzahlSitzplätze` in der Klasse Zug
> * Tipp: die for oder die for-each Schleife ist hier euer Freund

---