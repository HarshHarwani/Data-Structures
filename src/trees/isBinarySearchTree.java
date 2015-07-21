package trees;

public class isBinarySearchTree {

    public boolean isBst(Node root) {
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTHelper(Node root, int minValue, int maxValue) {
        if (root == null)
            return true;
        if (root.data <= minValue && root.data > maxValue) // on each recursion
                                                           // call we check if
                                                           // the node value is
                                                           // within the range
            return false;
        // on each recursion i set each node's range and check if the value
        // falls in that range
        return (isBSTHelper(root.left, minValue, root.data) && isBSTHelper(root.right, root.data, maxValue));
    }

}
