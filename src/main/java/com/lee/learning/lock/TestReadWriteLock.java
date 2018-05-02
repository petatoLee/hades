package com.lee.learning.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 测试读写锁
 * 
 * @author liming
 *
 */
public class TestReadWriteLock {
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		final TestReadWriteLock testReadWriteLock=new TestReadWriteLock();
//		new Thread(new Runnable() {
//			
//			public void run() {
//				testReadWriteLock.readNum(Thread.currentThread());
//			}
//		}).start();
//		
//		new Thread(new Runnable() {
//			
//			public void run() {
//				testReadWriteLock.readNum(Thread.currentThread());
//			}
//		}).start();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				testReadWriteLock.writeNum(Thread.currentThread());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				testReadWriteLock.writeNum(Thread.currentThread());
			}
		}).start();
		

	}

	public void readNum(Thread thread) {
		Lock lock = readWriteLock.readLock();
		try {
			lock.lock();
			long start=System.currentTimeMillis();
			while((System.currentTimeMillis()-start)<=1000){
				System.out.println("线程 "+thread.getName()+" 正在读");
			}
			
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}

	}

	public void writeNum(Thread thread) {
		Lock lock = readWriteLock.writeLock();
		try {
			lock.lock();
			long start=System.currentTimeMillis();
			while((System.currentTimeMillis()-start)<=1000){
				System.out.println("线程 "+thread.getName()+" 正在写");
			}
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}

	}

}
