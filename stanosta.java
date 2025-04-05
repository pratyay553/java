package mjava;

public class stanosta {
    static int a=5;//class member
    int b = 8;
    public static void main(String[] args) {
        stanosta s1 = new stanosta();
        
        s1.b = 65;//object member
       
       
        stanosta s2 = new stanosta();
        s2.b = 54;
        // System.out.println(s2.b); //-----------multiple copy
        //  System.out.println(s1.b);
        s1.a = 43;
        
        // a = 12;
        // System.out.println(a);//---------------single copy
        // System.out.println(a);
    }
}
