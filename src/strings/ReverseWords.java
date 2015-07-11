package strings;


import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * @author hharwani
 * Reverse the words of a String or Sentence
 */
public class ReverseWords {
    
    public String reverseWords(String s){
        
        Stack<String> stack=new Stack<String>();
        StringBuffer stBuffer=new StringBuffer();
        StringTokenizer stTokenizer=new StringTokenizer(s," ");
        while(stTokenizer.hasMoreTokens()){
            stack.push(stTokenizer.nextToken());
        }
        while(!stack.isEmpty()){
           stBuffer.append(stack.pop());
           stBuffer.append(" ");
        }
        return stBuffer.toString();
    }

}
