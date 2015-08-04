package linkedList;

/*
 *  Java Program to Implement Doubly Linked List
 */

import java.util.Scanner;

/*  Class Node  */
class DllNode {
    public int data;
    public DllNode next, prev;

    /* Constructor */
    public DllNode() {
        next = null;
        prev = null;
        data = 0;
    }

    /* Constructor */
    public DllNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    /* Function to set link to next node */
    public void setLinkNext(DllNode n) {
        next = n;
    }

    /* Function to set link to previous node */
    public void setLinkPrev(DllNode p) {
        prev = p;
    }

    /* Funtion to get link to next node */
    public DllNode getLinkNext() {
        return next;
    }

    /* Function to get link to previous node */
    public DllNode getLinkPrev() {
        return prev;
    }

    /* Function to set data to node */
    public void setData(int d) {
        data = d;
    }

    /* Function to get data from node */
    public int getData() {
        return data;
    }
}

/* Class linkedList */
class DoubleLinkedList {
    public DllNode head;
    public DllNode tail;
    public int size;

    /* Constructor */
    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /* Function to check if list is empty */
    public boolean isEmpty() {
        return head == null;
    }

    /* Function to get size of list */
    public int getSize() {
        return size;
    }

    /* Function to insert element at begining */
    public void insertAtStart(int val) {
        DllNode node = new DllNode(val);
        if (head == null) { // case where the list is empty
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        }
        size++;
    }

    /* Function to insert element at end */
    public void insertAtEnd(int val) {
        if (tail == null) {
            insertAtStart(val);
        } else {
            DllNode node = new DllNode(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    /* Function to insert element at position */
    public void insertAtPos(int val, int pos) {
        if (pos == 0) { // case 1st insert as the first element
            insertAtStart(val);
            return;
        } else if (pos == size) { // insert at last element
            insertAtEnd(val);
            return;
        } else { // specific position
            DllNode node = new DllNode(val);
            DllNode current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            DllNode next = current.next;
            current.next = node;
            node.prev = current;
            node.next = next;
            next.prev = current;
        }
        size++;
    }

    /* Function to delete node at position */
    public void deleteAtPos(int pos) {
        if (pos == 0) { // first element is to be removed
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        } else if (pos == size - 1) { // last element is to be removed
            DllNode prev = tail.prev;
            prev.next = null;
            size--;
        } else {
            DllNode current = head;
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            DllNode next = current.next;
            DllNode prev = current.prev;
            prev.next = next;
            next.prev = prev;
            size--;
        }
    }

    /* Function to display status of list */
    public void display() {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (head.getLinkNext() == null) {
            System.out.println(head.getData());
            return;
        }
        DllNode current = head;
        System.out.print(head.getData() + " <-> ");
        current = head.getLinkNext();
        while (current.getLinkNext() != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getLinkNext();
        }
        System.out.print(current.getData() + "\n");
    }
}

/* Class DoublyLinkedList */
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Doubly Linked List Test\n");
        char ch;
        /* Perform list operations */
        do {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");

            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter integer element to insert");
                list.insertAtStart(scan.nextInt());
                break;
            case 2:
                System.out.println("Enter integer element to insert");
                list.insertAtEnd(scan.nextInt());
                break;
            case 3:
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt();
                System.out.println("Enter position");
                int pos = scan.nextInt();
                if (pos < 0 || pos > list.getSize())
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;
            case 4:
                System.out.println("Enter position");
                int p = scan.nextInt();
                if (p < 0 || p > list.getSize())
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5:
                System.out.println("Empty status = " + list.isEmpty());
                break;
            case 6:
                System.out.println("Size = " + list.getSize() + " \n");
                break;
            default:
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* Display List */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }
}