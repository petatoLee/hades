package com.lee.threadsafe;

public class ThreadUnSafe {
	private int a;

	public ThreadUnSafe(int a) {
		this.a = a;
	}
	
	public void check(){
		if(a!=a) {
			System.out.println("not same");
			throw new AssertionError("This statment is false.");
		}else {
			System.out.println("same");
		}
	}
	
	public static void main(String[] args) {
		ThreadUnSafe se=new ThreadUnSafe(45);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					se.check();
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		}).start();
	}
	

}
