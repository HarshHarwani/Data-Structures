package linkedList;

import java.util.Comparator;

public class IntersectionOfTwoLL<Item extends Comparable<Item>> implements Comparator<Item> {
	public LLNode<Item> getIntersectionLL(LLNode<Item> node1,LLNode<Item> node2){
		boolean aBiggerFlag=false;
		if(node1==null)
			return node2;
		else if(node2==null)
			return node1;
		else{
			int len1=getSize(node1);
			int len2=getSize(node2);
			int diff=Math.abs(len1-len2);
			if(len1>len2)
				aBiggerFlag=true;
			for(int i=0;i<diff;i++){
				if(aBiggerFlag)
				node1=node1.next;
				else
				node2=node2.next;
			}
			while(node1!=null && node2!=null){
				if(compare(node1.data, node2.data)==0){
					return node1;
				}
				node1=node1.next;
				node2=node2.next;
			}
		}
		return null;
	}
	
	public int getSize(LLNode<Item> node){
		int count=0;
		if(node==null){
			return 0;
		}else{
			while(node!=null){
				node=node.next;
				count++;
			}
			return count;
		}
	}

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
