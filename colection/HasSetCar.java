package com.colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HasSetCar {

	public static void main(String[] args) {
		HashSet<CarObject> hs = new HashSet<CarObject>();
		hs.add(new CarObject(2021,"black" , 599922, "toyota"));
		hs.add(new CarObject(43, "mat black", 100000, "huyndai"));
		hs.add(new CarObject(2022,"black" , 599922, "toyota"));
		hs.add(new CarObject(43, "mat black", 20000, "huyndai"));
		hs.add(new CarObject(2021,"black" , 594322, "toyota"));
		hs.add(new CarObject(43, "mat black", 200000, "huyndai"));
		
		
		for (Object o : hs) {
			System.out.println(o);
		}
		//sort in ascending order
//		LinkedList<CarObject> l = new LinkedList<CarObject>(hs);
		List<CarObject> l = new LinkedList<CarObject>(hs);
		Collections.sort(l,new SortBasedOnprice());
		System.out.println("After sort the Hasset: ");
		for (CarObject o : l) {
			System.out.println(o);
		}
	}

}
