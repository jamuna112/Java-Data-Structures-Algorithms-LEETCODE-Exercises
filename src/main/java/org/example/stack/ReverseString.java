package org.example.stack;
import java.util.Stack;



public class ReverseString {

    public String reverseString(String word) {

        Stack<Character> stackWords = new Stack<>();
        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            stackWords.push(word.charAt(i));
        }

        while (!stackWords.isEmpty()) {
            reverse += stackWords.pop();
        }

        return reverse;
    }
}
