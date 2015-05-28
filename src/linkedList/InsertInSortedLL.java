package linkedList;

import java.util.Comparator;

public class InsertInSortedLL<Item extends Comparable<Item>> implements Comparator<Item> {

	public LLNode<Item> insertInSorted(LLNode<Item> head,Item data){
		LLNode<Item> prev=null;
		if(head==null){
			System.out.println("LinkedList is empty,Creating a new node");
			LLNode<Item> node=new LLNode<Item>(data);
			head=node;
			head.next=null;
		}else{
			//creating a new linkedList with the given head
			LinkedList<Item> linkedList=new LinkedList<Item>(head);
			LLNode<Item> current=linkedList.getHead();
			//case 1 where given key is less than the first node
			if(compare(data,current.data)<1){
				linkedList.addFirst(data);
			}else{
				//case 2 where given key is less than any oher node other than the first node
				while(current!=null){
					if(compare(data,current.data)<1 || compare(data,current.data)==0){
						LLNode<Item> newNode=new LLNode<Item>(data);
						prev.next=newNode;
						newNode.next=current;
						break;
					}
					prev=current;
					current=current.next;
				}
				//case 3 where the given key is the largest so its added to the end of the list.
				if(current==null){
					linkedList.addLast(data);
				} 
			}
			return linkedList.getHead();
		}
		return null;
		
	}

	@Override
	public int compare(Item o1, Item o2) {
		return o1.compareTo(o2);
	}

}
