package linkedList;


public class LinkedListDriver {
	
	public static LinkedList<Integer> linkedList=null;
	public static String string=null;
	public static void main(String args[]){
		linkedList=new LinkedList<Integer>();
		linkedList.addFirst(1);
		linkedList.addLast(2);
		linkedList.addLast(3);
		try{
		linkedList.addLast(8);
		linkedList.addLast(10);
		linkedList.addLast(11);
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
		/*LLNode<Integer> modifiedHead=new ReverseLinkedList<Integer>().reverseLL(head);
		System.out.println("Reversed List is -->"+linkedList.printLinkedList(modifiedHead));*/
		// calling to get the startOfLoop if the loop exists
	/*	LLNode<Integer> node=linkedList.getItem(modifiedHead, 10);
		node.next=modifiedHead;*/
		LLNode<Integer> startOfLoop=new DetectAndRemoveLoop<Integer>().detectAndRemoveLoop(head);
		if(startOfLoop!=null)
		System.out.println("Start of the loop is -->"+startOfLoop.data);
		else
			System.out.println("There is no loop in the LinkedList");
		LLNode<Integer> start=new InsertInSortedLL<Integer>().insertInSorted(head,12);
		System.out.println(linkedList.printLinkedList(start));
		}catch(LinkedListException e){
			e.printStackTrace();
		}
	
	}
}