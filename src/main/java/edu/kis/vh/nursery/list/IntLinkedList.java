package edu.kis.vh.nursery.list;

/**
 * Klasa robiąca za listę dwukierunkową z obiektami klasy Node
 */

public class IntLinkedList {

	public static final Node EMPTY = null;
	public static final int IF_EMPTY = -1;
	public static final boolean NO_FULL = false;
	
	private Node last;
	private int index;

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
		return NO_FULL;
	}

	/**
	 * zwraca pierwszy elemnt listy
	 * @return pierwszy elemnt listy lub -1 jeśli lista jest pusta
	 */
	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return last.getValue();
	}

	/**
	 * usuwa pierwszy elemnt listy
	 * @return wartość usuniętego elementu lub -1 jeśli lista jest pusta
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
