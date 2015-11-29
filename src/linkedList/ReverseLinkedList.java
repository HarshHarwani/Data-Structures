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
	
	public LLNode<Item> reverseLLLaterHAlf(LLNode<Item> head){
		try{
				if(head==null){
					throw new LinkedListException("LinkedList is Empty");
				}
				else{
					int length=getLength(head);
					LLNode<Item> prev=null;
					LLNode<Item> current =head;
					for(int i=0;i<length/2;i++){
						prev=current;
						current=current.next;
					}
					prev.next=reverseLL(current);
					return head;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	private int getLength(LLNode<Item> head) {
		int count=0;
		LLNode<Item> current=head;
		while(current!=null){
			current=current.next;
			count++;
		}
		return count;
	}

}
