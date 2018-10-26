package com.lee.synandlock;

public class MainTest {
	public static void main(String[] args) {
		MainTest main=new MainTest();
		main.say();
	}
	
	
	
	public synchronized void say() {
		System.out.println("say...");
	}
}
