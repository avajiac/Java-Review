package DataStructures.SinglyLinkedList;

public class LinkedList {

    ////Class Variables
    private ListNode head;

    ////Constructors
    public LinkedList() {
        this.head = null;
    }

    public LinkedList(ListNode node) {
        head = node;
    }

    ////Accessors
    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode node) {
        node.setNext(head.getNext());
        head = node;
    }

    ////Methods
    //Length
    public int iterativeLength() {
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    public int recursiveLength() {
        return recursiveHelper(head);
    }

    private int recursiveHelper(ListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + recursiveHelper(node.getNext());
    }

    //Insert Methods
    public void insertFront(ListNode node) {
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void insertRear(ListNode node) {
        ListNode temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public void insertIndex(ListNode node, int index) {
        if (index == 0) {
            insertFront(node);
        }
        ListNode temp = head;
        int current = 0;
        while (current < index - 1) {
            temp = temp.getNext();
            current++;
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }
}
