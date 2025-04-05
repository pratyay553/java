public class ValidPassword {

    public static boolean  checkPassword(String s){
        int n = 0;
        int u = 0;
        int l = 0;
        int sc = 0;
        
        
            for (char c : s.toCharArray()) {
                if (c>='0' && c<='9') {
                  n++;  
                }else if(c>='a' && c<='z'){
                    l++;
                } else if (c >= 'A' && c <= 'Z') {
                    u++;
                }else {
                    sc++;
                }
            }

            if (s.length()>=8 && sc>=1 && l>=2 && u>=2 && n>=1) {
                return true;
            }
            else
            return  false;
        
    } 

    public static void main(String[] args) {
        String s = "Pratyay22@gmail.com";
        if(ValidPassword.checkPassword(s) == true){
            System.out.println("password is valid ");
        }else 
        {
            System.out.println("Invalid password");
        }
    }
}
