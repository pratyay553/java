package com.colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SortInteger 
{
	public static List<Integer> sort(List<Integer> li)
	{
		for (int i = 0; i < li.size()-1; i++) 
		{
			for (int j = 1; j < li.size(); j++) 
			{
				if(li.get(i)>li.get(j)) {
					li.set(i, li.set(j, li.get(i)));
				}
				
			}
		}
		return li;
	}
public static void main(String[] args) {
//	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	Integer[] numIntegers = {22,34,1,64,5,76,4};
	List<Integer> li = Arrays.asList(numIntegers);	
	List<Integer> aList = SortInteger.sort(li);
	System.out.println(aList);
}
}
//wap to store only integer values in arraylist and sort in ascendiing order