import java.util.Arrays;

public class ArrayCheck {
    //-----even and odd element of an array-------------------------

    // public static void main(String[] args) {
    //     int[] a = {3,6,1,7,8,9};
    //     for (int i = 0; i < a.length; i++) {
    //         if (a[i]%2 == 0) {
    //             System.out.println(a[i]+" It is a even number ");
    //         }else
    //         {
    //             System.out.println(a[i] + " Is a odd number");
    //         }
    //     }
    // }

    //----------sum of all elements of an array-------------------------
    public static void main(String[] args) {
        int[] a = {2,7,4,8,4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("Sum of all value in an array is : "+sum);
    }


}
