package Arrays.OneDimArrays;

import java.util.Random;

public class DB {
    public static int[] generateArray() {
        int randomSize = new Random().nextInt(20, 200);
        int[] array = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            array[i] = new Random().nextInt(0, 100);
        }
        return array;
    }
}
