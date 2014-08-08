package leetcode.validParentheses;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

/**
 * Problem: Valid Parentheses
 * Description: Given a string containing just the characters ’(’, ’)’, ’{’,*
 * ’}’, ’[’ and ’]’, determine if the input string is valid.
 * The brackets must close in the correct order, ”()” and ”()[]” are all valid
 * but ”(]” and ”([)]” are not.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> par = new HashMap<Character, Character>();
        par.put('(',')');
        par.put('[', ']');
        par.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(par.containsKey(ch)) stack.push(ch);
            else if(stack.empty()||ch!=par.get(stack.peek()))return false;
            else stack.pop();
        }
        if(stack.empty())return true;
        else return false;
    }
    @Test
    public void test(){
        System.out.println(isValid("["));
    }
}
