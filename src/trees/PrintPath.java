package trees;

public class PrintPath {

    public void findsum(Node root, int sum) {
        if (root == null)
            return;
        int depth = getDepth(root);
        int[] path = new int[depth];
        findPath(root, path, sum, 0);
    }

    private void findPath(Node node, int[] path, int sum, int level) {
        if (node == null)
            return;
        path[level] = node.data;
        int t = 0;
        for (int i = level; i >= 0; i--) {
            t += path[i];
            if (t == sum) {
                printSol(path, i, level);
            }
        }
        findPath(node.left, path, sum, level + 1);
        findPath(node.right, path, sum, level + 1);
        path[level] = Integer.MIN_VALUE;

    }

    // helper method to print the path
    private void printSol(int[] path, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.print("\n");
    }

    // helper method to get height
    private int getDepth(Node node) {
        if (node == null)
            return 0;
        else {
            return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
        }
    }
}
