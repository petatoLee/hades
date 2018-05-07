package com.lee.learning.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lee.utils.JsonUtil;

/**
 * java 8学习
 * 
 * @author Administrator
 *
 */
public class MainTest {
	public static void main(String[] args) {
		MainTest.testThread();
		MainTest.testCollection();
		MainTest.testMap();
	}

	// 1.runable接口
	public static void testThread() {
		new Thread(() -> {
			System.out.println("测试java8");
		}).start();
	}
	//2.集合遍历
	public static void testCollection(){
		List<User> list=new ArrayList<>();
		list.add(new User("1","liming1"));
		list.add(new User("2","liming2"));
		list.add(new User("3","liming3"));
		list.add(new User("1","liming1"));
		list.forEach((User u)->{
			System.out.println(u.getName());
			
		});
	}
	//测试map的遍历
	public static void testMap(){
		Map<String,User> map=new HashMap<>();
		map.put("1",new User("1","liming1"));
		map.put("2",new User("2","liming2"));
		map.put("3",new User("3","liming3"));
		map.forEach((key,value)->{
			System.out.println("key->"+key+" value->"+JsonUtil.toJSON(value));
		});
	}
	
	//集合的过滤
	public static void testFilter(){
		
	}
	
	
	
	
}
