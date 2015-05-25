package linkedList;

public class ReverseLinkedList<Item> {
	
	public LLNode<Item> reverseLL(LLNode<Item> head){
		try{
				if(head==null){
					throw new LinkedListException("LinkedList is Empty");
				}
				else{
					LLNode<Item> next=null;
					LLNode<Item> prev=null;
					LLNode<Item> current=head;
					while(current!=null){
						next=current.next;
						current.next=prev;
						prev=current;
						current=next;
					}
					return prev;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
