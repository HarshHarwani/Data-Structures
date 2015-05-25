package linkedList;


public class LinkedListDriver {
	
	public static LinkedList<Integer> linkedList=null;
	public static String string=null;
	public static void main(String args[]){
		linkedList=new LinkedList<Integer>();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addFirst(3);
		try{
		linkedList.addAtIndex(8, 1);
		linkedList.addLast(10);
		linkedList.addFirst(11);
		LLNode<Integer> head=linkedList.getHead();
		string=linkedList.printLinkedList(head);
		System.out.println("Original List is-->"+string);
		//Calling to get the middlenode of the linkedList.
		LLNode<Integer> middleNode=new MiddleNodeLinkedList<Integer>().getMiddleNodeLL(head);
		if(middleNode!=null)
		System.out.println("The middle node is-->"+middleNode.data);
		//Calling to get the nthnode from last of the linkedList.
		LLNode<Integer> nthNodeFromLast=new NthNodeFromLast<Integer>().getNthNodeFromLast(head,1);
		if(nthNodeFromLast!=null)
		System.out.println("The nth node from last is-->"+nthNodeFromLast.data);
		//calling to reverse the LinkedList
		LLNode<Integer> modifiedHead=new ReverseLinkedList<Integer>().reverseLL(head);
		System.out.print("Reversed List is -->"+linkedList.printLinkedList(modifiedHead));
		}catch(LinkedListException e){
			e.printStackTrace();
		}
	
	}
}