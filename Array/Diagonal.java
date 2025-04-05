
import java.util.Arrays;

public class Diagonal {
    public static int findSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }

        // for (int[] i : a) {
        // for (int j : i) {
        // sum = sum + j;
        // }
        // }

        return sum;
    }

    public static int secondaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = a.length-1; i >= 0 ; i--) {
        for (int j = 0; j < a[i].length; j++) {
        if (i+j==a.length-1) {
        sum = sum + a[i][j];
        }
        }
        }
        return sum;
        // --------------------------------------------------------------------------------
        // int sum = 0;
        // for (int i = a.length - 1, j=0; i >= 0; i--, j++) {
        //     sum = sum + a[j][i];
        // }
        // return sum;

    }

    public static int primaryDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 4, 7 }, { 6, 8, 9 } };
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        System.out.println(findSum(a)+" sum");
        System.out.println(primaryDiagonal(a) + " primary Diagonal");
        System.out.println(secondaryDiagonal(a) + " secondary Diagonal");
    }
}
