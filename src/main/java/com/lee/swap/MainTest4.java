package com.lee.swap;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainTest4 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Integer a=new Integer(5);
		Integer b=new Integer(10);
		test(a);
		System.out.println(a);
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		test2(list);
		System.out.println(list);
		Person p1=new Person(1, "lili");
		Person p2=new Person(2, "xixi");
		swap(p1, p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	} 
	
	public static void test(Integer temp) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field= temp.getClass().getDeclaredField("value");
		field.setAccessible(true);
		field.set(temp, 10);
	}
	
	public static void test2(List<String> list) {
		list.add("5");
	}
	
	public static void swap(Person p1,Person p2) {
		Person p=new Person(p1.getId(), p1.getName());
		p1.setId(p2.getId());
		p1.setName(p2.getName());
		p2.setId(p.getId());
		p2.setName(p.getName());
	}
}
