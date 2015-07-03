package Stack;

import java.util.Stack;

public class NextGreaterElement {
	
	//efficient solution of the nextGreaterElement problem using stacks
	public void nextGreaterElement(int[] a){
		  Stack<Integer> st=new Stack<Integer>();
		  st.push(a[0]);
		  for(int i=1;i<a.length;i++){
		    int next=a[i];
		    if(!st.isEmpty()){
		      int ele=st.pop();
		      while(ele<next){
		        System.out.println(ele+"-->"+next);
		        if(st.isEmpty())
		        	break;
		        ele=st.pop();
		      }
		      if(ele>next){
		        st.push(ele);
		      }
		    }
		    st.push(next);
		  }
		}

}
