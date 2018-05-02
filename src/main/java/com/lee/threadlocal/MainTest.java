package com.lee.threadlocal;

public class MainTest {
	public static ThreadLocal<String> local=new ThreadLocal<>();
	public static void main(String[] args) {
		MyThread t1=new MyThread(local, "2323");
		t1.setName("t1");
		MyThread t2=new MyThread(local, "232334234");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	
	
	

}




