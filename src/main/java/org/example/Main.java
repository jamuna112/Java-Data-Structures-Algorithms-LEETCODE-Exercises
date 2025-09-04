package org.example;

import org.example.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Red");

        cookieOne.setColor("Yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        LinkedList ll = new LinkedList(7);

        ll.append(6);
        ll.append(5);
        ll.getHead();
        ll.getTail();
        ll.getLength();
        ll.printList();



    }
}