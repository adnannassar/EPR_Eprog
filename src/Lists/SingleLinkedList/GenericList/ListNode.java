package Lists.SingleLinkedList.GenericList;

public class ListNode<T> {
    private T data;
    private ListNode<T> successor;

    public ListNode(T value, ListNode<T> next) {
        this.data = value;
        this.successor = next;
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
}
