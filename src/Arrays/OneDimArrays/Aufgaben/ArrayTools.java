package Arrays.OneDimArrays.Aufgaben;

public class ArrayTools {

    public static int summe(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int summeMul(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int countUsingCounter(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    public static int countUsingI(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {

        }
        return i;
    }


    public static boolean search(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
            }
        }
        return found;
    }

    public static boolean istGeradeArray(int[] array) {
        boolean gerade = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                gerade = false;
            }
        }
        return gerade;
    }

    public static void printOnDimArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
