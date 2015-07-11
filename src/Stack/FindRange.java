package Stack;

import java.util.Stack;

/**
 * 
 * @author hharwani Find Range of Stack in O(1) Time
 */
public class FindRange {

    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public int findRange() {
        return maxStack.peek() - minStack.peek();
    }

    public void push(int i) {
        mainStack.push(i);
        if (i > max) {
            max = i;
            maxStack.push(max);
        }
        if (i < min) {
            min = i;
            minStack.push(min);
        }
    }

    public int pop() {
        int p = mainStack.pop();
        if (p == max) {
            maxStack.pop();
            max = maxStack.peek();
        }
        if (p == min) {
            minStack.pop();
            min = minStack.peek();
        }
        return p;
    }

}
