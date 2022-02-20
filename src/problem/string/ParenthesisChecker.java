package problem.string;

import java.util.HashMap;
import java.util.Stack;


//Problem link : https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1/?page=1&category[]=Strings&sortBy=submissions
public class ParenthesisChecker {

    public static void main(String[] args) {
        System.out.println("ispar(“[()]{}{[()()]()}”) = " + ispar("[()]{}{[()()]()}"));
        System.out.println("ispar(“[(])”) = " + ispar("[(])"));
    }
    
    static boolean ispar(String x) {
        // add your code here
        if (x.length() % 2 == 1) return false;
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');
        Stack<Character> parenthesisStack = new Stack<>();
        for (int index = 0; index < x.length(); index++) {
            char parenthesis = x.charAt(index);
            if (parenthesis == ')' || parenthesis == '}' || parenthesis == ']') {
                if (parenthesisStack.size() != 0 && parenthesisStack.get(parenthesisStack.size() - 1) == pairs.get(parenthesis)) {
                    parenthesisStack.pop();
                } else if (parenthesisStack.size() != 0 && parenthesisStack.get(parenthesisStack.size() - 1) != pairs.get(parenthesis)) {
                    return false;
                }
            } else {
                parenthesisStack.push(parenthesis);
            }
        }
        return true;
    }
    
}
