package com.collection.dsa;

import java.util.ArrayList;
import java.util.List;

public class PalindromeCheckAL 
{
	public static boolean palindrome(ArrayList<Integer> a) {
		int l = 0;
		int e = a.size()-1;
		while (l<e) {
			if (!a.get(l).equals(a.get(e))) {
				return false;
			}
			l++;
			e--;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(67);
		a.add(67);
		a.add(34);
		System.out.println(a.size());
		if (palindrome(a)) {
			System.out.println("palindrome");
		}
	}

}
