package Lists.DoublyLinkedList.GenericList;

public class SimpleLinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;

    public SimpleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addHead(T value) {
        head = new ListNode<>(value, null, null);
        tail = head;
    }

    public void addFirst(T value) {
        if (isEmpty()) {
            addHead(value);
        } else {
            ListNode<T> newNode = new ListNode<>(value, head, null);
            head.setPrevious(newNode);
            head = newNode;
        }
    }

    public void add(T value) {
        if (isEmpty()) {
            addHead(value);
        } else {
            ListNode<T> newNode = new ListNode<>(value, null, tail);
            tail.setSuccessor(newNode);
            tail = newNode;
        }
    }

    public int size() {
        int size = 0;
        ListNode<T> k = head;
        while (k != null) {
            size++;
            k = k.getSuccessor();
        }
        return size;
    }

    public void add(T value, int index) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index == 0) {
            addFirst(value);
        } else if (index >= size()) {
            add(value);
        } else {
            ListNode<T> k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            ListNode<T> newNode = new ListNode<>(value, k.getSuccessor(), k);
            if (k.getSuccessor() != null) {
                k.getSuccessor().setPrevious(newNode);
            }
            k.setSuccessor(newNode);
        }
    }

    public void set(int index, T value) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
        } else {
            ListNode<T> k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            k.setData(value);
        }
    }

    public boolean contains(T value) {
        ListNode<T> k = head;
        while (k != null) {
            if (k.getData().equals(value)) {
                return true;
            }
            k = k.getSuccessor();
        }
        return false;
    }


    public int  getIndex (int value){
        ListNode<T> k = head;
        int i = 0;
        while (k != null) {
            if (k.getData().equals(value)) {
                return i;
            }
            k = k.getSuccessor();
            i++;
        }
        return -1;
    }

    public T getValue(int index) {
        if (index < 0) {
            System.out.println("Index must be greater than 0");
            return null;
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
            return null;
        } else {
            ListNode<T> k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            return k.getData();
        }
    }

    public boolean removeIndex(int index){
        if (index < 0) {
            System.out.println("Index must be greater than 0");
            return false;
        } else if (index >= size()) {
            System.out.println("Index out of bounds");
            return false;
        } else {
            ListNode<T> k = head;
            int i = 0;
            while (i != index) {
                k = k.getSuccessor();
                i++;
            }
            if (k.getPrevious() != null) {
                k.getPrevious().setSuccessor(k.getSuccessor());
            } else {
                head = k.getSuccessor();
            }
            if (k.getSuccessor() != null) {
                k.getSuccessor().setPrevious(k.getPrevious());
            } else {
                tail = k.getPrevious();
            }
            return true;
        }
    }

    public boolean removeValue(T value) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }
        ListNode<T> k = head;
        while (k != null) {
            if (k.getData().equals(value)) {
                if (k.getPrevious() != null) {
                    k.getPrevious().setSuccessor(k.getSuccessor());
                } else {
                    head = k.getSuccessor();
                }
                if (k.getSuccessor() != null) {
                    k.getSuccessor().setPrevious(k.getPrevious());
                } else {
                    tail = k.getPrevious();
                }
                return true;
            }
            k = k.getSuccessor();
        }
        return false;
    }

    public boolean removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        } else {
            head = head.getSuccessor();
            if (head != null) {
                head.setPrevious(null);
            } else {
                tail = null;
            }
            return true;
        }
    }

    public boolean removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        } else {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.setSuccessor(null);
            } else {
                head = null;
            }
            return true;
        }
    }

    public void print() {
        ListNode<T> k = head;
        while (k != null) {
            if (k.getSuccessor() == null) {
                System.out.print(k.getData());
                break;
            } else {
                System.out.print(k.getData() + " <-> ");
            }
            k = k.getSuccessor();
        }
        System.out.println();
    }
}