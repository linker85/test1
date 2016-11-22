package com.example.com.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by raul on 09/11/2016.
 */
public class BalancerMagic {

    public boolean isBalancedEdwin (String s) {
        Stack<Character> stack = new Stack<>();
        char current;

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty())
                    return false;
            }
            if (c == '}') {
                current = stack.pop();
                if (current != '{')
                    return false;
            }
            if (c == ']') {
                current = stack.pop();
                if (current != '[')
                    return false;
            }
            if (c == ')') {
                current = stack.pop();
                if (current != '(')
                    return false;
            }
        }

        return stack.empty();
    }

    public boolean isBalanced (String s) {
        List<String> stack1 = new ArrayList<String>();
        List<String> stack2 = new ArrayList<String>();

        if (s.isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '{':
                        stack1.add("1a");
                        break;
                    case '}':
                        stack2.add("1b");
                        break;
                    case '(':
                        stack1.add("2a");
                        break;
                    case ')':
                        stack2.add("2b");
                        break;
                    case '[':
                        stack1.add("3a");
                        break;
                    case ']':
                        stack2.add("3b");
                        break;
                }
            }

            boolean isTrue = false;
            for (String string1 : stack1) {
                for (String string2 : stack2) {
                    if ((string1.charAt(0) == string2.charAt(0)) &&
                            (string1.charAt(1) != string2.charAt(1))) {
                        isTrue = true;
                        break;
                    } else {
                        isTrue = false;
                    }
                }
            }
            return isTrue;
        }
    }

}
