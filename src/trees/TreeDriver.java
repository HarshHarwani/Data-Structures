package trees;

import java.util.LinkedList;
import java.util.List;

public class TreeDriver {

    public static void main(String args[]) {
        BST bst = new BST();
        bst.insert(8);
        bst.insert(5);
        bst.insert(14);
        bst.insert(2);
        bst.insert(6);
        bst.insert(12);
        bst.insert(16);
        Node root = bst.root;
        BST bst1 = new BST();
        bst1.insert(5);
        bst1.insert(2);
        bst1.insert(6);
        Node root1 = bst1.root;
        PrintPath path = new PrintPath();
        path.findsum(root, 22);
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
        ListAtDepthBtree lAtDepthBtree = new ListAtDepthBtree();
        List<LinkedList<Node>> lists = lAtDepthBtree.getListAtDepthBtree(root);
        for (LinkedList<Node> list : lists) {
            for (Node n : list) {
                System.out.print(n.data + " ");
            }
            System.out.print("\n");
        }
        LowestCommonAncesstor lAncesstor = new LowestCommonAncesstor();
        Node p = bst.getReference(root, 2);
        Node q = bst.getReference(root, 0);
        Node lca = lAncesstor.getLowestCommonAncesstorBst(root, p, q);
        if (lca != null) {
            System.out.println("The lowest common ancesstor is-->" + lca.data);
        } else {
            System.out.println("NULL");
        }

        SubTree sTree = new SubTree();
        System.out.println(sTree.isSubTree(root, root1));
        isBinarySearchTree iSearchTree = new isBinarySearchTree();
        System.out.println(iSearchTree.isBst(root));
    }

}
