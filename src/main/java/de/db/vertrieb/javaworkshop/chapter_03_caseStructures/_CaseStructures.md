# Fallunterscheidungen
* Ausführung von Code nur wenn ein bestimmter Zustand vorhanden ist
    * Beispiel: Anzeige eines Hinweistextes bei Minderjährigen
* Besteht aus Bedingungskopf und -rumpf

## If-Bedingung
```java
if (age < 18) {
    System.out.println("Du bist noch nicht volljähring");
}
```

**Aufgabe 1:**
* Programmiere den Code nach und initialisiere die Variable 'age'
* Erweitere den Code, sodass bei einem Alter >= 18 der Text 'Du bist volljähring. Viel spaß!'
ausgegeben wird
* Statt dem Initialisieren der Variable 'age' kann auch der Wert auch in der Console eingegeben werden:
```java
System.out.println("Enter your age: ");
int age = new Scanner(System.in).nextInt();
 ```

## If-Else-Bedingung
* 'else'-Code wird ausgeführt wenn die Bedinung für 'if' nicht erfüllt ist

```java
if (age < 18) {
    System.out.println("Du bist noch nicht volljähring");
} else {
    System.out.println("Du bist volljähring. Viel spaß!");
}
```

**Aufgabe 2:**
Erweitere den Code aus Aufgabe 1 um die Else Bedingung.

## Mehrfachverzweigung mit Else-If-Bedingungen
```java
if (age < 18) {
    ...
} else if (age < 30) {
    ...
} else if (age < 50) {
    ...
} else {
    ...
}
```

**Aufgabe 3:**
Programmiere mit Hilfe von Else-If-Bedingungen einen Nummer-In-Monat-Parser. Bei Eingabe
einer '1' soll 'Januar' ausgegeben werden. Bei '2' 'Februar' und so weiter.

## Geschweifte Klammern
* können auch weggelassen werden, jedoch wird dann nur die erste Anweisung der Bedingung zugewiesen

**Frage 1:**
Was wird jeweils ausgegeben:
```java
int age = 20;
if (age < 18) {
    System.out.println("Du bist noch nicht volljähring");
    System.out.println("Und ich bin eine zweite Anweisung");
}
```

```java
int age = 20;
if (age < 18)
    System.out.println("Du bist noch nicht volljähring");
    System.out.println("Und ich bin eine zweite Anweisung");

```

## Bedingungsoperator:
* Kann als Kurzform-Variante von If-Else verwendet werden
```java
int a = 10;
int b = 5;
int max = ( a > b ) ? a : b;
```

## Switch-Case
* Kann als Alternative zu Mehrfachverzweigungen mit Else-If-Bedingungen verwendet werden
* Als Bedingung werden nur feste Werte benutzt (keine Vergleichs- oder logische Anweisungen)

```java
int age = 20
switch ( age ) {
    case 20:
        System.out.println("Du bist 20 Jahre alt");
        break;
    case 30:
        System.out.println("Du bist 30 Jahre alt");
        break;
    default:
        System.out.println("Du bis weder 20 noch 30 Jahre alt");
}
```

Folgendes ist nicht möglich:
```java
    int age = 20
    switch ( age) {
        case (age < 18):
            ...
            break;
        case ( age >= 18):
            ...
            break;
    }
```

* Das 'break' ist notwendig, da die Ausführung ansonsten in den nächsten 'case'-Block springt.

**Aufgabe 4:**
* Baue den Code aus Aufgabe 3 mit Switch-Case um.
* Entferne die 'Break's und führe den Code nochmal aus

## Einrücken
* **ist entscheidend für die Lesbarkeit des Codes**

## Quellen
* http://openbook.rheinwerk-verlag.de/javainsel/02_005.html#u2.5