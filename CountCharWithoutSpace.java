public  class CountCharWithoutSpace {
    public static void main(String s) {
        int k =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                k++;
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
       main("hi jk hi"); 
    }
}