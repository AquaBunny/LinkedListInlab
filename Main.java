package com.company;

/**
 * Daniel Bachler
 * 2/21/17
 * LinkedLists Inlab
 *
 * Takes a given array and creates a linkedlist of nodes, then creates a reversed version of the list
 */

public class Main {



    public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    createList(list);
	    list.printList();
	    System.out.println("\n\n\n");
	    LinkedList backwardsList = reverseList(list);
	    backwardsList.printList();
    }

    //Creates the initial list
    private static void createList(LinkedList list) {
        String[] names = {"Dan", "Seth", "Kevin", "Tanner", "Tamar", "Sophia", "Zach", "August", "Sean", "Jack"};
        //Creates a node for each name in the list
        for(String name: names) {
            Node<String> node = new Node<>(name);
            list.addItem(node);
        }
    }

    //Reverses and returns any given list, regardless of node type
    private static LinkedList reverseList(LinkedList list) {
        //Creates the list that will be returned
        LinkedList fillMe = new LinkedList();
        //Gets the first node in the list to reverse
        Node temp = list.getFirst();
        //Goes to the end of the list
        Node node = new Node(temp.getT());
        fillMe.addItem(node);
        while(temp.getNext() != null) {
            temp = temp.getNext();
            node = new Node(temp.getT());
            node.setNext(null);
            fillMe.addItem(node);
        }
        return fillMe;
    }

}
