package com.company;

/**
 * Created by Daniel on 2/21/2017.
 */
public class LinkedList {
    private Node first;

    //Adds an item to the list
    public void addItem(Node node) {
        if(first == null) {
            first = node;
        } else{
            node.setNext(first);
            first.setLast(node);
            first = node;

        }
    }

    //Prints the list
    public void printList() {
        //Gets the first node and iterates through the list until it hits the end
        Node temp = first;
        while(temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    //Returns the first node in the list
    public Node getFirst() {
        return first;
    }
}
