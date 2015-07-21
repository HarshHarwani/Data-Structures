package trees;

public class LowestCommonAncesstor {

    public Node getLowestCommonAncesstor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        else if (!covers(p, root) || !covers(q, root)) // case-1 check if
                                                       // actually p and q are
                                                       // present in the tree
            return null;
        else if (root == p || root == q) // case2-if either of the root matches
                                         // with p or q return that node i.e.
                                         // LCA
            return root;
        boolean p_side_left = covers(p, root.left);
        boolean q_side_left = covers(q, root.left);
        if (p_side_left != q_side_left) // case-3 if they are both on different
                                        // sides of the tree/subtree return the
                                        // root
            return root;
        Node side = p_side_left ? root.left : root.right; // identify the side
                                                          // both p and q are
                                                          // and recurse that
                                                          // part.
        return getLowestCommonAncesstor(side, p, q);

    }

    private boolean covers(Node p, Node root) {
        if (root == null)
            return false;
        if (root == p)
            return true;
        return (covers(p, root.left) || covers(p, root.right));
    }

    public Node getLowestCommonAncesstorBst(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (!covers(p, root) || !covers(q, root)) {
            return null;
        }
        if (root.data > p.data && root.data < q.data) {
            return root;
        }
        if (root.data > p.data && root.data > q.data) {
            return getLowestCommonAncesstorBst(root.left, p, q);
        }
        if (root.data < p.data && root.data < q.data) {
            return getLowestCommonAncesstorBst(root.right, p, q);
        }
        return root;

    }

}
