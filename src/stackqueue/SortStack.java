package stackqueue;

import java.util.Stack;

public class SortStack {

    // if more than two stacks were allowed, we could use mergesort or quicksort
    // to sort the stack
    public Stack<Integer> getSortedStack(Stack<Integer> originalStack) {
        Stack<Integer> bufferStack = new Stack<Integer>();
        while (!originalStack.isEmpty()) {
            int temp = originalStack.pop();
            while (!bufferStack.isEmpty() && bufferStack.peek() > temp) {
                originalStack.push(bufferStack.pop());
            }
            bufferStack.push(temp);
        }
        return bufferStack;
    }

}
