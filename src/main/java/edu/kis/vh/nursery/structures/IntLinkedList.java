package edu.kis.vh.nursery.structures;

/**
 * Klasa robiąca za listę dwukierunkową z obiektami klasy Node
 */

public class IntLinkedList implements IntStructureInterface {

	public static final Node EMPTY = null;
	public static final boolean NOT_FULL = false;
	private Node last;

	public IntLinkedList(){};

	public IntLinkedList(Node last) {
		this.last = last;
	}

	/**
	 * Dodanie nowego elemntu do klasy Node
	 * @param i wartość do ustawienia w obiekcie Node
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

	// TODO: uzupełnić metodę
	/**
	 * sprawdzenie czy lista jest pusta
	 * @return true jeśli lista jest pusta, false w przeciwnym wypadku
	 */
	public boolean isEmpty() {
		return last == EMPTY;
	}

	// TODO: uzupełnić metodę
	/**
	 * sprawdzenie czy lista jest pełna
	 * @return true jeśli lista jest pusta, false w przeciwnym wypadku
	 */
	public boolean isFull() {
		return NOT_FULL;
	}

	/**
	 * zwraca pierwszy elemnt listy
	 * @return pierwszy elemnt listy lub -1 jeśli lista jest pusta
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STRUCTURE_VALUE;
		return last.getValue();
	}

	/**
	 * usuwa pierwszy elemnt listy
	 * @return wartość usuniętego elementu lub -1 jeśli lista jest pusta
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STRUCTURE_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}


	/**
	 * zwraca ilość elementów - do uzupełnienia
	 * @return ilość elementów
	 */
	public int getTotal() {return 0;}

}
