package linkedList;

import java.util.Comparator;

public class CircularSortedInsertion<Item extends Comparable<Item>>
        implements Comparator<Item> {

    public LLNode<Item> circularSortedInsert(LLNode<Item> head,
            Item data) {
        // case 1 where the linked list is empty
        if (head == null) {
            head = new LLNode<Item>(data);
            head.next = head;
        }
        // case 2 when the node is to be inserted before head
        else if (compare(head.data, data) > 0) {
            LLNode<Item> current = head;
            while (current.next != head) {
                current = current.next;
            }
            LLNode<Item> newNode = new LLNode<Item>(data);
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            LLNode<Item> current = head;
            // even if its the last node wont give null pointer as its a
            // circular reference so even the next node will be
            // pointing to first
            while (current.next != head
                    && compare(current.next.data, data) < 0) {
                current = current.next;
            }
            LLNode<Item> next = current.next;
            LLNode<Item> newNode = new LLNode<Item>(data);
            current.next = newNode;
            newNode.next = next;

        }
        return head;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.compareTo(o2);
    }

}
