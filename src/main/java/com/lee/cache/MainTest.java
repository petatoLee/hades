package com.lee.cache;

public class MainTest {

	public static void main(String[] args) {
		LeeCache<String,String> cache=new LeeCache();
		cache.addValue("1", "1");
		cache.addValue("2", "2");
		cache.addValue("3", "3");
		cache.getValue("1");
		cache.addValue("4", "4");
		cache.addValue("5", "5");
		System.out.println(cache.getValue("1"));
		System.out.println(cache.getValue("5"));
		
	}
}
