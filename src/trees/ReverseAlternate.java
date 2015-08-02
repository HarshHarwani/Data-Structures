package trees;

import java.util.*;


/**
 * Reverse alternate levels of a perfect binary tree
 * @author hharwani
 *
 */
public class ReverseAlternate {
    
    public Node reverseAlternateLevels(Node node){
            List<Integer> list=new ArrayList<Integer>();
            storeAlternateNodes(node,list,0);
            Collections.reverse(list);
            reverseAlternateNodes(node,list,0);
            return node;
    }

  

    private void storeAlternateNodes(Node node, List<Integer> list,int level) {
        if(node==null)
            return;
        if(level%2!=0)
            list.add(node.data);
        storeAlternateNodes(node.left, list, level+1);
        storeAlternateNodes(node.right, list, level+1);
    }
    
    private void reverseAlternateNodes(Node node, List<Integer> list, int level) {
        if(node==null)
            return;
        reverseAlternateNodes(node.left,list,level+1);
        if(level%2!=0)
            node.data=list.remove(0);
        reverseAlternateNodes(node.right,list,level+1);
        
    }

}
