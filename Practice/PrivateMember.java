package com.Practice;


class Member{
	private void name() {
		System.out.println("hello");
	}
	public void name1() {
		name();
	}
}

public class PrivateMember {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name1();
	}

}
