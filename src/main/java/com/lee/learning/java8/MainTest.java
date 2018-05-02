package com.lee.learning.java8;

import java.util.Arrays;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		System.out.println(Integer.compare(5, 4));
		List<String> list=Arrays.asList("123","44444","44","3");
		Arrays.sort(list, (String s1,String s2)-> Integer.compare(s1.length(),s2.length()));
		
		
	}

}
