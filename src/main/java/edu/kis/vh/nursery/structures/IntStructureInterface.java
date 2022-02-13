package edu.kis.vh.nursery.structures;

public interface IntStructureInterface {

    int IF_EMPTY = -1;

    void push(int in);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
}
