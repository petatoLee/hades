package com.lee.learning.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试重入锁
 * @author liming
 *
 */
public class TestLock {
	private int num;
	Lock lock=new ReentrantLock();
	public static void main(String[] args) {
		final TestLock testLock=new TestLock();
		new Thread(new Runnable() {
			
			public void run() {
					testLock.add();
				System.out.println("num->"+testLock.num);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				testLock.add();
				System.out.println("num->"+testLock.num);
			}
		}).start();
		
	}
	
	
	public void  add(){
		try {
			lock.lock();
			for(int i=0;i<1000000;i++){
				num++;
			}
			
		} catch (Exception e) {
			
		}finally{
			lock.unlock();
		}
	}

}
