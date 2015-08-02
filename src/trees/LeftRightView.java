package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author hharwani Objec­tive: In a Binary Tree, print right view of it
 * 
 *         Input: A binary tree.
 *
 */
public class LeftRightView {

    public void printLeftRightView(Node root, boolean right) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null); // level end
        int count = 1;
        while (!q.isEmpty()) {
            Node current = q.remove();
            if (count == 1) {
                System.out.print(current.data + " ");
                count = 0;
            }
            if (current == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
                count = 1;
            }
            if (current != null) {
                if (right) {
                    if (current.right != null)
                        q.add(current.right);
                    if (current.left != null)
                        q.add(current.left);
                } else {
                    if (current.left != null)
                        q.add(current.left);
                    if (current.right != null)
                        q.add(current.right);
                }
            }

        }
    }

}
