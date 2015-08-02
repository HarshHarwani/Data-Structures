package linkedList;

public class DoublyLinkedList {
    DllNode head;
    int size;

    public void insert(int data) {
        insert(head, data);
    }

    public void remove(int data) {
        remove(head, data);
    }

    public boolean isEmpty() {
        return false;
    }

    public int getSize() {
        return this.size;
    }

    private void remove(DllNode head, int data) {
        // TODO Auto-generated method stub

    }

    private void insert(DllNode head, int data) {
        // TODO Auto-generated method stub

    }

}

class DllNode {
    DllNode prev;
    DllNode next;
    int data;

    public DllNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
