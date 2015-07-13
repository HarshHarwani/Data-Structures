package trees;

public class hasPathSum {

    public boolean isPathSum(Node node, int sum) {
        int subsum = sum - node.data;
        if (node.left == null && node.right == null) {
            return (subsum == 0);
        } else {
            return (isPathSum(node.left, subsum) || isPathSum(node.right, subsum));
        }
    }

}
