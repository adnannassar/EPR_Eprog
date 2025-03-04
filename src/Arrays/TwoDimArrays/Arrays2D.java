package Arrays.TwoDimArrays;


public class Arrays2D {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 4, 10, 8},
                {5, 6}
        };

        int[][] array2 = new int[3][2];
        /*
                {
                    {0, 0},
                    {0, 0},
                    {0, 0}
                }
        * */

        int[][] array3 = new int[3][];
        /*
                {
                    null,
                    null,
                    null
                }
         */

        array3[0] = new int[2];
        /*
                {
                    {0, 0},
                    null,
                    null
                }
         */

        array3[1] = new int[3];
        /*
                {
                    {0, 0},
                    {0, 0, 0},
                    null
                }
         */

        array3[2] = new int[4];
        /*
                {
                    {0, 0},
                    {0, 0, 0},
                    {0, 0, 0, 0}
                }
         */

        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[1][0] = 3;
        array3[1][1] = 4;
        array3[1][2] = 5;
        array3[2][0] = 6;
        array3[2][1] = 7;
        array3[2][2] = 8;
        array3[2][3] = 9;

        ArrayTools2D.printTwoDimArray(array3);

    }
}
