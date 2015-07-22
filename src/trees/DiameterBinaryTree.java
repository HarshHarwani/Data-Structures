package trees;

public class DiameterBinaryTree {
    
    public int getDiameter(TreeNode root){
        if(root==null)
            return 0;
        int lheight=getHeight(root.left);
        int rheight=getHeight(root.right);
        
        int ldiameter=getDiameter(root.left);
        int rdiameter=getDiameter(root.right);
        
        return Math.max(lheight+rheight+1,Math.max(ldiameter, rdiameter));
    }

    private int getHeight(TreeNode node) {
        if (node == null)
            return 0;
        else {
            return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        }
    }
}
