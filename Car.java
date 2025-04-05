package mjava;

class InnerCar {
    String reg_no;
    String model;
    String manufacturer;
    double price;
    String fuel_type;
    double mileage;

    public InnerCar(String reg_no,String model,String manufacturer,double price,String fuel_type,double mileage){
        this.reg_no = reg_no;
        this.price = price;
        this.model = model;
        this.mileage = mileage;
        this.manufacturer = manufacturer;
        this.fuel_type = fuel_type;

    }
    public void carmethod(){
        System.out.println(this.reg_no);
        System.out.println(this.price);
        System.out.println(this.model);
        System.out.println(this.mileage);
        System.out.println(this.manufacturer);
        System.out.println(this.fuel_type);
        System.out.println("------------------------------");
    }

}
public class Car {

    public static void main(String[] args) {
        InnerCar i1 = new InnerCar("283992982891", "xuv-5x0", "Mahindra", 230000, "Diesel",18 );
        i1.carmethod();
        InnerCar i2 = new InnerCar("283992982891", "xuv-3x0", "Mahindra", 190000, "petrol", 19.3);
        i2.carmethod();
    }
    
}