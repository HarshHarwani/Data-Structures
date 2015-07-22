package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    Node root;

    public BST() {
        root = null;
    }

    public void insert(int x) {
        root = insert(root, x);
    }

    private Node insert(Node node, int x) {
        if (node == null) {
            node = new Node(x);
        } else {
            if (x < node.data) {
                node.left = insert(node.left, x);
            } else
                node.right = insert(node.right, x);
        }
        return node;
    }

    private boolean search(int x) {
        return search(root, x);
    }

    public Node delete(int x) {
        return delete(root, x);
    }

    // need to check
    private Node delete(Node r, int x) {
        if (r == null)
            return r;
        else if (x < r.data)
            r.left = delete(r.left, x);
        else if (x > r.data)
            r.right = delete(r.right, x);
        else {
            if (r.left == null && r.right == null) {
                r = null;
            } else if (r.left == null) {
                @SuppressWarnings("unused")
                Node temp = r;
                r = r.right;
                temp = null;
            } else if (r.right == null) {
                @SuppressWarnings("unused")
                Node temp = r;
                r = r.left;
                temp = null;
            } else {
                Node temp = findmin(r.right);
                r.data = temp.data;
                r.right = delete(r.right, temp.data);
            }
        }
        return r;

    }

    private Node findmin(Node right) {
        if (right == null)
            return null;
        else {
            Node current = right;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }
    }

    public boolean search(Node r, int x) {
        boolean found = false;
        while (r != null && !found) {
            if (x < r.data)
                r = r.left;
            else if (x > r.data)
                r = r.right;
            else {
                found = true;
                break;
            }
            found = search(r, x);
        }
        return found;
    }

    public Node getReference(Node r, int x) {
        while (r != null) {
            if (x < r.data)
                r = r.left;
            else if (x > r.data)
                r = r.right;
            else {
                return r;
            }
        }
        return null;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node r) {
        if (r != null) {
            inOrder(r.left);
            System.out.println(r.data);
            inOrder(r.right);
        }

    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node r) {
        if (r != null) {
            System.out.println(r.data);
            preOrder(r.left);
            preOrder(r.right);
        }

    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node r) {
        if (r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.println(r.data);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSize(root);
    }

    private int getSize(Node r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += getSize(r.left);
            l += getSize(r.right);
            return l;
        }
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node r) {
        Queue<Node> queue = new LinkedList<Node>();
        if (r != null) {
            queue.add(r);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                System.out.println(node.data);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
        }

    }

}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
