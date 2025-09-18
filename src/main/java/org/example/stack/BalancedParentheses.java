package org.example.stack;
import java.util.Stack;

public class BalancedParentheses {

    public boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stackChar = new Stack<Character>();

        for(int i=0; i<parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stackChar.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stackChar.isEmpty()){
                    return false;
                }
                char top = stackChar.pop();
                if((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }
}
