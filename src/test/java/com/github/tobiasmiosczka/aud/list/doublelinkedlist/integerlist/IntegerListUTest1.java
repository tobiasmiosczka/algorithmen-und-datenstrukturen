package com.github.tobiasmiosczka.aud.list.doublelinkedlist.integerlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class IntegerListUTest1 {

    protected abstract IntegerList generateEmptyList();

    @Test
    public void testAddWithPositiveInteger() {
        //arrange
        IntegerList list = generateEmptyList();

        //act
        list.add(5);

        //assert
        assertEquals(1, list.size());
        assertEquals(5, list.get(1));
    }

    @Test
    public void testAddWithNegativeInteger() {
        //arrange
        IntegerList list = generateEmptyList();

        //act
        list.add(-5);

        //assert
        assertEquals(1, list.size());
        assertEquals(-5, list.get(1));
    }

    @Test
    public void testAddWithZero() {
        //arrange
        IntegerList list = generateEmptyList();

        //act
        list.add(0);

        //assert
        assertEquals(1, list.size());
        assertEquals(0, list.get(1));
    }

    @Test
    public void testSizeWithEmptyListShouldReturn0() {
        //arrange
        IntegerList list = generateEmptyList();

        //act
        int size = list.size();

        //assert
        assertEquals(0, size);
    }

    @Test
    public void testSizeWithListContainingSingeValueShouldReturn1() {
        //arrange
        IntegerList list = generateEmptyList();
        list.add(42);

        //act
        int size = list.size();

        //assert
        assertEquals(1, size);
    }

    @Test
    public void testSizeWithListContainingMultipleValuesShouldReturnActualSize1() {
        //arrange
        IntegerList list = generateEmptyList();
        list.add(42);
        list.add(43);
        list.add(44);
        list.add(45);
        list.add(46);

        //act
        int size = list.size();

        //assert
        assertEquals(5, size);
    }

    @Test
    public void testSizeWithListContainingMultipleValuesShouldReturnActualSize2() {
        //arrange
        IntegerList list = generateEmptyList();
        list.add(42);
        list.add(43);
        list.add(44);
        list.add(45);
        list.add(46);
        list.add(47);
        list.add(48);
        list.add(49);
        list.add(50);
        list.add(51);

        //act
        int size = list.size();

        //assert
        assertEquals(10, size);
    }

    @Test
    public void testSizeWithListContainingMultipleDuplicateValuesShouldReturnActualSize1() {
        //arrange
        IntegerList list = generateEmptyList();
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);

        //act
        int size = list.size();

        //assert
        assertEquals(5, size);
    }

    @Test
    public void testSizeWithListContainingMultipleDuplicateValuesShouldReturnActualSize2() {
        //arrange
        IntegerList list = generateEmptyList();
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(42);

        //act
        int size = list.size();

        //assert
        assertEquals(10, size);
    }
}