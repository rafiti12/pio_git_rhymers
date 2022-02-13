package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;

public class DefaultCountingOutRhymer {
	private IntArrayStack arrStack;

	public DefaultCountingOutRhymer(IntArrayStack arrStack) {
		this.arrStack = arrStack;
	}

	public DefaultCountingOutRhymer(){
		this.arrStack = new IntArrayStack();
	}

	public int getTotal() {
		return arrStack.getTotal();
	}

	public void countIn(int in) {
		arrStack.push(in);
	}

	public boolean callCheck() {
		return arrStack.isEmpty();
	}

	public boolean isFull() {
		return arrStack.isFull();
	}

	public int peekaboo() {
		return arrStack.top();
	}

	public int countOut() {
		return arrStack.pop();
	}
}