package org.example.String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParantheses {

    public static boolean isValidBrute(String s) {
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s=s.replace("{}","");
            s=s.replace("()","");
            s=s.replace("[]","");
        }
        return s.isEmpty();
    }

    public static boolean isValidOpt(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.peek();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
                // If it matches, pop it off
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParantheses vp = new ValidParantheses();

        System.out.println(vp.isValidBrute("()"));       // true
        System.out.println(vp.isValidBrute("()[]{}"));   // true
        System.out.println(vp.isValidBrute("(]"));       // false
        System.out.println(vp.isValidBrute("([)]"));     // false
        System.out.println(vp.isValidBrute("{[]}"));     // true

        System.out.println(vp.isValidOpt("()"));       // true
        System.out.println(vp.isValidOpt("()[]{}"));   // true
        System.out.println(vp.isValidOpt("(]"));       // false
        System.out.println(vp.isValidOpt("([)]"));     // false
        System.out.println(vp.isValidOpt("{[]}"));     // true
    }


}
