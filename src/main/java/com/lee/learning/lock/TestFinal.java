package com.lee.learning.lock;

public class TestFinal {
	
	public static void main(String[] args) {
		final int a=5;
		//a++;
		final User u=new User();
		System.out.println(u.getId());
		u.setId(6);
		System.out.println(u.getId());
		//u=new User();
	}
	
//	public int add(final int a){
//		return a++;
//	}

}
