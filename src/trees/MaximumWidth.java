package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author hharwani Note: Max­i­mum width of a tree is noth­ing but the
 *         Max(nodes at each level).
 * 
 *         Input: A Binary Tree
 * 
 *         Out­put: Max­i­mum width of a given tree
 *
 */
public class MaximumWidth {

    public int getMaxWidth(Node root) {
        if(root==null)
            return -1;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        int levelnodes=0;
        int width=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            levelnodes=q.size();
            if(levelnodes>width){
                width=levelnodes;
            }
            while(levelnodes>0){
                Node cuNode=q.remove();
                if(cuNode.left!=null)
                    q.add(cuNode.left);
                if(cuNode.right!=null)
                    q.add(cuNode.right);
                levelnodes--;
            }
        }
        return width;
        
    }

}
