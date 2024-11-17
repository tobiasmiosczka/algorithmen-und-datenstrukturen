package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.singlelinkedlist;

import com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.IntegerList;
import com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist.IntegerListTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedIntegerListTest extends IntegerListTest {

    @Override
    protected IntegerList generateEmptyList() {
        return new SingleLinkedIntegerList();
    }
}