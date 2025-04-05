
import java.util.Arrays;
import java.util.Scanner;

public class DesktopPageShifting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] k = {1,2,3,4,5,6};
        for (int i = 0; i < k.length; i++) {
            if (k[i]==n) {
                int temp = k[i];
                for (int j = i; j > 0; j--) {
                    k[j]=k[j-1];
                    
                }
                k[0] = temp;
            }
        }

        System.out.println(Arrays.toString(k));
        
    }
}
