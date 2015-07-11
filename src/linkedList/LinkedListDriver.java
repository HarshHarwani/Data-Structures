package linkedList;

public class LinkedListDriver {

    public static LinkedList<Integer> linkedList = null;
    public static String string = null;

    public static void main(String args[]) {
        linkedList = new LinkedList<Integer>();
        linkedList.addFirst(1);
        linkedList.addLast(3);
        linkedList.addLast(3);
        try {
            linkedList.addLast(8);
            linkedList.addLast(10);
            linkedList.addLast(11);
            LLNode<Integer> head = linkedList.getHead();
            string = linkedList.printLinkedList(head);
            System.out.println("Original List is-->" + string);
            // Calling to get the middlenode of the linkedList.
            LLNode<Integer> middleNode = new MiddleNodeLinkedList<Integer>().getMiddleNodeLL(head);
            if (middleNode != null)
                System.out.println("The middle node is-->" + middleNode.data);
            // Calling to get the nthnode from last of the linkedList.
            LLNode<Integer> nthNodeFromLast = new NthNodeFromLast<Integer>().getNthNodeFromLast(head, 1);
            if (nthNodeFromLast != null)
                System.out.println("The nth node from last is-->" + nthNodeFromLast.data);
            // calling to reverse the LinkedList
            /*
             * LLNode<Integer> modifiedHead=new
             * ReverseLinkedList<Integer>().reverseLL(head); System.out.println(
             * "Reversed List is -->"+linkedList.printLinkedList(modifiedHead));
             */
            // calling to get the startOfLoop if the loop exists
            /*
             * LLNode<Integer> node=linkedList.getItem(modifiedHead, 10);
             * node.next=modifiedHead;
             */
            LLNode<Integer> startOfLoop = new DetectAndRemoveLoop<Integer>().detectAndRemoveLoop(head);
            if (startOfLoop != null)
                System.out.println("Start of the loop is -->" + startOfLoop.data);
            else
                System.out.println("There is no loop in the LinkedList");

            // Calling to insert a node in a sortedLL
            LLNode<Integer> start = new InsertInSortedLL<Integer>().insertInSorted(head, 15);
            System.out.println(linkedList.printLinkedList(start));

            // calling to remove duplicates from a sortedLL
            LLNode<Integer> newHead = new RemoveDuplicatesFromSortedLL<Integer>().removeDuplicatesSortedLL(start);
            System.out
                    .println("LinkedList after removing duplicates is-->" + " " + linkedList.printLinkedList(newHead));

            // calling to reverse a LinkedList recursively
            LLNode<Integer> moHead = new ReverseLinkedListRecursive<Integer>().reverseLinkedList(newHead);
            System.out.println("LinkedList after recursive reverse is-->" + " " + linkedList.printLinkedList(moHead));

            // calling to find the intersection of two LinkedLists
            LinkedList<Integer> list1 = new LinkedList<Integer>();
            list1.addLast(1);
            list1.addLast(2);
            list1.addLast(3);
            list1.addLast(4);
            LLNode<Integer> headlist1 = list1.getHead();
            LLNode<Integer> node1 = list1.getItem(headlist1, 4);
            LinkedList<Integer> list2 = new LinkedList<Integer>();
            list2.addLast(3);
            list2.addLast(4);
            list2.addLast(5);
            list2.addLast(6);
            LLNode<Integer> headlist2 = list2.getHead();
            LLNode<Integer> node2 = list1.getItem(headlist2, 4);
            node1.next = node2;
            LLNode<Integer> intersectionPoint = new IntersectionOfTwoLL<Integer>().getIntersectionLL(headlist1,
                    headlist2);
            if (intersectionPoint != null)
                System.out.println("Intersection point of the LinkedList is-->" + " " + intersectionPoint.data);
            else
                System.out.println("There is no intersection point in the linkedList");
        } catch (LinkedListException e) {
            e.printStackTrace();
        }
        
        LruCache lCache=new LruCache(4);
        System.out.println(lCache.loadPage(2));  
        System.out.println(lCache.loadPage(3));  
        System.out.println(lCache.loadPage(1));  
        System.out.println(lCache.loadPage(2));  
        System.out.println(lCache.loadPage(4));  
        System.out.println(lCache.loadPage(1));  
        System.out.println(lCache.loadPage(4));  
        System.out.println(lCache.loadPage(5));  
        System.out.println(lCache.loadPage(6));  

        // calling to test removeElement functionality
        /*
         * LinkedList<Integer> linkedList=new LinkedList<Integer>();
         * linkedList.addFirst(1); linkedList.addFirst(1);
         * linkedList.addFirst(1); linkedList.addFirst(1);
         * linkedList.addFirst(1); linkedList.addFirst(1);
         * linkedList.addFirst(1); linkedList.addFirst(1);
         * linkedList.addFirst(1); linkedList.addFirst(1);
         * linkedList.addFirst(1); LLNode<Integer> head=linkedList.getHead();
         * RemoveElements<Integer> re=new RemoveElements<Integer>();
         * LLNode<Integer> res=re.removeElements(head, 1); try {
         * System.out.println(linkedList.printLinkedList(res)); } catch
         * (LinkedListException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); }
         */
    }
}