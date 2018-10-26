package com.lee.threadlocal;

public class MainTest {
	public static ThreadLocal<String> threadLocal1 = new ThreadLocal<String>();

	public static ThreadLocal<Object> threadLocal2 = new ThreadLocal<Object>();

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				String data=threadLocal1.get();
				if(null==data||data.length()==0) {
					threadLocal1.set(Thread.currentThread().getName()+"data1");
				}
				System.out.println(this);
				Object data2=threadLocal2.get();
				if(null==data2) {
					threadLocal2.set(Thread.currentThread().getName()+"data2");
				}
				System.out.println("T1 "+threadLocal1.get());
				System.out.println("T1 "+threadLocal2.get());
				
				
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				String data=threadLocal1.get();
				if(null==data||data.length()==0) {
					threadLocal1.set(Thread.currentThread().getName()+"data3");
				}
				
				Object data2=threadLocal2.get();
				if(null==data2) {
					threadLocal2.set(Thread.currentThread().getName()+"data4");
				}
				System.out.println("T2 "+threadLocal1.get());
				System.out.println("T2 "+threadLocal2.get());
				System.out.println(this);
			}
		}).start();
	}
	
	
}
