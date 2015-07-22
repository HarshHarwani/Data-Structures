package trees;

public class InorderSuccessor {
    // one thing is to do in-order traversal of the tree and then print the next
    // element of the input element
    // that solution will be using extra space and will have linear time
    // complexity.

    public Node getInorderSuccessor(Node root, int x) {
        Node successor = null;
        if (root == null)
            return null;
        Node current = Findnode(root, x);
        if (current.right != null) {
            return FindMin(current.right);

        } else {
            Node ancestor = root;
            while (ancestor != current) {
                if (current.data < ancestor.data) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else {
                    ancestor = ancestor.right;
                }
            }
            return successor;

        }

    }

    private Node FindMin(Node right) {
        while (right.left != null) {
            right = right.left;
        }
        return right;
    }

    private Node Findnode(Node root, int data) {
        if (root == null)
            return null;
        if (data < root.data)
            return Findnode(root.left, data);
        if (data > root.data)
            return Findnode(root.right, data);
        if (data == root.data)
            return root;
        return null;
    }
}