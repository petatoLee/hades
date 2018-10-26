package com.lee.synandlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainTest2 {
	private Lock lock=new ReentrantLock();
	public static void main(String[] args) {
		MainTest2 main=new MainTest2();
		main.say();
	}

	public void say() {
		try {
			lock.lock();
			System.out.println("say...");
		} catch (Exception e) {
		}finally {
			lock.unlock();
		}

	}
}
