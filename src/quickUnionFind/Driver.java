package quickUnionFind;

public class Driver {

	public static void main(String[] args) {
		QuickFind quickFind=new QuickFind(10);
		quickFind.weightedQuickUnion(4,3);
		quickFind.weightedQuickUnion(3,8);
		quickFind.weightedQuickUnion(6,5);
		quickFind.weightedQuickUnion(9,4);
		quickFind.weightedQuickUnion(2,1);
		quickFind.weightedQuickUnion(5,0);
		quickFind.weightedQuickUnion(7,2);
		quickFind.weightedQuickUnion(6,1);
		quickFind.weightedQuickUnion(7,3);
		quickFind.print();
		boolean b=quickFind.find(0, 2);
		System.out.println("\n"+b);

	}

}
