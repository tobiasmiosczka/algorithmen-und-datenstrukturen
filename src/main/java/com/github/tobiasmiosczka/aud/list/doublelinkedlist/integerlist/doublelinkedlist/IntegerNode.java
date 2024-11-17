package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.doublelinkedlist;

public class IntegerNode {

    private int value;
    private IntegerNode next;
    private IntegerNode previous;

    public IntegerNode(int value, IntegerNode next, IntegerNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode getPrevious() {
        return previous;
    }

    public void setPrevious(IntegerNode previous) {
        this.previous = previous;
    }
}
