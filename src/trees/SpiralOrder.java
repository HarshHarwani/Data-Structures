package trees;

import java.util.Stack;

public class SpiralOrder {
    
    public void printSpiralOrder(Node node){
        if(node==null)
            return;
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        boolean lefttoRight=false;
        s1.push(node);
        while(!s1.isEmpty()){
            Node current=s1.pop();
            System.out.print(current.data+" ");
            if(lefttoRight){
            if(current.left!=null)
                s2.push(current.left);
            if(current.right!=null)
                s2.push(current.right);
            }
            else{
                if(current.right!=null)
                    s2.push(current.right);
                if(current.left!=null)
                    s2.push(current.left);
            }
        if(s1.isEmpty()){
            lefttoRight=!lefttoRight;
            Stack<Node> temp=s1;
            s1=s2;
            s2=temp;
        }
        }
    }
}
