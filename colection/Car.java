package com.colection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

class CarObject implements Comparable<CarObject>
{
	private int model;
	private String colorString;
    private double price;
    private String brandString;
    public int getModel() {
		return model;
	}

	public String getColorString() {
		return colorString;
	}

	public double getPrice() {
		return price;
	}

	public String getBrandString() 
	{
		return brandString;
	}

    
    CarObject(int model,String colorString, double price, String brandString) {
		this.brandString  = brandString;
		this.colorString = colorString;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarObject [model=" + model + ", colorString=" + colorString + ", price=" + price + ", brandString="
				+ brandString + "]";
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(brandString, colorString, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		
		CarObject other = (CarObject) obj;
		return Objects.equals(brandString, other.brandString) && Objects.equals(colorString, other.colorString)
				&& model == other.model && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public int compareTo(CarObject o) {
		return (int) (this.getPrice() - o.getPrice());
	}	
}
class SortBasedOnprice implements Comparator<CarObject>{
	@Override
	public int compare(CarObject o1,CarObject o2) {
		return (int)(o1.getModel()-o2.getModel());
	}
}
public class Car {
	
	
public static void main(String[] args) {
	ArrayList<CarObject> arrayList = new ArrayList<CarObject>();
	arrayList.add(new CarObject(2021,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2021,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2025,"black" , 239922, "toota"));
	arrayList.add(new CarObject(2024,"red" , 59782, "toyota"));
	arrayList.add(new CarObject(2022,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2020,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2029,"black" , 523922, "toyoa"));
	arrayList.add(new CarObject(20223,"red" , 59782, "toyota"));
	arrayList.add(new CarObject(2021,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2021,"black" , 239922, "toota"));
	arrayList.add(new CarObject(2021,"red" , 59782, "toyota"));
	arrayList.add(new CarObject(2021,"black" , 599922, "toyota"));
	arrayList.add(new CarObject(2021,"black" , 599922, "toyota"));
	
	
	
}
}
//2.
//wap to store car objects in arraylist and perform the below operations
//print the car details who's model in between 2020 to 2024
//print the car details who's color is black
//print the car details who's price in between 5 to 10 lakhs
//ptcd who's brand is Toyota 
//make the car class as encapsulated class


