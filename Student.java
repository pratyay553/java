package mjava;

public class Student {
    String name,gender,phone_no;
    int id,age;
    public void details(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone_no);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "pratyay";
        s1.id = 1;
        s1.age = 24;
        s1.gender = "male";
        s1.phone_no = "123456767890";
        s1.details();
    }
}
