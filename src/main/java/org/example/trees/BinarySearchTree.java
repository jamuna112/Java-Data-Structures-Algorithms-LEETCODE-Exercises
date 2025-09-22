package org.example.trees;

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

     public  BinarySearchTree(){
        root = null;
     }

     public Node getRoot(){
        return root;
     }


}
