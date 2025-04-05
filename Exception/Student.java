import  java.util.*;

class InnerStudent {
String name;
String gender;
double marks;

InnerStudent(String name,String gender,double marks){
    name = this.name;
    gender = this.gender;
    marks = this.marks;
}
public String getName() {
    return this.name;
}
@Override
public String toString() {
    return "name:"+this.name+"\n gender: "+this.gender+"\n marks : "+this.marks;
}

}
public class Student {
    
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    try {
        System.out.println("Enter your name : ");
        String name = s.next();
        System.out.println("Enter Zender: ");
        String gender = s.nextLine();
        System.out.println("Enter marks : ");
        double mark = s.nextInt();
       InnerStudent i = new InnerStudent(name,gender,mark);
        try {
        System.out.println("Enter the index:");
        int n = s.nextInt();
        
        System.out.println(i.getName().charAt(n));
    } catch (Exception e) {
        System.out.println("Exception handeled");
    }
    }catch(InputMismatchException e){
            System.out.println("InputMismatchException");    
    }
    
   

   } 
}
