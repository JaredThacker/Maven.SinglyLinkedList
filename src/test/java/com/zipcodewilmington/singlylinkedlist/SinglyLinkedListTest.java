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
}
