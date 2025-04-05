package com.colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrtoLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] integers = {1,2,34,5,6,6,7};
		//List<Integer> aList = Arrays.asList(integers);
		ArrayList aList = new ArrayList();
		aList.add("LOL");
		aList.add("Bhosdwala");
		aList.add("Vinod");
		aList.add("Loafer");
		
		LinkedList linkedList = new LinkedList(aList);
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		int a = 4;
		Integer integer = a;
		int a1 = integer;
		
		
	}

}
