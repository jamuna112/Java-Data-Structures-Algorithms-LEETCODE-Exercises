package org.example.queue;
import java.util.Stack;



public class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();

    public void enqueueWithTwoStack(int newValue){

        Stack<Integer> stack2 = new Stack<>();

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(newValue);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }


    public void printQueue() {

        for(int value: stack1){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
