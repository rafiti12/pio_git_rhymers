package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	IntArrayStack arrStack;

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
		arrStack.countIn(in);
	}

	public boolean callCheck() {
		return arrStack.callCheck();
	}

	public boolean isFull() {
		return arrStack.isFull();
	}

	public int peekaboo() {
		return arrStack.peekaboo();
	}

	public int countOut() {
		return arrStack.countOut();
	}
}