package com.lee.learning.callback;

public class A {
	/**
	 * A 让b处理事情
	 * @param b
	 * @param thing
	 */
	
	
	public void doSomething(B b,String thing){
		System.out.println(b.getName()+"正在.."+thing);
	}
	
	
	public void callMe(String thing){
		System.out.println("已经ok!");
	}

}
