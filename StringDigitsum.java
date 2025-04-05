public class StringDigitsum {

// public static int countDigit(String s)
// {
//     String s1 = "";
//     int sum=0;
//     for (int i = 0; i < s.length(); i++) {
//         if(s.charAt(i)>=0 && s.charAt(i)<=9 && i!=s.length()-1){
//             s1+=s.charAt(i);
//         }else if(s.charAt(i)>=0 && s.charAt(i)<=9 && i==s.length()-1){
//             s1 += s.charAt(i);
//             if (s1.length()>0) {
//                 int prod = 1;
//                 for (int j = s1.length()-1; j >= 0 ; j--) {
                    
//                     sum = ((int)s1.charAt(j)-48)*prod + sum;
//                     prod*=10;
//                 }
//                 s1 = "";
//             }
//         }
//     }
//     return sum;
// }

public static void digitSum(String s){
    int sum =0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n= (int) c;
            if (s.charAt(i)>48 && s.charAt(i)<=57) {
               sum=sum + (n-48); 
            }
            
        }
    System.out.println(sum);
}



    public static void main(String[] args) {
        String s = "g2v3b5";
        // int n = countDigit(s);
        // System.out.println(n);
        digitSum(s);
    }
}