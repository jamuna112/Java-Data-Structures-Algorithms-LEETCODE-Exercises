package org.example.trees;

public class BinarySearchTree {

     public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

     public  BinarySearchTree(){
     }

     public Node getRoot(){
        return root;
     }

     /*
     create newNode
     if root == null then root = newNode
     temp = root
     while loop
     if newNode == temp return false
     if < left else > right
     if null insert newNode else move to next

      */
    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
            if(newNode == temp) { //value is already in the tree
                return false;
            }
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contain(int value){
        if (root == null){
            return false;
        }
        Node temp = root;

        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            } else if(value > temp.value){
                temp = temp.right;
            } else {
                return true;
            }

        }
        return false;
    }

}
