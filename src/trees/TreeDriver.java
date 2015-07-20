package trees;

public class TreeDriver {

    public static void main(String args[]) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(17);
        bst.insert(72);
        bst.insert(20);
        bst.insert(30);
        bst.insert(10);
        bst.insert(40);
        bst.insert(50);
        Node root = bst.root;
        bst.inOrder(root);
        Node node = bst.delete(30);
        bst.inOrder(node);
        System.out.println(new hasPathSum().isPathSum(root, 77));
        HeightBalanced hBalanced = new HeightBalanced();
        System.out.println(hBalanced.isHeightBalanced(root));
        int[] a = { 1, 2, 3, 4 };
        SortedArrayToBalancedBst sBst = new SortedArrayToBalancedBst();
        Node r = sBst.createBalancedBst(a, 0, a.length - 1);
        bst.inOrder(r);
    }

}
