
import java.util.Arrays;

class Demo{
    double radius;
    Demo(double radius){
        this.radius = radius;
    }
}

public class StringMethods {
   
    public static void main(String[] args) {
        String s = new String();
        // s = "pratyay";
        // System.out.println(s.charAt(0));//p
        // System.out.println(s.toUpperCase());// PRATYAY
        // System.out.println(s.toLowerCase());//pratyay


        // char[] a = s.toCharArray();
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+" ");//p r a t y a y
        // }

       // System.out.println(a.toString());// [C@372f7a8d

        // Demo d = new Demo(5.4);
        // System.out.println(d.toString());//Demo@2f92e0f4

        int[] a = {1,2,3};
        System.out.println(Arrays.toString(a));
        String k = "pratyay";
        char[] c = k.toCharArray();
        System.out.println(Arrays.toString(c));//[p, r, t, y, a, y]
        for (char d : c) {
            //System.out.print(d);// pratyay
            
        }
    }
}
