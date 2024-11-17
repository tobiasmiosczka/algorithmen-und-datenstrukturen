package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist;

public interface IntegerList {

    /**
     * Fügt einen Wert an das Ende der Liste hinzu.
     *
     * @param value Wert, der hinzugefügt wird
     */
    void add(int value);

    /**
     * Gibt den Wert des Elements mit dem Index i zurück.
     *
     * @param index der Index des zurückgegebenen Elements
     * @return den Wert des Elements mit dem angegebenen Index
     * @throws IndexOutOfBoundsException Falls ein ungültiger Index angegeben wurde
     */
    int get(int index);

    /**
     * Gibt die Anzahl der Elemente der Liste zurück.
     *
     * @return Anzahl der Elemente in der Liste
     */
    int size();

    /**
     * Überschreibt den Wert des Elements mit dem angegebenen Index
     *
     * @param value der neue Wert
     * @param index Index des Elementes, welches überschrieben wird
     * @throws IndexOutOfBoundsException Falls ein ungültiger Index angegeben wurde
     */
    void set(int value, int index);

    /**
     * Fügt einen Wert an den angegebenen Index hinzu. Alle folgenden Elemente rücken entsprechend eine Position auf.
     *
     * @param value Wert, der hinzugefügt wird
     * @throws IndexOutOfBoundsException falls ein negativer Index angegeben wurde
     */
    void addAt(int value, int index);

    /**
     * Gibt an, ob die Liste leer ist.
     *
     * @return <code>true</code>, falls die Liste leer ist. <code>false</code>, falls die Liste nicht leer ist.
     */
    boolean isEmpty();

    /**
     * Entfernt das erste Element mit dem angegebenen Wert. Gibt true zurück, falls ein Element entfernt wurde.
     * Falls kein Element entfernt wurde, wird false zurückgegeben.
     *
     * @param value Wert, der entfernt werden soll
     * @return true, falls ein Element entfernt wurde. False, falls kein Element entfernt wurde.
     */
    boolean removeFirst(int value);

    /**
     * Entfernt das letzte Element mit dem angegebenen Wert. Gibt true zurück, falls ein Element entfernt wurde.
     * Falls kein Element entfernt wurde, wird false zurückgegeben.
     *
     * @param value Wert, der entfernt werden soll
     * @return true, falls ein Element entfernt wurde. False, falls kein Element entfernt wurde.
     */
    boolean removeLast(int value);

    /**
     * Entfernt alle Elemente mit dem angegebenen Wert. Gibt die Anzahl der Elemente zurück, die entfernt wurde.
     *
     * @param value Wert, der entfernt werden soll
     * @return Anzahl der Elemente, die Entfernt wurden
     */
    int removeAll(int value);


    /**
     * Gibt eine neue {@link IntegerList} zurück, welche alle Elemente der Liste in umgekehrter Reihenfolge beinhaltet.
     *
     * @return Liste mit allen Elementen in umgekehrter Reihenfolge
     */
    IntegerList reverse();

    /**
     * Gibt eine neue {@link IntegerList} zurück, welche alle Elemente der Liste in aufsteigender Reihenfolge
     * beinhaltet.
     *
     * @return sortierte {@link IntegerList}
     */
    IntegerList sortAsc();

    /**
     * Gibt eine neue {@link IntegerList} zurück, welche alle Elemente der Liste in absteigender Reihenfolge
     * beinhaltet.
     *
     * @return sortierte {@link IntegerList}
     */
    IntegerList sortDesc();

    /**
     * Gibt eine neue {@link IntegerList} zurück, welche alle Elemente der Liste in zufälliger Reihenfolge beinhaltet.
     * @return gemischte {@link IntegerList}
     */
    IntegerList random();

    /**
     * Fügt alle Werte einer zweiten {@link IntegerList} dieser Liste hinzu.
     * @param values {@link IntegerList} mit hinzuzufügenden Werten
     */
    void addAll(IntegerList values);
}
