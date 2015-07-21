package trees;

public class SubTree {  

    
    public boolean isSubTree(Node t1,Node t2){
        if(t2==null)
            return true;
        return subtree(t1,t2); //calling subtree to check if one is subtree of another
    }

    private boolean subtree(Node t1, Node t2) {
        if(t1==null)
            return false;
        if(t1.data==t2.data){
            return matchTree(t1,t2); //when node of t1 and t2 match recursing both the trees from that point
        }
        return (subtree(t1.left,t2) || subtree(t1.right,t2)); 
        
    }

    private boolean matchTree(Node t1, Node t2) {
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        if(t1.data!=t2.data)
            return false;
        
        return(matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right));
    }
    
}
