package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.singlelinkedlist;

public class IntegerNode {

    private int value;
    private IntegerNode next;

    public IntegerNode(int value, IntegerNode next) {
        this.value = value;
        this.next = next;
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
}
