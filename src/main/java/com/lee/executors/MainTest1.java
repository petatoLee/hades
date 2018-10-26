package com.lee.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainTest1 {
	public static ExecutorService exec=Executors.newCachedThreadPool();
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> task=new Callable<String>() {
			public String call() {
				return "callable 型任务";
			}
		};
		Future<String> submit = exec.submit(task);
		Thread.sleep(1000);
		boolean issuccess=submit.isDone();
		if(issuccess) {
			System.out.println("已经执行完，结果+>"+submit.get());
		}
		
		System.out.println(submit.get());
	}
}
