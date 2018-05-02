package com.lee.maintest;

public class SysDemo {
	public static  void test(int i,SysDemo demo){
		synchronized(SysDemo.class){
			i++;
		}
	}
	
	
	public static synchronized void test(int i,MainTest test){
		synchronized(SysDemo.class){
			i++;
		}
	}
	
	
	public  synchronized void test2(int i,SysDemo demo){
		synchronized(SysDemo.class){
			i++;
		}
	}
	
	
	public  synchronized void test2(int i,MainTest test){
		synchronized(SysDemo.class){
			i++;
		}
	}
	
	public  synchronized void test3(int i,SysDemo demo){
		synchronized(this){
			i++;
		}
	}
	
	
	public  synchronized void test3(int i,MainTest test){
		synchronized(this){
			i++;
		}
	}

}
