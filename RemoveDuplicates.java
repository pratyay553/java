public class RemoveDuplicates {

    public static String rmvDup(String s) {
         s = s.toLowerCase();
         boolean flag = true;
        String s1="";
        for (int i = 0; i < s.length(); i++) {
          inner:  for (int j = 0; j < s1.length(); j++) {
                if(s.charAt(i) != s1.charAt(j)){
                    flag = true;
                }else {
                    flag = false;
                    break inner;
                }
            }
            if(flag){
                s1+=s.charAt(i);
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "pratyay";
        System.out.println(rmvDup("jhgfdhjk"));
    }
}
