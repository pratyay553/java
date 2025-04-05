
import java.util.Arrays;


public class Test {
    public static int[] kth(int k,int[] a) {
         int[] m = new int[k];
         int v = a.length-1;
       for (int i = 0; i < k; i++) {
        m[i]=a[v--];
       }
       return m;
    }
    
    public static void main(String[] r){
       int[] a = {12,56,876,90, 4};
       Arrays.sort(a);
       
       System.out.println(Arrays.toString(a));
        int k=2;
        a = kth(k, a);
        System.out.println(Arrays.toString(a));
       
    }
}
