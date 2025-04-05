package com.Practice;

class Car{
	String model;
	String brand;
	public void name() {
		System.out.println("banra");
	}
	public Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
}
class Toyota extends Car{
	String model;
	int speed;
	public void name1() {
		System.out.println("laura");
	}
	public Toyota(String model, String brand, String model2, int speed) {
		super(model, brand);
		model = model2;
		this.speed = speed;
	}
	public Toyota(String model, String brand) {
		super(model, brand);
	}
	
	
}
public class TypeCasting {

	public static void main(String[] args) {
	Toyota toyota = new Toyota("chudirbhai","tom");
	toyota.name();
	Car car = toyota;
	car.name();
	Toyota toyota2 = (Toyota)car;
	toyota2.name1();
	}

}
