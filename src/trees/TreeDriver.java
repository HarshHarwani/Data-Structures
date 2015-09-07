package trees;

import java.util.LinkedList;
import java.util.List;

import trees.TreeNode;

public class TreeDriver {

    public static void main(String args[]) {
        BST bst = new BST();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(17);
        bst.insert(25);
        bst.insert(9);
        bst.insert(7);
        bst.insert(11);
        bst.insert(14);
        bst.insert(26);
        bst.insert(16);
        bst.insert(18);
        bst.insert(24);
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
        Node p = bst.getReference(root, 8);
        Node q = bst.getReference(root, 12);
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
        InorderSuccessor inSuccessor = new InorderSuccessor();
        System.out.println(inSuccessor.getInorderSuccessor(root, 12).data);
        TreeNode broot = new TreeNode(1);
        broot.left = new TreeNode(2);
        broot.right = new TreeNode(3);
        broot.left.left = new TreeNode(4);
        broot.left.right = new TreeNode(5);
        DiameterBinaryTree diameterBinaryTree=new DiameterBinaryTree();
        System.out.println("The diameter of the tree is-->" + diameterBinaryTree.getDiameter(broot));
        SpiralOrder sOrder=new SpiralOrder();
        sOrder.spiralOrder1(root);
        MaximumWidth mWidth=new MaximumWidth();
        System.out.println("the max width is-->"+mWidth.getMaxWidth(root));
        BetweenLevel bLevel=new BetweenLevel();
        bLevel.printBetweenLevel(root,0, 2);
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        SortedLLToBST sBst1=new SortedLLToBST();
        Node root2=sBst1.createBst(list);
       LeftRightView rView=new LeftRightView();
        rView.printLeftRightView(root2,false);
        ReverseAlternate alternate=new ReverseAlternate();
        Node node1=alternate.reverseAlternateLevels(root2);
        bst.inOrder(node1);

    }

}
