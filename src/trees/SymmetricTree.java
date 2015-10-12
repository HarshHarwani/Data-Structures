package trees;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

public class SymmetricTree {
    
    public boolean checkSymmetric(Node node){
        if(node==null)
             return true;
        return isSymmetric(node.left,node.right);
    }

    private boolean isSymmetric(Node left, Node right) {
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.data!=right.data)
            return false;
        if(!isSymmetric(left.left, right.right))
            return false;
        if(!isSymmetric(left.right, right.left))
            return false;
        return true;
    }
    
    
    
    
    public static void main(String args[]){
        SymmetricTree symmetricTree=new SymmetricTree();
        BST bst=new BST();
        bst.insert(30);
        bst.insert(22);
        bst.insert(21);
        bst.insert(25);
        bst.insert(38);
        bst.insert(40);
        bst.insert(35);
        Node root=bst.getRoot();
        System.out.println(symmetricTree.checkSymmetric(root));
    }

}
