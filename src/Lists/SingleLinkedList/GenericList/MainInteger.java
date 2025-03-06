package Lists.SingleLinkedList.GenericList;


public class MainInteger {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        list.set(0, 1);

        list.addFirst(1);



        list.add(2);
        list.add(3);
        list.add(5);

        list.addFirst(0);
        list.add(4, 3);
        list.add(-1,  0);
        list.add(6,  6);
        list.add(7,  100);

        list.print();

        System.out.println("\ncontains (6) --> " + list.contains(6));
        System.out.println("contains (8) --> " + list.contains(8));

        System.out.println("\nSize = " + list.size());

        System.out.println("Index of 0 = " + list.getIndex(0));
        System.out.println("Index of 4 = " + list.getIndex(4));
        list.set(3, 9);
        list.print();

        System.out.println("\nValue at index 3 = " + list.getValue(3));
        System.out.println("Value at index 0 = " + list.getValue(0));

        System.out.println("Size = " + list.size());

        list.removeValue(-1);
        System.out.println("List after removing -1");
        list.print();

        list.removeValue(7);
        System.out.println("\nList after removing 7");
        list.print();

        list.removeValue(2);
        System.out.println("\nList after removing 2");
        list.print();

        list.removeFirst();
        System.out.println("\nList after removing first element");
        list.print();

        list.removeLast();
        System.out.println("\nList after removing last element");
        list.print();

        list.removeIndex(2);
        System.out.println("\nList after removing element at index 2");
        list.print();

    }
}
