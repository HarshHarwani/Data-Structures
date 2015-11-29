package linkedList;

public class InsertIntoSortedCircularLL<Item extends Comparable<Item>> {

	public void insert(LLNode<Item> node, Item data) {
		if (node == null) {
			node = new LLNode<Item>(data);
			node.next = node;
			return;
		}
		LLNode<Item> current = node;
		LLNode<Item> prev = null;
		do {
			prev = current;
			current = current.next;
			if (data.compareTo(current.data) <= 0 && data.compareTo(prev.data) >= 0)
				break;
			if (prev.data.compareTo(current.data) > 0 && (data.compareTo(current.data) < 0)
					|| data.compareTo(prev.data) > 0)
				break;
		} while (current != node);

		LLNode<Item> newNode = new LLNode<Item>(data);
		newNode.next = current;
		prev.next = newNode;
	}
}
