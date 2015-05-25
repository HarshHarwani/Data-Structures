package linkedList;

public class MiddleNodeLinkedList<Item> {
	
	public LLNode<Item> getMiddleNodeLL(LLNode<Item> head) throws LinkedListException{
		try{
			if(head==null){
				throw new LinkedListException("LinkedList is empty");
			}
			else{
				LLNode<Item>  fast=head;
				LLNode<Item> slow=head;
				while(fast!=null && fast.next!=null){
					fast=fast.next.next;
					slow=slow.next;
				}
				return slow;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
