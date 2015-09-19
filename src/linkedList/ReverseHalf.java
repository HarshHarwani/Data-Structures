package linkedList;

/**
 * Given a linked list [1 2 3 4 5 6], the resulting list should be [4 5 6 1 2
 * 3]. When given a linked list with an odd number of nodes, the list should be
 * split with the first half having an additional node. That is, given the list
 * [1 2 3 4 5], the resulting list should be [4 5 1 2 3]
 * 
 * @author hharwani
 *
 */
public class ReverseHalf<Item> {

    public LLNode<Item> reverseHalf(LLNode<Item> head) {
        if (head == null)
            return null;
        int length = getLength(head);
        int mid = length / 2;
        LLNode<Item> current = head;
        LLNode<Item> next = null;
        LinkedList<Item> linkedList = new LinkedList<>();
        for (int i = 0; i < mid; i++) {
            next = current.next;
            current.next = null; // clearing the reference as we insert these
                                 // nodes in a different linkedlist in order to
                                 // avoid memory leak
            linkedList.addLast(current.data);
            current = next;
        }
        head = next;
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = linkedList.getHead();
        return head;
    }

    private int getLength(LLNode<Item> head) {
        int length = 0;
        LLNode<Item> current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }

}
