package linkedList;

public class ReverseLinkedListRecursive<Item> {
	LLNode<Item> head=null;
	public LLNode<Item> reverseLinkedList(LLNode<Item> node){
		if(node==null){
			return null;
		}
		if(node.next==null){
			head=node;
		}else{
			reverseLinkedList(node.next);
			node.next.next=node;
			node.next=null;
		}
		return head;
	}

}