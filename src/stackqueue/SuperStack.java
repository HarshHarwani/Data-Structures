package stackqueue;
import java.util.*;
public class SuperStack {
	
	
	    public static void main(String args[] ) throws Exception {
	       Scanner scanner=new Scanner(System.in);
	       Stack<Integer> st=new Stack<Integer>();
	       Stack<Integer> add=new Stack<Integer>();
	        int t=scanner.nextInt();
	        
	        for(int i=0;i<t;i++){
	        	String result="";
	        	String[] command=scanner.nextLine().split(" ");
	            if(command[0].equals("push")){
	            	st.push(Integer.parseInt(command[1]));
	            	System.out.println(Integer.parseInt(command[1]));
	            }
	            else if(command[0].equals("pop")){
	            	if(!st.isEmpty())
	            	result=String.valueOf(st.pop());
	            	else
	            	result="EMPTY";	
	            	System.out.println(result);
	            }
	            else if(command[0].equals("inc")){
	            	int nfe=Integer.parseInt(command[1]);
	            	int incre=Integer.parseInt(command[2]);
	            	int size=st.size();
	            	for(int k=0;k<size-nfe;k++){
	            		add.push(st.pop());
	            	}
	            	for(int l=0;l<st.size();l++){
	            		st.push(st.pop()+incre);
	            	}
	            	result=String.valueOf(st.peek());
	            }
	            System.out.println(result);
	            
	        }
	        scanner.close();
	    }
	    
	   

}
