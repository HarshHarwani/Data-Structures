package trees;

import java.util.LinkedList;

public class SortedLLToBST {

    public Node createBst(LinkedList<Integer> list) {
        int low = 0;
        int high = list.size() - 1;
        return createBst(list, low, high);
    }

    // method 1 where we recurse through the linkedlist but as we are getting
    // the node
    // from the linkedlist, so the complexity is O(nlogn)

    private Node createBst(LinkedList<Integer> list, int low, int high) {
        // TODO Auto-generated method stub
        if (low > high) // base case
            return null;

        int mid = low + (high - low) / 2; // calculating the mid element
        int data = list.get(mid); // getting the middle node
        if (data != -1) {
            Node node = new Node(data);
            node.left = createBst(list, low, mid - 1);
            node.right = createBst(list, mid + 1, high);
            return node;
        } else {
            return null;
        }

    }
 
    
    
}
