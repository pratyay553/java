import java.util.Arrays;
import java.util.Scanner;

public class SortAsc {

public static int[] sortArray(int[] a){
   
    // for (int i = 0; i < a.length-1; i++) {
    //    for (int j = i+1; j < a.length; j++) {
    //         if (a[i]>a[j]) {
    //             int flag = a[j];
    //             a[j] = a[i];
    //             a[i]=flag;
    //         }
    //    }
    // }

    //----------------------selection sort----------------------

    for (int i = 0; i < a.length - 1; i++) {
        int minindex = i;
        for (int j = i + 1; j < a.length; j++) {
            if (a[minindex] > a[j]) {
                minindex = j;
            }
        }
        a[i] = (a[i]+a[minindex])-(a[minindex] = a[i]);
    }
    return a;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
            System.out.println(Arrays.toString(sortArray(a)));
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
    }
}
