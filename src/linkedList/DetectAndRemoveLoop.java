package linkedList;

public class DetectAndRemoveLoop<Item> {
		
	public LLNode<Item>  detectAndRemoveLoop(LLNode<Item> head){
		boolean loopFlag=false;
		try{
			if(head==null){
				throw new LinkedListException("LinkedList is Empty");
			}
			else{
				LLNode<Item> fast=head;
				LLNode<Item> slow=head;
				while(fast!=null && fast.next!=null){
					fast=fast.next.next;
					slow=slow.next;
					if(fast==slow){
						loopFlag=true;
						break;
					}
				}
				if(loopFlag){
					System.out.println("There is a loop ");
				}
				if(loopFlag){
					slow=head;
					while(fast!=slow){
						fast=fast.next;
						slow=slow.next;
					}
					return fast;
				}
				else{
					return null;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
