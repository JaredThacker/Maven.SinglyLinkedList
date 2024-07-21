package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <E extends Comparable<E>> {

    public Node head;

    int size;

    public class Node {
        E data;
        Node next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }



    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(Node element){

    }

}
