package com.lee.swap;

import java.lang.reflect.Field;

public class MainTest {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Integer a = 1;
		Integer b = 2;
		// swap1(a, b);
		swap3(a, b);
		System.out.println("a=" + a + ",b=" + b);
	}

	// none success
	public static void swap1(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

	// none success
	public static void swap2(Integer a, Integer b)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Integer temp = a.intValue();
		Field field = a.getClass().getDeclaredField("value");
		field.setAccessible(true);
		field.set(a, b);
		field.set(b, temp);
	}

	// none success
	public static void swap3(Integer a, Integer b)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int temp = a.intValue();
		Field field = a.getClass().getDeclaredField("value");
		field.setAccessible(true);
		field.set(a, b);
		System.out.println(temp);
		field.set(b, temp);
		
		System.out.println(Integer.valueOf(1));
	}

	public static void swap4(Integer a, Integer b)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int temp = a.intValue();
		Field field = a.getClass().getDeclaredField("value");
		field.setAccessible(true);
		field.set(a, b);
		field.set(b, new Integer(temp));
	}

	
	public static void swap5(Integer a, Integer b) {
		int tem=a.intValue();
		a=b; 
		b=tem;
	}
}
