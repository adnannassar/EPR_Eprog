package Lists.SingleLinkedList.GenericList;

public class MainString {
    public static void main(String[] args) {
        SimpleLinkedList<String> list = new SimpleLinkedList<>();

        list.set(0, "Ali");

        list.addFirst("Ahmad");

        list.add("Hassan");
        list.add("Hussein");
        list.add("Khalid");

        list.addFirst("Mohammed");
        list.add( "Omar", 3);
        list.add( "Zaid", 0);
        list.add("Salman", 6);
        list.add( "Yusuf", 7);

        list.print();

        System.out.println("\ncontains (\"Salman\") --> " + list.contains("Salman"));
        System.out.println("contains (\"Ibrahim\") --> " + list.contains("Ibrahim"));

        System.out.println("\nSize = " + list.size());

        System.out.println("Index of \"Zaid\" = " + list.getIndex("Zaid"));
        System.out.println("Index of \"Hussein\" = " + list.getIndex("Hussein"));
        list.set(3, "Bilal");
        list.print();

        System.out.println("\nValue at index 3 = " + list.getValue(3));
        System.out.println("Value at index 0 = " + list.getValue(0));

        System.out.println("Size = " + list.size());

        list.removeValue("Zaid");
        System.out.println("List after removing \"Zaid\"");
        list.print();

        list.removeValue("Yusuf");
        System.out.println("\nList after removing \"Yusuf\"");
        list.print();

        list.removeValue("Omar");
        System.out.println("\nList after removing \"Omar\"");
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
