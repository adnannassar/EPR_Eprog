package Lists.DoublyLinkedList.GenericList;

public class ListNode<T> {
    private T data;
    private ListNode<T> successor;
    private ListNode<T> previous;

    public ListNode(T value, ListNode<T> next, ListNode<T> previous) {
        this.data = value;
        this.successor = next;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getSuccessor() {
        return successor;
    }

    public void setSuccessor(ListNode<T> successor) {
        this.successor = successor;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }
}
