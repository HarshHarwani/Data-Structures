package linkedList;

import java.util.Comparator;

public class RemoveDuplicatesFromSortedLL<Item extends Comparable<Item>> implements Comparator<Item> {

	public LLNode<Item> removeDuplicatesSortedLL(LLNode<Item> head){
		try{
			if(head==null){
				throw new LinkedListException("LinkedList is empty");
			}else{
				LLNode<Item> current=head;
				while(current.next!=null){
					LLNode<Item> next=current.next;
					if(compare(current.data,next.data)==0){
						current.next=next.next;
						next=null;
					}else{
						current=current.next;
					}
				}
				return head;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int compare(Item o1, Item o2) {
		return o1.compareTo(o2);
	}

}
