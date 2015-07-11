package linkedList;

import java.util.HashMap;

/**
 * Least Recently Used (LRU) caching scheme is to discard the least recently
 * used items first when the cache is full and a newly visted item needs to be
 * added to the cache. Design a LRU caching scheme that Returns the page number
 * and update cache accordingly. This time complexity of this method should be
 * O(1).
 * 
 */
public class LruCache {

    private int capacity = 0;
    private int maxCapacity = 0;
    private DListNode head = null;
    private DListNode tail = null;
    private HashMap<Integer, DListNode> map = new HashMap<Integer, DListNode>();

    private class DListNode {
        DListNode next = null;
        DListNode prev = null;
        int data;

        DListNode(int v) {
            this.data = v;
        }
    }

    public LruCache(int limit) {
        if (limit < 1) {
            throw new java.lang.IllegalArgumentException();
        }
        this.maxCapacity = limit;
    }

    public int loadPage(final int page) {
        if (map.containsKey(page)) {
            DListNode node = map.get(page);
            if (node != head) {
                remove(node);
                movetoHead(map.get(page));
            }
            print();
            return node.data;
        }
        DListNode node = new DListNode(page);
        movetoHead(node);
        map.put(page, node);
        if (capacity == maxCapacity) {
            removeTail();
        } else {
            ++capacity;
        }
        print();
        return node.data;
    }

    private void removeTail() {
        map.remove(tail.data);
        DListNode last = tail;
        tail = tail.prev;
        if (tail != null)
            tail.next = null;
        if (head == last) {
            head = null;
        }
    }

    private void print() {
        DListNode cur = head;
        System.out.print("head->");
        while (cur != null) {
            System.out.print(cur.data);
            if (cur == tail)
                System.out.print(" (tail)");
            else
                System.out.print("->");
            cur = cur.next;
        }
        System.out.println("");

    }

    private void remove(DListNode node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node == tail) {
            tail = node.prev;
        }
    }

    private void movetoHead(DListNode dListNode) {
        dListNode.next = head;
        dListNode.prev = null;
        if (head != null)
            head.prev = dListNode;
        head = dListNode;
        if (tail == null)
            tail = dListNode;
    }

}
