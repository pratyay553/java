package com.colection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCheck {

	public static void main(String[] args) {
		TreeSet<CarObject> ts = new TreeSet<CarObject>(Comparator.reverseOrder());
		
		ts.add(new CarObject(2020,"black" , 599922, "toyota"));
		ts.add(new CarObject(2029,"black" , 523922, "toyoa"));
		ts.add(new CarObject(2023,"red" , 59782, "toyota"));
		ts.add(new CarObject(2024,"black" , 239992, "toota"));
		ts.add(new CarObject(2019,"black" , 599982, "toyota"));
		ts.add(new CarObject(2021,"black" , 599922, "toyota"));
		
		for(CarObject o : ts) {
			System.out.println(o);	
		}
	}

}
