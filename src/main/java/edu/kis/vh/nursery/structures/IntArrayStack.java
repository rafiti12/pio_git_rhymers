package edu.kis.vh.nursery.structures;

public class IntArrayStack implements IntStructureInterface {

    public static final int NUMBERS_ARRAY_SIZE = 12;
    private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];
    private int total = IF_EMPTY;

    public IntArrayStack(){};

    public IntArrayStack(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == IF_EMPTY;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE - 1;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        return numbers[total--];
    }

}
