
import java.util.Arrays;


public class ArrayWithoutDuplicate {

    public static void removeDuplicates(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[j] != -1 && a[i] != -1) {
                    a[j] = -1;
                    cnt++;
                }
            }
        }
        int j =0;
        int[] k = new int[a.length - cnt];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                k[j++] = a[i];
            }
        }
        System.out.println(Arrays.toString(k));
    }

    public static void main(String[] args) {
        int[] a = { 6,7,2,6,7,2 };
        removeDuplicates(a);
    }
}
