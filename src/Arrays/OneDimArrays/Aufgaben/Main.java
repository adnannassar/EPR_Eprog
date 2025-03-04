package Arrays.OneDimArrays.Aufgaben;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[5];
        int[] array2 = {1,2,3,4,5};
        System.out.println(ArrayTools.countUsingCounter(array2));
        System.out.println(ArrayTools.countUsingI(array2));
        ArrayTools.printOnDimArray(array);
    }
}
