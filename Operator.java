package mjava;

public class Operator {
    public static void main(String[] args) {
        //range of datatype
        System.out.print(Byte.MIN_VALUE+" - ");
        System.out.println(Byte.MAX_VALUE);

        System.out.print(Short.MIN_VALUE + " - ");
        System.out.println(Short.MAX_VALUE);
        System.out.print(Integer.MIN_VALUE + " - ");
        System.out.println(Integer.MAX_VALUE);

//arithmatic operator

int n = 24;
int m = 12;
System.out.println(m + n);//36
System.out.println(m - n);//-12
System.out.println(m * n);//288
System.out.println(m / n);//0
System.out.println(m % n);//12



//Relational operator
        int a =3 ;
        int b = 4;
        System.out.println(a<b);//true
        System.out.println(a <= b);//true

        System.out.println(a >= b);//false
        System.out.println(a > b);//false

        System.out.println(a != b);//true
        System.out.println(a==b);//false
//Assignment operator

        int x = 10;
        System.out.println(x += 2);//12
        System.out.println(x -= 2); //10
        System.out.println(x *= 2);//20
        System.out.println(x /= 10);//2
        System.out.println(x %= 1);//0

    }
}
