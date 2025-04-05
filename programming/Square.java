

import java.util.Scanner;

public class Square {
    public static boolean  checkSquare(int n,int s){
            if (s<n/2) {
               return false; 
            }
            boolean flag = false;
            if(n/s == s){
               flag = true;  
            }
            
           checkSquare(n, s+1);
           return flag;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int s = 1;
            if(Square.checkSquare(n,s) == true){
                System.out.println("perfect square");
            }else{
                System.out.println("not a perfect square ");
            }
    }
}
