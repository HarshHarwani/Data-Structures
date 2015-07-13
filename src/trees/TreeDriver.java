package trees;

public class TreeDriver {

    public static void main(String args[]) {
        BST bst = new BST();
        bst.insert(30);
        bst.insert(10);
        bst.insert(60);
        bst.insert(5);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        Node root = bst.root;
        System.out.println(new hasPathSum().isPathSum(root, 60));
    }

}
