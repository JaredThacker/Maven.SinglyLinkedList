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

    public int size(){
        return size;
    }

    public void add(E element){
        Node newNode = new Node(element);
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public E get(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds" + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
}
