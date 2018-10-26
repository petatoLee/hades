package com.lee.semaphore;

import java.util.concurrent.Semaphore;

public class MainTest {
	public  Semaphore semaphore=new Semaphore(5);
	public static void main(String[] args) {
		MainTest test=new MainTest();
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				test.say();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		
	}
	
	public void say() throws InterruptedException {
		semaphore.acquire(1);
		System.out.println(Thread.currentThread().getName()+" say...");
		Thread.sleep(10000);
		semaphore.release();
		System.out.println(Thread.currentThread().getName()+" release...");
	}
}
