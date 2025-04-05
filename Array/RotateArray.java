
import java.util.Arrays;

public class RotateArray {
    public static void rotateLeft1(int[] k) {
        int temp = k[0];
        for (int i = 1; i < k.length-1; i++) {
        k[i-1] = k[i+1];
        }
        k[k.length-1] = temp;
    }
    
    public static void rotateLeft(int[] k) {
         int temp = k[0];
        for (int i = 1; i < k.length; i++) {
            k[i-1] = k[i];
            k[i] = temp; 
        }
    }
    
    public static void rotateRight1(int[] k){
        int temp = k[k.length-1];
        for (int i = k.length-1; i > 0; i--) {
            k[i] = k[i-1];
        }
        k[0] = temp;
    }
    
    public static void rotateRight(int[] k){
        int len = k.length;
        int temp = k[len-1];
        for (int i = len-2; i >= 0; i--) {
            k[i+1] = k[i];
            k[i] = temp; 
        }

    }
    
    public static void main(String[] args) {
        int[] k = {1,2,3,4,5};
        System.out.println("Main array "+Arrays.toString(k));
       rotateRight(k);
        System.out.println("rotate right "+Arrays.toString(k));
        rotateLeft(k);
        System.out.println("rotate left "+Arrays.toString(k));

    }
}
