package org.example.stack;

public class StackMain {

    public void invokeStackFunctionality(){
        int value = 5;
        Stack<Integer> stack = new Stack<>(value);
        stack.push(value);
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.printStack();

        ReverseString rs = new ReverseString();
        String name = rs.reverseString("word");
        System.out.println("your reverse name is "+ name);
    }
}
