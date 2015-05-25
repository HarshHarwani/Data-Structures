package linkedList;

public class LLNode<Item> {
	
	Item data;
	LLNode<Item> next;
	
	public LLNode(Item data) {
		this.data=data;
		this.next=null;
	}
}
