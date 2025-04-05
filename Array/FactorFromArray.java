import java.util.Scanner;

public class FactorFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            if(k%a[i] == 0){
                System.out.println(a[i]+" is the factor of "+k);
            }
        }
    }
}
