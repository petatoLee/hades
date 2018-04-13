package com.lee.learning.days20180412;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<User> set=new HashSet<User>();
		set.add(new User("1", "hsh"));
		set.add(new User("1", "hsh"));
		System.out.println(set.size());
		
	}

}
