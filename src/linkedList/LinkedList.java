package linkedList;
import linkedList.LinkedListException;

public class LinkedList<Item> {
	
	private LLNode<Item> head;
	private static int listcount;
	
	public LLNode<Item> getHead() {
		return head;
	}

	public void setHead(LLNode<Item> head) {
		this.head = head;
	}

	public LinkedList() {
		head=null;
	}
	/**
	 * Returns true if the list is Empty
	 */
	public boolean isEmpty(){
		return head==null;
	}
	/**
	 * 
	 * Adding new data to the front of the list.
	 */
	public void addFirst(Item data){
		try{
			if(head==null){
				head=new LLNode<Item>(data);
			}
			else{
				LLNode<Item> newNode=new LLNode<Item>(data);
				newNode.next=head;
				head=newNode;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		listcount++;
	}
	/**
	 * 
	 * Adding data to the end of the list.
	 */
	public void addLast(Item data){
		try{
			if(head==null){
				head=new LLNode<Item>(data);
			}
			else{
				LLNode<Item> current=head;
				while(current.next!=null){
					current=current.next;
				}
				LLNode<Item> newNode=new LLNode<Item>(data);
				current.next=newNode;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		listcount++;
	}
	/**
	 * @param data
	 * @param index
	 * @description to insert a node at a particular index in the LinkedList
	 */
	public void addAtIndex(Item data,int index) throws LinkedListException{
		try{
			if(index<0 || index>getSize()){
				throw new LinkedListException("Invalid Index");
			}
			if(head==null){
				head=new LLNode<Item>(data);
			}
			else{
				LLNode<Item> current=head;
				for(int i=0;i<index-1;i++){
					current=current.next;
				}
				LLNode<Item> next=current.next;
				LLNode<Item> newNode=new LLNode<Item>(data);
				current.next=newNode;
				newNode.next=next;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @param data
	 * @description remove given data from the LinkedList
	 */
	public void remove(Item data){
		
	}
	
	
	/**
	 * @description remove given data without using headPointer
	 */
	public void removeWithoutUsingHead(){
		
	}	
	/**
	 * 
	 * to get the size of the linkedList
	 */
	public static int getSize(){
		return listcount;
	}
	
	/**
	 * @description returns the size of the linkedList using recursion.
	 * @return int
	 */
	public int getSizeRecursive(){
		return -1;
	}
	/**
	 * 
	 * @param node
	 * @return String
	 * @throws LinkedListException
	 * @description to print the entire linkedList
	 */
	public String printLinkedList(LLNode<Item> node) throws LinkedListException{
		try{
			StringBuilder stringBuilder=new StringBuilder();
			if(node==null){
				throw new LinkedListException("LinkedList is Empty");
			}
			else{
				LLNode<Item> current=node;
				while(current!=null){
					stringBuilder=stringBuilder.append(current.data.toString()).append("-->");
					current=current.next;
				}
				return stringBuilder.append("null").toString();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
