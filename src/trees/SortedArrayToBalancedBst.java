package trees;

public class SortedArrayToBalancedBst {

    public Node createBalancedBst(int[] a, int low, int high) {
        if (high < low)
            return null;
        else {
            int mid = 0;
            if ((high - low) % 2 == 0) { // check if the segment is odd add 1 to
                                         // the mid element,
                                         // helps in creating a balanced BST
                mid = (low + (high - low) / 2);
            } else {
                mid = (low + (high - low) / 2) + 1;
            }
            Node node = new Node(a[mid]);
            node.left = createBalancedBst(a, low, mid - 1);
            node.right = createBalancedBst(a, mid + 1, high);
            return node;
        }
    }
}
