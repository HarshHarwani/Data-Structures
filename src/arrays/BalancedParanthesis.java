package arrays;

import java.util.Stack;

/**
 * Given an expression string exp, write a program to examine whether the pairs
 * and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example,
 * the program should print true for exp = “[()]{}{[()()]()}” and false for exp
 * = “[(])”
 * 
 * @author hharwani
 *
 */
public class BalancedParanthesis {

    public boolean isBalanced(String expression) {
        char[] c = expression.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
                stack.push(c[i]);
            }
            if (c[i] == '}' || c[i] == ']' || c[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!stack.isEmpty()) {
                    if (!matchElements(stack.pop(), c[i]))
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        else
            return true;
    }

    private boolean matchElements(Character pop, char c) {
        if (pop == '{' && c == '}')
            return true;
        else if (pop == '[' && c == ']')
            return true;
        else if (pop == '(' && c == ')')
            return true;
        return false;
    }
    
    
    
    public static void main(String args[]){
        BalancedParanthesis balancedParanthesis=new BalancedParanthesis();
        System.out.println(balancedParanthesis.isBalanced("{[harsh]}"));
    }
    
}
