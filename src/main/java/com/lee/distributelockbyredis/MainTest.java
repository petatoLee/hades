package com.lee.distributelockbyredis;

public class MainTest {
	public static void main(String[] args) {
		Service service = new Service();
		for (int i = 0; i < 5; i++) {
			ThreadA threadA = new ThreadA(service);
			threadA.setName("线程:"+i);
			threadA.start();
		}
	}
}

class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.lock();
	}
}
