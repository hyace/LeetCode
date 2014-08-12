package leetcode.evaluateReversePolishNotation;

import java.util.Stack;

import org.junit.Test;

/**
 * Problem: Evaluate Reverse Polish Notation
 * Description: Evaluate the value of an arithmetic expression in Reverse Polish
 * Notation. Valid operators are +, -, *, /. Each operand may be an integer or
 * another expression.
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * Date: Aug 12, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (String str : tokens) {
            char ch = str.charAt(0);
            int temp = 0;
            if (Character.isDigit(ch) || str.length() > 1) stack.push(Integer
                    .parseInt(str));
            else {
                int a = stack.pop(), b = stack.pop();
                if (ch == '+') temp = b + a;
                else if (ch == '-') temp = b - a;
                else if (ch == '*') temp = b * a;
                else if (ch == '/') temp = b / a;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    @Test
    public void test() {
        String[] exp = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(exp));
    }
}
