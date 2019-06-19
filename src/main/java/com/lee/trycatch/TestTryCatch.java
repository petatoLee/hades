package com.lee.trycatch;

public class TestTryCatch {
	public int test1(int a,int b) {
		return a+b;
	}
	
	public int test2(int a,int b) {
		try {
			return a+b;
		} catch (Exception e) {
			return 0;
		}finally {
			System.out.println();
		}
		
	}
	
	public void test3() {
		System.out.println("");
	}

}
