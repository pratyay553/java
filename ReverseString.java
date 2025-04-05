public class ReverseString {
    public static void rev(String s) {
       String rev = "";
       for(int i=s.length()-1;i>=0;i--){
        rev = rev + s.charAt(i);
       }
       System.out.println(rev);
    }

    public static void rev1(String s) {
       
    }

    public static void main(String[] args) {
        String s = "pratyay";
        rev(s);
    }
}
