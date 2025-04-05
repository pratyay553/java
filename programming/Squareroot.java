package mjava.programming;

import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = 0;
        int sum = 0;
        while (n!=1 && n!=4) {
             while (n>=1) {
            temp = n%10;
            sum = sum + (temp*temp);
            n=n/10;
            }
            n=sum;
        }
       
    }
}
