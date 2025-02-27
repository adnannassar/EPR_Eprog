package Arrays.OneDimArrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = DB.generateArray();

        // Print array of integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
