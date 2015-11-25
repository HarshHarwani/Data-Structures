package trees;

import java.util.Queue;
import java.util.*;

public class MinimumDepthBST {

	public int minDepth1(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			minDepth(root.right);
		if (root.right == null)
			minDepth(root.left);
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> queue = new java.util.LinkedList<>();
		Queue<Integer> counts = new java.util.LinkedList<>();
		queue.add(root);
		counts.add(1);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			int count = counts.poll();

			if (node.left != null) {
				queue.add(node.left);
				counts.add(count + 1);
			}
			if (node.right != null) {
				queue.add(node.right);
				counts.add(count + 1);
			}
			if (node.left != null && node.right != null) {
				return count;
			}
		}
		return 0;
	}
}
