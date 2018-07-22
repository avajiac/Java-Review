package DataStructures.SinglyLinkedList;

public class ListNode<T>    {

    private T data;
    private ListNode next;

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode(T data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}
