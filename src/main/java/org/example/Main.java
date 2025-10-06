package org.example;

import org.example.hashtables.HashTable;
import org.example.hashtables.MyHashSet;
import org.example.linkedlist.LinkedList;
import org.example.linkedlist.LinkedListMain;
import org.example.queue.QueueMain;
import org.example.stack.Stack;
import org.example.stack.StackMain;
import org.example.trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

       int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Duplicate entry list: "+ht.duplicates(array));

        String word = "success";
        System.out.println("Success has '"+ ht.firstNonRepeatingChar(word) + "' non repeating character");


       String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ht.groupAnagrams(list));

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = ht.twoSum(nums, target );
        System.out.println("output index is "+ Arrays.toString(output));

        int[] nums2 = {1, 2, 3, 4, 5};
        int target2 = 9;
        int[] output2 = ht.subarraySum(nums2, target2);

        System.out.println("output index is "+ Arrays.toString(output2));

        MyHashSet mht = new MyHashSet();
        mht.createHashSet();

        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(11);

       List<Integer> lst =  mht.removeDuplicates(myList);
        System.out.println("Set contains "+ lst);




    }
}