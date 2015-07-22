package trees;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void inOrder(TreeNode r) {
        if (r != null) {
            inOrder(r.left);
            System.out.println(r.data);
            inOrder(r.right);
        }

    }
}
