package com.Practice;

public class PrintOToTen {
	public static int print(int i) {
		System.out.println(i);
		if (i==1) 
			return 1;
		
		return print(--i);
		
	}
	public static void main(String[] args) {
		print(10);
	}

}
