package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SiblingPointers {

    static class TreeNode {

        TreeNode left;
        TreeNode right;
        TreeNode nextRight;
        int data;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.nextRight = null;
        }

    }

    public void setSiblingPointers(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        while (true) {
            TreeNode current = queue.poll();
            if (current != null) {
                current.nextRight = queue.peek();
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            } else if (!queue.isEmpty()) {
                queue.add(null);
            } else {
                break;
            }
        }

    }
}
