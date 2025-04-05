public class StringLength
{ 
    public static int findLength(String s){
        int cnt = 0;
        for (int i = 0;  ; i++) {
            try {
                s.charAt(i);
                cnt++;
            } catch (Exception e) {
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s = "pratyay";
        System.out.println(findLength(s));
        
        // int cnt = 0;
        // for (int i : s.toCharArray()) {
        //    cnt++;
        // }
        // System.out.println(cnt);
    }
}