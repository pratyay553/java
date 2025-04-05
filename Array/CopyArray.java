import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = { 3, 4, 7, 9, 1 };
        // int[] b = a; //b take the refference
        // System.out.println(Arrays.toString(b));
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}