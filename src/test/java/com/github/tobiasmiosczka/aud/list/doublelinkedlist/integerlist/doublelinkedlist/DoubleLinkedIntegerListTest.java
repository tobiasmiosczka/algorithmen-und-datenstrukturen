package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.doublelinkedlist;

import com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.IntegerList;
import com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.IntegerListUTest1;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedIntegerListTest extends IntegerListUTest1 {

    @Override
    protected IntegerList generateEmptyList() {
        return new DoubleLinkedIntegerList();
    }
}