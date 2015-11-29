package stackqueue;

import java.util.Stack;

class MinStack {
    Stack<Integer> st=new Stack<Integer>();
    Stack<Integer> minst=new Stack<Integer>();
    public void push(int x) {
        st.push(x);
        if(minst.isEmpty() || x<=minst.peek() ){
            minst.push(x);
        }
    }

    public void pop() {
        if(!st.isEmpty()){
            int val=st.pop();
            if(!minst.isEmpty() && val==minst.peek())
                minst.pop();
        }
    }

    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }return -1;
    }

    public int getMin() {
        if(!minst.isEmpty()){
           return minst.peek();
        }
        return 0;
    }
    
    public static void main(String[] args) {
		MinStack minStack=new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-1);
		System.out.println(minStack.getMin());
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.getMin());
    }
}