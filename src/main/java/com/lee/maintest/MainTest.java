package com.lee.maintest;

public class MainTest {
	public static void main(String[] args) {
//		MainTest maintest=new MainTest();
//		String test="12345";
//		System.out.println(maintest.deal(test));
//		System.out.println(maintest.deal(test));
		MainTest test=new MainTest();
		SysDemo SysDemo=new SysDemo();
		SysDemo.test(1, SysDemo);
		SysDemo.test(1, test);
		SysDemo.test2(1, SysDemo);
		SysDemo.test2(1, SysDemo);
		SysDemo.test3(1, SysDemo);
		SysDemo.test3(1, SysDemo);
	}
}
