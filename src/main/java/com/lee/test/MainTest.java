package com.lee.test;

public class MainTest {

	public static void main(String[] args) {
		final int x=64;
		System.out.println(fun(64));
	}
	public static long fun(int x) {
		if(x==1) {
			return 1;
		}else {
			return 2*fun(x-1);
		}
	}
}



