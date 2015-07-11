package Stack;

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
    }
  
    
    
    
}
