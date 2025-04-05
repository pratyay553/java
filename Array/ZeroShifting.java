import java.util.Scanner;

public class ZeroShifting {

    public static void shiftZero(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                cnt++;
                inner1: for (int j = i + 1; j < a.length; j++) {
                    if (a[j] != 0 ) {
                        a[i] = a[j];
                        
                        break inner1;
                    }
                }
            }
        }
        for (int i = a.length - 1; i > (a.length - cnt - 1); i--) {
            a[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        ZeroShifting.shiftZero(a);
    }
}
