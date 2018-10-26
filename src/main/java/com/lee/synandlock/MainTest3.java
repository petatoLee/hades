package com.lee.synandlock;

public class MainTest3 {
	public static void main(String[] args) {
		MainTest3 main = new MainTest3();
		main.say();
	}

	public void say() {
		synchronized (this) {
			System.out.println("say...");
		}
	}



}
