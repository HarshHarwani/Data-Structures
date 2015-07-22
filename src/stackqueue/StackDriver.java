package stackqueue;

import java.util.Stack;

public class StackDriver {
    
    public static void main(String args[]){
        FindRange findRange=new FindRange();
        findRange.push(1);
        findRange.push(45);
        findRange.push(65);
        findRange.push(55);
        findRange.push(123);
        findRange.push(5);
        findRange.pop();
        findRange.pop();
        int r=findRange.findRange();
        System.out.println(r);
        AnimalQueue anQueue=new AnimalQueue();
        anQueue.push(new Dog("scobby"));
        anQueue.push(new Dog("scobby1"));
        anQueue.push(new Dog("cathy"));
        System.out.println(anQueue.pop().name);
        Queue2Stacks quStacks=new Queue2Stacks();
        quStacks.enqueue(1);
        quStacks.enqueue(2);
        quStacks.enqueue(3);
        quStacks.enqueue(4);
        quStacks.enqueue(5);
        while(!quStacks.isEmpty()){
            System.out.println(quStacks.dequeue());
        }
        Stack<Integer> testStack=new Stack<Integer>();
        testStack.push(31);
        testStack.push(42);
        testStack.push(62);
        testStack.push(60);
        testStack.push(58);
        testStack.push(56);
        testStack.push(54);
        SortStack sortStack=new SortStack();
        Stack<Integer> a=sortStack.getSortedStack(testStack);
        for(int i:a){
            System.out.println(i);
        }
    }
  
    
    
    
}
