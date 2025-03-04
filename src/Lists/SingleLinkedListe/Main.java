package Lists.SingleLinkedListe;


public class Main {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addFirst(1);

        list.addLast(2);
        list.addLast(3);
        list.addLast(5);

        list.addFirst(0);
        list.add(4, 3);
        list.add(-1,  0);
        list.add(6,  6);
        list.add(7,  100);

        list.print();

        System.out.println("\nSize = " + list.size());
    }
}
