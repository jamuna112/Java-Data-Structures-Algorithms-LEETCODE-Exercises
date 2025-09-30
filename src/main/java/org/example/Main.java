package org.example;

import org.example.hashtables.HashTable;
import org.example.linkedlist.LinkedList;
import org.example.linkedlist.LinkedListMain;
import org.example.queue.QueueMain;
import org.example.stack.Stack;
import org.example.stack.StackMain;
import org.example.trees.BinarySearchTree;

import java.util.ArrayList;

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
        ht.set("placa", 150);
       int val =  ht.get("bolts");
       int val1 =  ht.get("nails");
       ht.printTable();

        System.out.println("Value of given key is "+ val);
        System.out.println("Value of given key is "+ val1);

       ArrayList<String> keys =  ht.keys();
       System.out.println("List of keys "+ keys);

       int[] arr1 = {7, 4, 5};
       int[] arr2 = {1, 2, 7};
      boolean iscommon =  ht.itemInCommon(arr1, arr2);
        System.out.println("have common "+iscommon);







    }
}