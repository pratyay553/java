package com.Practice;

class ClassCastExc{
	int s = 30;
}
class Cast extends ClassCastExc{
	int k = 2;
}


public class ExceptionHandeling {

	public static void main(String[] args) {
		
		//----------Arithmatic exception-------\
		
		try {
			System.out.println(20/0);//Arithmatic Exception
			System.out.println("hello");// nothing will be printed 
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			System.out.println("handled successfully");
		}
		
		//-------ClassCastException
		try {
			Cast castExc = (Cast) new ClassCastExc();
			
		} catch (ClassCastException e) {
			System.out.println(" classcastexception");
		}
		System.out.println("hjj");
		
		String a = "jlk";
		a=null;
		System.out.println(a.length());

	}

}
