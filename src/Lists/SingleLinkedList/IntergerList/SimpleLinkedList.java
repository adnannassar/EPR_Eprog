package Lists.SingleLinkedList.IntergerList;


public class SimpleLinkedList {
    ListNode head;

    public SimpleLinkedList() {
        this.head = null;
    }


    /**
     * wird genutzt um zu prüfen, ob die Liste leer ist
     *
     * @return true, wenn die Liste leer ist, sonst false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * wird genutzt, um den Kopf (head) der Liste zu setzen
     *
     * @param value der Wert, der in Kopf (head) gesetzt werden soll
     */
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

    public void add(int value) {
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

    public void add(int value, int index) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index == 0) {
            addFirst(value);
        } else if (index >= size()) {
            add(value);
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

    public void set(int index, int value) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index == 0) {
            if (isEmpty()) {
                addHead(value);
            } else {
                head.setData(value);
            }
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
        } else {
            ListNode k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            k.setData(value);
        }
    }

    public int getValue(int index) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
            return -1;
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
            return -1;
        } else if (index == 0) {
            if (isEmpty()) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.getData();
            }

        } else {
            ListNode k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            return k.getData();
        }
    }

    public int getIndex(int value) {
        ListNode k = head;
        int index = 0;
        while (k != null) {
            if (k.getData() == value) {
                return index;
            }
            k = k.getSuccessor();
            index++;
        }
        return index;
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

    /**
     * prüft, ob ein Wert in der Liste enthalten ist
     *
     * @param value der Wert, der in der Liste gesucht wird
     * @return true, wenn der Wert in der Liste enthalten ist, sonst false
     */
    public boolean contains(int value) {
        ListNode k = head;
        while (k != null) {
            if (k.getData() == value) {
                return true;
            }
            k = k.getSuccessor();
        }
        return false;
    }


    public boolean removeValue(int value) {
        boolean deleted = false;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (head.getData() == value) {
            removeFirst();
        } else {
            ListNode k = head;
            ListNode before_k = head;
            while (k != null && !deleted) {
                if (k.getData() == value) {
                    before_k.setSuccessor(k.getSuccessor());
                    deleted = true;
                }
                before_k = k;
                k = k.getSuccessor();
            }
        }
        return deleted;
    }

    public boolean removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        } else {
            head = head.getSuccessor();
            return true;
        }
    }

    public boolean removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        } else {
            ListNode k = head;
            ListNode before_k = head;
            while (k.getSuccessor() != null) {
                before_k = k;
                k = k.getSuccessor();
            }
            before_k.setSuccessor(null);
            return true;
        }
    }


    public boolean removeIndex(int index) {
        boolean deleted = false;
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index == 0) {
            return removeFirst();
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
        } else {
            ListNode k = head;
            ListNode before_k = head;
            int i = 0;
            while (i != index) {
                before_k = k;
                k = k.getSuccessor();
                i++;
            }
            before_k.setSuccessor(k.getSuccessor());
            deleted = true;
        }

        return deleted;
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
