package com.lee.thread;

public class StartMoreThread implements Runnable{
	public static void main(String[] args) {
		System.out.println("Main->"+Thread.currentThread().getThreadGroup());
		
		StartMoreThread test=new StartMoreThread();
		Thread thread=new Thread(test);
		thread.start();
		thread.start();
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Inner->"+Thread.currentThread().getThreadGroup());
			System.out.println(Thread.currentThread().getName()+"->运行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
