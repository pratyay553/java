public class CountVCSC {
    public static void countVowelConsonentSpecialchar(String s) {
        int v = 0;
        int c = 0;
        int sc = 0;
        
        for (int i = 0; i < 10; i++) {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                v++;
            else if(ch>='a' && ch<='z')
            c++;
            else 
            sc++;
        }

        System.out.println(c + "  " + v + " "+sc+" ");

    }
    public static void main(String[] args) {
    String s = "pratyay@*hg";
    countVowelConsonentSpecialchar(s.toLowerCase());
    }
}
