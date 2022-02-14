package edu.kis.vh.nursery.structures;

public interface IntStructureInterface {

    int IF_EMPTY = -1;
    int EMPTY_STRUCTURE_VALUE = 0;

    void push(int in);
    int getTotal();
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
}
