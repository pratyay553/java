
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Start");
        System.out.println("Enter the number 1 : ");
        try{
            int num1 = s.nextInt();
            System.out.println("enter the number 2: ");
                int num2 = s.nextInt();
                try {
                    System.out.println(num1/num2);
                } catch (ArithmeticException e) {
                    System.out.println("arithmatic exception");
                }
        }catch(InputMismatchException e){
            System.out.println("wrong value");
        }
    }
}
