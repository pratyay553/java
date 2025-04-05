
import java.util.Arrays;

public class CharFrequency {
    
    // public static void countChar(String s) {
    //     int cnt = 1;
    //     for (int i = 0; i < s.length()-1; i++) {
    //         for (int j = i+1; j < s.length(); j++) {
    //            if (s.charAt(i)==s.charAt(j)) {
    //             cnt++;
    //         } 
    //         }
    //         System.out.println(s.charAt(i)+" "+cnt);
    //     }
    // }

    public static void frequency(String s){
        int[] a = new int[25];
        for (int i : s.toCharArray()) {
        
            int index = i-'a';
            a[index]++;
        
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                char c = (char) (i+'a');
            System.out.println("frequency of the character "+c+" is "+ a[i]+"times");
            }
         
        } 
        
        }
    
    // public static void countChar(String s) {
    //     int[] a = new int[25];

    //     for (int c : s.toCharArray()) {
    //         int index = c - 'a';
    //         a[index]++;
    //     }

    //     for (int j =0;j<a.length;j++) {
    //         if(a[j]!=0){
    //             char c = (char)(j+'a');
    //             System.out.println(c + " is occured " + a[j] +" times");
    //         }

    //     }

    // }

    public static void main(String[] args) {
        String s = "pratyay";
    //    frequency(s);
    int[] a = {1,2,3,4,5};
    char[] c = s.toCharArray();
    String s1="";
    System.out.println(Arrays.toString(c));
    for (int i = c.length-1; i >= 0; i--) {
        s1 = s1+c[i];
    }
    System.out.println(s1);
    }
}
