package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> list;

    @Before
    public void setUp(){
        list = new SinglyLinkedList<>();
    }

    @Test
    public void testAdd(){
        list.add(2);
        Integer expected = 2;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void testGet(){
        list.add(1);
        list.add(2);
        Integer expected = 2;
        Assert.assertEquals(expected, list.get(1));
    }

    @Test
    public void testSize(){
        list.add(1);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testRemove(){
        list.add(1);
        list.add(2);
        list.remove(1);
        Assert.assertEquals(1,list.size);
    }

    @Test
    public void testContains(){
        list.add(1);
        list.add(2);
        Assert.assertTrue(list.contains(2));
    }

    @Test
    public void testFind(){
        list.add(1);
        Assert.assertEquals(0,list.find(1));
    }

    @Test
    public void testCopy(){
        list.add(1);
        list.add(2);
        SinglyLinkedList<Integer> copy = list.copy();
        Assert.assertNotSame(list, copy);
    }

    @Test
    public void testSortAscending1(){
        list.add(3);
        list.add(2);
        list.add(1);
        list.sortAscending();
        Integer expected = 1;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void testSortAscending2(){
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.sortAscending();
        Integer expected = 1;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void testSortDescending(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.sortDescending();
        Integer expected = 3;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void quickSortAscending(){
        list.add(3);
        list.add(2);
        list.add(1);
        list.quickSort(true);
        Integer expected = 1;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void quickSortDescending(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.quickSort(false);
        Integer expected = 3;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void testReverse(){
        list.add(3);
        list.add(2);
        list.reverse();
        Integer expected = 2;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void testSlice(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        SinglyLinkedList<Integer> slice = list.slice(1,3);
        Integer expected = 2;
        Assert.assertEquals(expected, slice.get(0));
    }
}
