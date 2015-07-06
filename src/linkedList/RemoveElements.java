package linkedList;

import java.util.Comparator;

/**
 * 
 * @author hharwani Remove all elements from a linked list of integers that have
 *         value val.
 * 
 *         Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return:
 *         1 --> 2 --> 3 --> 4 --> 5
 *         this program also takes care of loitering and references are freed so that they can garbage collected 
 *         asap.
 */
public class RemoveElements<Item extends Comparable<Item>>  implements Comparator<Item>{

    public  LLNode<Item> removeElements(LLNode<Item> head, Item val) {
        if (head == null)
            return null;
        LLNode<Item> prev = null;
        LLNode<Item> current = head;
        while (current != null) {
            if (current.data.compareTo(val)==0) {
                if (current.next == null) {
                    current = null;
                    if(prev!=null)
                        prev.next = null;
                    if(prev==null)
                        head=null;
                } else {
                    LLNode<Item> next = current.next;
                    current.data = next.data;
                    current.next = next.next;
                    next=null;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
    
    @Override
    public int compare(Item o1, Item o2) {
        return o1.compareTo(o2);
    }

}
