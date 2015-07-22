package quickUnionFind;
import stackqueue.NextGreaterElement;

public class Driver {

	public static void main(String[] args) {
		QuickFind quickFind=new QuickFind(10);
		quickFind.weightedQuickUnion(0,1);
		quickFind.weightedQuickUnion(3,7);
		
		quickFind.weightedQuickUnion(9,6);
		
		quickFind.weightedQuickUnion(0,3);
		
		quickFind.weightedQuickUnion(4,6);
		quickFind.print();
		quickFind.weightedQuickUnion(8,4);
		quickFind.weightedQuickUnion(2,4);
		quickFind.weightedQuickUnion(7,8);
		quickFind.weightedQuickUnion(4,5);
	//	quickFind.print();
		boolean b=quickFind.find(0, 2);
		System.out.println("\n"+b);
/*		QuickFind quickFind=new QuickFind(10);
		quickFind.union(1, 5);
		quickFind.union(6, 0);
		quickFind.union(4, 5);
		quickFind.union(2, 8);
		quickFind.union(7, 1);
		quickFind.union(9, 0);
		quickFind.print();*/
		/*NextGreaterElement nxt=new NextGreaterElement();
		int[] a={4, 5, 2, 25, 20, 11, 13, 21, 3};
		nxt.nextGreaterElement(a);*/

	}

}
