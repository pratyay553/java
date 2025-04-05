public class Check {
    public static void m(){
        System.out.println(1);
        m();

    }
    public static void main(String[] args) {
        try{
            System.out.println(50/0);
        } catch(Exception e){
            System.out.println("done");
        }
        finally{
            // System.out.println("Exception resolved");
            m();
        }
    }
}
