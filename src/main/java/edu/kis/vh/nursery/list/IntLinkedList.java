package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentujaca liste jednokierunkowa przechowujaca liczby calkowite.
 */
public class IntLinkedList {
    private static final int IF_EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Zwraca wartosc ktora patrzy czy lista jest pusta
     *
     * @return wartosc -1, oznacza pustal liste 
     */
    public static int getIfEmpty() {
        return IF_EMPTY;
    }

    /**
     * Dodaje liczbe calkowita na koniec listy
     *
     * @param i liczba calkowita do dodania do listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza czy lista jest pusta
     *
     * @return true, jesli lista jest pusta; false, w przeciwnym razie
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pelna. Zawsze zwraca false, poniewaz lista nigdy nie jest pelna.
     *
     * @return zawsze false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartosc na koncu listy bez jej usuwania.
     *
     * @return wartosc na koncu listy lub IF_EMPTY, jesli lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca wartosc na koncu listy.
     *
     * @return wartosc na koncu listy lub IF_EMPTY, jesli lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Zwraca ostatni wezel w liscie.
     *
     * @return ostatni wezel w liscie
     */
    public Node getLast() {
        return last;
    }

    /**
     * Ustawia ostatni wezel w liscie.
     *
     * @param last wezel do ustawienia jako ostatni
     */
    public void setLast(Node last) {
        this.last = last;
    }

    /**
     * Zwraca wartosc pola i.
     *
     * @return wartosc pola i
     */
    public int getI() {
        return i;
    }

    /**
     * Ustawia wartosc pola i.
     *
     * @param i wartosc do ustawienia w polu i
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * Klasa reprezentujaca pojedynczy wezel w liscie.
     */
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Tworzy wezel z podana wartoscia.
         *
         * @param i wartosc wezla
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca wartosc wezla.
         *
         * @return wartosc wezla
         */
        public int getValue() {
            return value;
        }

        /**
         * Zwraca poprzedni wezel w liscie
         *
         * @return poprzedni wezel w liscie
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia poprzedni wezel w liscie.
         *
         * @param prev wezel do ustawienia jako poprzedni
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca nastepny wezel w liscie.
         *
         * @return nastepny wezel w liscie
         */
        public Node getNext() {
            return next;
        }

        /**
         * Ustawia nastepny wezel w liscie.
         *
         * @param next wezel do ustawienia jako nastepny
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
