
import java.util.Arrays;
public class ArrayMerge {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int len = a.length + b.length;
        int n = 0;
        int[] c = new int[len];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[n++];
        }
        int k = 0;
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[k++];
        }   
            System.out.println(Arrays.toString(c));      
    }

    // public static void main(String[] args) {
    // int[] a = {1,2,3};
    // int[] b = {4,5,6};
    // int len = a.length + b.length;
    // int[] c = new int[len];
    // for (int i = 0; i < a.length; i++) {
    // c[i] = a[i];
    // }
    // for (int i = 0; i < b.length; i++) {
    // c[i+a.length] = b[i];
    // }
    // System.out.println(Arrays.toString(c));
    // }

    // public static void main(String[] args) {
    // int[] a = {1,2,3};
    // int[] b = {4,5,6};
    // int len = a.length + b.length;
    // int[] c = new int[len];
    // for (int i = 0; i < c.length; i++) {
    //     if(i<a.length){
    //        c[i] = a[i]; 
    //     }else{
    //         c[i] = b[i-a.length];
    //     }   
    // }
    // System.out.println(Arrays.toString(c));
    // }
}
