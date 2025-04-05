package com.Practice;

import java.util.Objects;

//Method overloading ----> method formal arguements length should be different
//							if length is same then datatype should be changed



class A{
	
	public void name(int a) {
		System.out.println(a);
	}
	public void name(int b,int c) {
		System.out.println(b+c);
	}
}

class B extends A{
	int b1;
	int a ;
	String name;
	@Override
	public void name(int a) {
		System.out.println(a*10);
	}
	public B(int a,int b,String name ) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b1 = b;
		this.name = name;
	}
	@Override
	public int hashCode() 
	{
		return name.hashCode()+a+b1;
		}
	@Override
	public boolean equals(Object obj) {
	B b = (B) obj;
	return this.b1==b.b1;
//	return this.name.hashCode()==b.name.hashCode();
//	return this.a.equals(b.a);
	}
	
}
public class ManyForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		a.name(1);
		
//		B b = new B(3,4,"chudirBhai");
		B b = new B(6,3,"laura");
		b.name(1);
		
		A a1 = new B(6,3,"laura");// can access both A and B
		B b1 = (B) a1;
		b.name(1, 2);
		a1.name(7);
		
		System.out.println(b.equals(b1));
		System.out.println(b.hashCode()==a1.hashCode());
	}

}

