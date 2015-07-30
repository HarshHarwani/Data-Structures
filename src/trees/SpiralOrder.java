package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SpiralOrder {

    public void printSpiralOrder(Node node) {
        if (node == null)
            return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        boolean lefttoRight = false;
        s1.push(node);
        while (!s1.isEmpty()) {
            Node current = s1.pop();
            System.out.print(current.data + " ");
            if (lefttoRight) {
                if (current.left != null)
                    s2.push(current.left);
                if (current.right != null)
                    s2.push(current.right);
            } else {
                if (current.right != null)
                    s2.push(current.right);
                if (current.left != null)
                    s2.push(current.left);
            }
            if (s1.isEmpty()) {
                lefttoRight = !lefttoRight;
                Stack<Node> temp = s1;
                s1 = s2;
                s2 = temp;
            }
        }
    }

    // alternate method
    public void spiralOrder1(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        boolean evenlevel = true;
        List<Node> list = new ArrayList<Node>();
        q.add(root);
        int levelNodes = 0;
        while (!q.isEmpty()) {
            list.clear();
            levelNodes = q.size();
            while (levelNodes > 0) {
                Node cuNode = q.remove();
                list.add(cuNode);
                if (cuNode.left != null)
                    q.add(cuNode.left);
                if (cuNode.right != null)
                    q.add(cuNode.right);
                levelNodes--;
            }
            if (evenlevel) {
                print(list);
                evenlevel = !evenlevel;
            } else {
                evenlevel = !evenlevel;
                Collections.reverse(list);
                print(list);
            }
            System.out.println("");
        }
    }

    private void print(List<Node> list) {
        for (Node l : list) {
            System.out.print(l.data + " ");
        }

    }
}
