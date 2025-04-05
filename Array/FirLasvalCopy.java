
import java.util.Arrays;
import java.util.Scanner;

public class FirLasvalCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[2];
        int n = 0;
        for (int i = 0; i <= a.length-1; i++) {
            if (i==0 || i==a.length-1) {
                b[n++] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
