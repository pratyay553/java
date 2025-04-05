import java.util.Scanner;

public class MostOccurance {
    public static int countOne(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            
           if(a[i] == 1){
            int count1 = 1;
         inner1:   for (int j = i+1; j < a.length; j++) {
                if (a[j] != 1) {
                    i=j;
                    break inner1;
                }
                count1++;
            }
            if (count<count1) {
                count = count1;
            }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to add in the array : ");
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.println("Enter values of the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int k = countOne(a);
        System.out.println(k);
        sc.close();
    }
}
