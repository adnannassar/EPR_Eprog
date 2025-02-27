package Arrays.OneDimArrays.Aufgaben;

public class KlausurAufgaben {

    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 9, 11};
        int[] result = paarSumme(numbers);
        ArrayTools.printOnDimArray(result);

        int[] numbers2 = {14, 5, 0, -6, 7, -4, 2, 16};
        int[] result2 = spiegelsumme(numbers2);
        ArrayTools.printOnDimArray(result2);

        int[] numbers3 = {14, 5, 3, 2, 16};
        int[] result3 = spiegelsumme(numbers3);
        ArrayTools.printOnDimArray(result3);

        System.out.println(spiegelsumme2(numbers2));

        int[] numbers4 = {4, 3, 2, 1, -6, 5, 0};
        int[] result4 = jedeZweiteKomponente(numbers4);
        ArrayTools.printOnDimArray(result4);
    }

    public static int[] paarSumme(int... numbers) {
        int[] result = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            result[i] = numbers[i] + numbers[i + 1];
        }
        return result;
    }

    public static int[] spiegelsumme(int[] array) {
        if (array.length % 2 == 0) {
            int[] result = new int[array.length / 2];
            for (int i = 0, k = 0, j = array.length - 1; i < array.length / 2; i++, k++, j--) {
                result[k] = array[i] + array[array.length - 2];
            }
            return result;
        } else {
            int[] result = new int[(array.length / 2) + 1];
            for (int i = 0, k = 0, j = array.length - 1; i < array.length / 2; i++, k++, j--) {
                result[k] = array[i] + array[j];
                result[k + 1] = array[array.length / 2] + array[array.length / 2];
            }
            return result;
        }
    }

    public static int spiegelsumme2(int[] array) {
        int[] X = new int[array.length / 2 + array.length % 2];
        return X.length;
    }

    public static int[] jedeZweiteKomponente(int[] array) {
        int[] result = new int[array.length / 2];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }

}
