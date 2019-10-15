# Schleifen
* dienen zum mehrmaligen Durchführen von Anweisungen
* besteht aus Schleifenbedingung und -rumpf
* läuft so lange, bis die Bedingung nicht mehr erfüllt ist

## While-Schleife
```java
int number = 1;
while ( number < 11 ) {
    System.out.println(number);
    number++;
}
```

**Aufgabe 1:**
Programmiere einen Countdown und gebe jeden Wert angefangen bei 10 aus.

**Frage 1:**
Was ist eine Endlosschleife?

## Do-While-Schleife
* Prüfung der Bedingung findet erst nach dem ersten Durchlauf statt
```java
do {
    ...
} while ( number != 10 );
```

**Aufgabe 2: Zahl erraten**
1. Lasse mit Hilfe folgender Anweisung eine Zufallszahl zwischen 1 und 10 generieren:
    ```java
    int number = (int) (Math.random() * 10 + 1);
    ```
2. Lass den Anwender eine Zahl eingeben:
    ```java
    new java.util.Scanner( System.in ).nextInt();
    ```
3. Gebe aus ob die eingegebe Zahl ...
    * ...der generierten Zahl entspricht
    * ...kleiner ist als die generierte Zahl
    * ...größer ist als die generierte Zahl

4. Führe die Schleife solange durch, bis die generierte Zahl erraten wurde

## For-Schleife
* ähnlich wie die While-Schleife
* enthält einen Schleifenzähler (Laufvariable)
```java
for ( int i = 1; i <= 10; i++ ){
    System.out.println( i );
}
```

**Frage 2:**
Wie oft wird der Schleifenrumpf ausgeführt?
```java
for ( int i = 11; i <= 10; i++ ){
    System.out.println( i );
}
```

**Aufgabe 3:**
Programmiere den Countdown mit einer For-Schleife

## For-Each-Schleife
* wird zum Durchlaufen von Listen verwendet
* hat keinen Schleifenzähler

```java
String[] animalNames = {"Löwe", "Affe", "Schwein", "Kuh"};

for (String animal : animalNames){
    System.out.println(animal);
}
```

**Aufgabe 4:**
Gebe mit Hilfe einer For-Each-Schleife die Primzahlen zwischen 1 und 10.000 aus
(siehe <https://de.wikibooks.org/wiki/Primzahlen:_Tabelle_der_Primzahlen_(2_-_100.000)>).
Initialisiere vorher die Zahlen in einem Array.

## break und continue in Scheifen
* __break__ bricht das Ausführen der Schleife ab
* __continue__ springt zur nächsten Schleifendurchführung

## Quellen
* http://openbook.rheinwerk-verlag.de/javainsel/02_006.html#u2.6