package org.example;

import org.example.hashtables.HashTable;
import org.example.linkedlist.LinkedList;
import org.example.linkedlist.LinkedListMain;
import org.example.queue.QueueMain;
import org.example.stack.Stack;
import org.example.stack.StackMain;
import org.example.trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {

//        LinkedListMain llm = new LinkedListMain();
//        llm.invokeLinkedListAllFunctions();

//        StackMain myStack = new StackMain();
//        myStack.invokeStackFunctionality();

//        QueueMain myQueue = new QueueMain();
//        myQueue.allTheQueueFunctions();

//        BinarySearchTree bst = new BinarySearchTree();
//        System.out.println("Root = "+ bst.getRoot());
//
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(52);
//        bst.insert(82);
//
//      boolean isContain =  bst.contain(1);
//      System.out.println("Given value is "+ isContain);

        HashTable ht = new HashTable();
        ht.set("nails", 400);
        ht.set("bolts", 100);
        ht.set("lumber", 300);
       int val =  ht.get("bolts");
       int val1 =  ht.get("nails");

        System.out.println("Value of given key is "+ val);
        System.out.println("Value of given key is "+ val1);







    }
}