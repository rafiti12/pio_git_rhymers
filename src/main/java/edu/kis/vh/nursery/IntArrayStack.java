package edu.kis.vh.nursery;

public class IntArrayStack {

    public static final int NUMBERS_ARRAY_SIZE = 12;
    public static final int empty = -1;


    private final int[] numbers = new int[NUMBERS_ARRAY_SIZE];

    private int total = empty;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
