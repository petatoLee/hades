package com.lee.learning;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> list=Arrays.asList(new String[] {"1","1","1","1"});
		System.out.println(list);
		list.forEach(base->{
			//base=base.replace("1", "2");
			base="2";
		});
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i).replaceAll("1", "2"));
		}
		System.out.println(list);
		
		String a="123";
		System.out.println(a.replace("123", "1234"));
		
	}

}
