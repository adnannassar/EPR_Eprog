package Arrays.TwoDimArrays;

public class KlausurAufgaben {
    public static void main(String[] args) {
        char[][] array = {
                {'a'},
                {'g', 'x'}
        };

        System.out.println(pickone(array));

        float[][] array2 = {
                {2, 2, 2},
                {0, 0, 0},
                {4, 4, 4}
        };
        System.out.println(sum(array2));
    }

    public static char pickone(char[][] array) {
        return array.length > 1 && array[array.length - 1].length > 1 ? array[array.length - 1][array.length - 2] : '@';
    }

    public static float sum(float[][] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array[i].length - 1];
        }
        return sum;
    }
}
