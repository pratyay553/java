package com.colection;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	/*Generics written inside<>*/
	
	 //sum of integer elements in arraylist//
//	public static Integer sum(ArrayList<Integer> li) {
//		int sum = 0;
//        //Iterator<Integer> iterator = li.iterator();
//		for(int i=0;i<li.size();i++) {
//			sum = sum + li.get(i);
//		}
//		return sum;
//	}
	
	
	
//	public static Integer sum1(ArrayList<Integer> li) {
//		int sum = 0;
//        Iterator<Integer> iterator = li.iterator();
//		while(iterator.hasNext()) {
//			sum = sum + iterator.next();
//		}
//		return sum;
//	}
//	
	
	//sum of only integer value from heterogeneous arraylist//
	public static Integer sum2(ArrayList li) {
		int sum = 0;
        Iterator iterator = li.iterator();
        
		while(iterator.hasNext()) {
			Object object = iterator.next();			
				if (object instanceof Integer) {
					sum = sum + (Integer)object;
				}
		}
		return sum;
	}
	
	//wapto store different object in arraylist and perform the following operations  
	//1. print only integer objects
	//2. print only character object
	//3. print only String object
	//2. print only float object
	
	public static void inte(ArrayList li) {
		Iterator iterator = li.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();			
			if (object instanceof Integer) {
				System.out.print(object+" ,");
			}
			
		}
	}
	public static void floate(ArrayList li) {
		Iterator iterator = li.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();			
			if (object instanceof Float) {
				System.out.print(object+" ,");
			}
			
		}
	}
	public static void chare(ArrayList li) {
		Iterator iterator = li.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();			
			if (object instanceof Character) {
				System.out.print(object+" ,");
			}
			
		}
	}
	public static void stringe(ArrayList li) {
		Iterator iterator = li.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();			
			if (object instanceof String) {
				System.out.print(object+" ,");
			}
			
		}
	}
	
	//1. wap to 
	//print only integer from a to f
	//print only integer from 50 to 100
	//print only String object starts from s
	//print only String object endss from a
	
	//2.
	//wap to store car objects in arraylist and perform the below operations
	//print the car details who's model in between 2020 to 2024
	//print the car details who's color is black
	//print the car details who's price in between 5 to 10 lakhs
	//ptcd who's brand is Toyota 
	//make the car class as encapsulated class
	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
		
//		System.out.println(arrayList);
//		System.out.println("+++++++++++++++  only using for loop   ++++++++++++");
//		System.out.println(sum(arrayList));
//		System.out.println("+++++++++++++++  only using iterator   ++++++++++++");
//		System.out.println(sum1(arrayList));
		
//		
		ArrayList arrayList = new ArrayList();
		arrayList.add("p");
		arrayList.add(2);
		arrayList.add(1.2f);
		arrayList.add('w');
		arrayList.add(6);
		arrayList.add("paoso");
		arrayList.add(5.3f);
//		System.out.println("calculate sum from a heterogeneous arraylist");
//		System.out.println(sum2(arrayList));
		System.out.print("integer : " );
		inte(arrayList);
		System.out.print("float : ");
		floate(arrayList);
		System.out.print("String : ");
		stringe(arrayList);
		System.out.print("character : ");
		chare(arrayList);
	}

}
