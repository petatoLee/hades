package com.lee.thread;
/**
 * @author zt
 * 测试线程等待
 *
 */
public class MainTest {
	public static void main(String[] args) {
		System.out.println("当前线程组->"+Thread.currentThread().getThreadGroup().getName());
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"正在执行"+Thread.currentThread().getThreadGroup().getName());
			}
		});
		thread.start();
		//thread.dumpStack();
	}

}
