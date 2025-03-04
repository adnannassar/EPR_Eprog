package Lists.SingleLinkedListe;

public class ListNode {
    private int data;
    private ListNode successor;

    public ListNode(int value, ListNode next) {
        this.data = value;
        this.successor = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getSuccessor() {
        return successor;
    }

    public void setSuccessor(ListNode successor) {
        this.successor = successor;
    }
}
