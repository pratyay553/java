package com.colection;

import java.util.Iterator;
import java.util.TreeSet;

class Bike implements Comparable
{
	private String brandString;
	private int price;
	public String getBrandString() {
		return brandString;
	}
	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * @param brandString
	 * @param price
	 */
	public Bike(String brandString, int price) {
		
		this.brandString = brandString;
		this.price = price;
	}
	
	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		Bike bike = (Bike)o;
		return this.getPrice()-bike.getPrice();
	}
	@Override
	public String toString() {
		return "Bike [brandString=" + brandString + ", price=" + price + "]";
	}
	
	
}

public class ImplementTreeSet {

	public static void main(String[] args) {
		TreeSet<Bike> treeSet = new TreeSet<Bike>();
		treeSet.add(new Bike("Kia", 10));
		treeSet.add(new Bike("Kia", 50));
		treeSet.add(new Bike("Kia", 20));
		treeSet.add(new Bike("Kia", 30));
		
		for (Bike b : treeSet) {
			System.out.println(b);
		}
	
		
//		treeSet.add(1);
//		treeSet.add(5);
//		treeSet.add(65);
//		treeSet.add(5);
//		treeSet.add(0);
//		treeSet.add(0);
		
		//treeSet.add("String");//class cast exception
		//treeSet.add(null);//null pointer exception 
		
//		System.out.println(treeSet);
	}

}
