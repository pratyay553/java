public class CountWord {

    public static void word(String s){
        int count = 0;
       
        for (int i = 0; i < s.length()-1; i++) 
        {
            if (s.charAt(i) != ' ' && s.charAt(i+1)==' ') 
            {
                count++;
            }
            if (i==s.length()-1 && s.charAt(i)!= ' ') {
                count++;
            }
         }
        System.out.println(count);
    }



    public static void main(String[] args) {
        String s = "  bnbjsj jjdok jjk jjdj hij uuhj mnjhg vuhuhj ";
        word(s+" ");
    }
}
