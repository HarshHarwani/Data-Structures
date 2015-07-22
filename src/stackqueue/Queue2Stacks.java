package stackqueue;

import java.util.Stack;

public class Queue2Stacks {
    
   Stack<Integer> oldestStack=new Stack<Integer>();
   Stack<Integer> newestStack=new Stack<Integer>();
   
   public void enqueue(int i){
       newestStack.push(i);
   }
   
   public int dequeue(){
       shiftStacks();
      return oldestStack.pop();
   }
   public int peek(){
       shiftStacks();
       return oldestStack.peek();
   }
   
   public void shiftStacks(){
       if(oldestStack.isEmpty()){
           while(!newestStack.isEmpty()){
               oldestStack.push(newestStack.pop());
           }
       }
   }
   
   public boolean isEmpty(){
       return (oldestStack.isEmpty() && newestStack.isEmpty());
   }

}
