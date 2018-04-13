package com.lee.learning.days20180410;

import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) throws Exception {
		SelfContainer se=new SelfContainer();
		se.add("2222");
		se.add("24222");
		se.add("2243222");
		se.add("225422");
		se.add("22543545422");
		
		Iterator<String> it=se.getIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
