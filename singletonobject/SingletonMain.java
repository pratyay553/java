package com.singletonobject;

class Singleton2{
	public static int a = 9;
	public final static Singleton2 singleton2 = new Singleton2();;
	private Singleton2() {
		
	}
//	public static Singleton2 helper()
//	{
//		if (singleton2 == null)
//		{
//			singleton2 = new Singleton2();
//		}
//		return singleton2;
//	}
	public static void m1() {
		System.out.println("name called");
	}
}


public class SingletonMain {

	public static void main(String[] args) {
//		Singleton2 singleton2 = Singleton2.helper();
		Singleton2 s = Singleton2.singleton2;
//		System.out.println(singleton2.a);
		System.out.println(s.a);
	}

}
