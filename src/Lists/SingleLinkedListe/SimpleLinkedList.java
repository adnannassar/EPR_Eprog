package Lists.SingleLinkedListe;

public class SimpleLinkedList {
    ListNode head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addHead(int value) {
        head = new ListNode(value, null);
    }

    public void addFirst(int value) {
        if (isEmpty()) {
            addHead(value);
        } else {
            ListNode k = new ListNode(value, head);
            head = k;
        }
    }

    public void add(int value, int index) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index == 0) {
            addFirst(value);
        } else if (index >= size()) {
            addLast(value);
        } else {
            ListNode k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            ListNode n = new ListNode(value, k.getSuccessor());
            k.setSuccessor(n);
        }


    }

    public int size() {
        int count = 0;
        ListNode k = head;
        while (k != null) {
            count++;
            k = k.getSuccessor();
        }
        return count;
    }

    public void addLast(int value) {
        if (isEmpty()) {
            addHead(value);
        } else {
            ListNode k = head;
            while (k.getSuccessor() != null) {
                k = k.getSuccessor();
            }
            k.setSuccessor(new ListNode(value, null));
        }
    }

    public void print() {
        ListNode k = head;
        while (k != null) {
            if (k.getSuccessor() == null) {
                System.out.print(k.getData());
                break;
            } else {
                System.out.print(k.getData() + " -> ");
            }
            k = k.getSuccessor();
        }
    }
}
