package org.example;

import org.example.linkedlist.LinkedList;
import org.example.linkedlist.LinkedListMain;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Red");

        cookieOne.setColor("Yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        LinkedListMain llm = new LinkedListMain();
        llm.invokeLinkedListAllFunctions();



    }
}