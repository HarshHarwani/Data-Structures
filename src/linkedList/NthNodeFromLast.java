package linkedList;

public class NthNodeFromLast<Item> {
	
	public LLNode<Item> getNthNodeFromLast(LLNode<Item> head,int index) throws LinkedListException{
		try{
			if(head==null){
				throw new LinkedListException("LinkedList is empty");
			}
			else{
				if(index<0 || index>LinkedList.getSize()){
					throw new LinkedListException("Invalid index");
				}
				LLNode<Item> fast=head;
				LLNode<Item> slow=head;
				for(int i=0;i<index;i++){
					fast=fast.next;
				}
				while(fast!=null){
					fast=fast.next;
					slow=slow.next;
				}
				return slow;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
