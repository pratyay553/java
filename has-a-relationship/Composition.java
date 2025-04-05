
//Composition
class Car{
Engine e = new Engine();
}
class Engine{
    int price;
    String brand;
    public void m1(int price,String brand){
        System.out.println("price  "+price+" brand : "+brand);
        this.price=price;
        this.brand=brand;
    }
}


public class Composition{
    public static void main(String[] args) {
        Car c = new Car();
        c.e.m1(300, "kia");
        System.out.println(c.e.brand);
        System.out.println(c.e.price);
    }

}