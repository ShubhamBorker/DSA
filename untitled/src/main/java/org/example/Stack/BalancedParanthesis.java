package org.example.Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isBalanced(String expr){
        Stack<Character> st = new Stack<>();

        for (char ch : expr.toCharArray()) {

            if (st.isEmpty() || ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
                continue;
            }

            if (ch == ')') {
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == ']') {
                if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == '}') {
                if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }

        }

        return st.isEmpty();
    }

    public static void main(String[]args){
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[()]"));
    }
}
