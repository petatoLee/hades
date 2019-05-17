package com.lee.futuretask;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFutureTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		Future<String> submit = newFixedThreadPool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(new Date(System.currentTimeMillis()));
				Thread.sleep(2000);
				System.out.println(new Date(System.currentTimeMillis()));
				return "123";
			}
		});
		
		
		System.out.println("主线程执行.....");
		System.out.println("FutureTask 执行结果->"+submit.get());
		newFixedThreadPool.shutdown();

	}

}
