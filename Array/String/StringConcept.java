public class StringConcept {
    public static int findLength(String s){
        return s.length();
    }
    public static void main(String[] args) {
        String s = new String("pratyay");
        int length = s.length();
        System.out.println(length);
        System.out.println(findLength(s));
    }
}
