public class Palindrome {

    public static String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "wow";
        if(rev(s).equals(s)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
