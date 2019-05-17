package com.lee.lombok;

public class DemoTest {
	public static void main(String[] args) {
		int [] num=new int[]{10,100,30,54,888,76,1000};
		for(int each:num) {
			new Thread(()->{
				try {
					Thread.sleep(each);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(each);
			}) .start();
		}
	}

}
