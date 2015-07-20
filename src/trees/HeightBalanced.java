package trees;

public class HeightBalanced {

    public boolean isHeightBalanced(Node node) {
        if (node == null)
            return true;
        else {
            int left = getHeight(node.left);
            int right = getHeight(node.right);
            if (Math.abs(left - right) > 1)
                return false;
            else
                return isHeightBalanced(node.left) && isHeightBalanced(node.right);
        }
    }

    private int getHeight(Node node) {
        if (node == null)
            return 0;
        else {
            return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        }
    }
}
