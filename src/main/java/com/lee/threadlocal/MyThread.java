package com.lee.threadlocal;

public class MyThread extends Thread{
	private ThreadLocal<String> threadLocal;
	private String data;
	
	public MyThread(ThreadLocal threadLocal,String data){
		this.threadLocal=threadLocal;
		this.data=data;
	}
	

	@Override
	public void run() {
		super.run();
		//add 
		threadLocal.set(data);
		System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());
		
	}
	
	

}
