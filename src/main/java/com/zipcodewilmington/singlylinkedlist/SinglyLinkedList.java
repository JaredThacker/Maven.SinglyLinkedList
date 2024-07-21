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
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds" + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds" + size);
        }
        if (index == 0){
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean contains(E element){
        Node current = head;
        while (current != null){
            if(current.data.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(E element){
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.data.equals(element)){
                return index;
            }
            current = current.next;
            index++;
        }
       return -1;
    }

    public SinglyLinkedList<E> copy(){
        SinglyLinkedList<E> copy = new SinglyLinkedList<>();
        Node current = head;
        while (current != null){
            copy.add(current.data);
            current = current.next;
        }
        return copy;
    }

    public void sort (){
        Node current = head;
        Node index;
        E temp;
        while (current != null){
            index = current.next;
            while (index != null){
                if (current.data.compareTo(index.data) > 0) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            index = index.next;
            }
        current = current.next;
        }
    }

    public void reverse(){
        if (head == null || head.next == null){
            return;
        }
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public SinglyLinkedList<E> slice(int start, int end){
        if (start < 0 || end > size || start >= end) {
            throw new IllegalArgumentException("Invalid slice indices");
        }
        SinglyLinkedList<E> sliced = new SinglyLinkedList<>();
        Node current = head;
        int index = 0;
        while (current != null){
            if (index >= start && index < end){
                sliced.add(current.data);
            }
            current = current.next;
            index++;
        }
        return sliced;
    }
}
