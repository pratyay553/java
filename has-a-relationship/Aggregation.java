//Aggregation

class Bus{
    Passenger p;
    public void addPassenger(Passenger p){
        this.p=p;
        System.out.println("passenger added successfully : ");
    }
}
class Passenger{
    String name;
    int age;
    Passenger(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void details(){
        System.out.println("name is: "+name);
        System.out.println("Age is : "+age);
    }

}
public class Aggregation {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.addPassenger(new Passenger("pratyay",24));
        
    }
}
