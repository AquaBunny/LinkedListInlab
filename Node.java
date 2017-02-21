package com.company;

/**
 * Created by Daniel on 2/21/2017.
 */
public class Node<T> {
    private T t;
    private Node next = null;
    private Node last = null;

    //Creates the node
    public Node (T t) {
        this.t = t;
    }

    //Returns the value of T
    public T getT() {
        return t;
    }

    //Sets the next node
    public void setNext(Node node) {
        this.next = node;
    }

    //Sets the previous node
    public void setLast(Node node) {
        this.last = node;
    }

    //Gets the next node
    public Node getNext() {
        return this.next;
    }

    //Gets the previous node
    public Node getLast() {
        return this.last;
    }

    //Overrides toString to properly print node
    public String toString() {
        return this.t.toString();
    }
}
