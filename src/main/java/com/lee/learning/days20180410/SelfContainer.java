package com.lee.learning.days20180410;

import java.util.Iterator;
/**
 * 自定义迭代器实现容器的遍历
 * @author Administrator
 *
 */
public class SelfContainer {
	private static final int size=100;
	private String[] str=new String[size];
	private int index;
	int cur;
	
	
	public void add(String data) throws Exception{
		if(index>size){
			throw new Exception("空间不足");
		}
		str[index]=data;
		index++;
	}
	
	public Iterator<String> getIterator(){
		return new selfIterator();
	}
	
    class selfIterator implements Iterator<String>{

		public boolean hasNext() {
			if(cur<index){
				return true;
			}
			return false;
		}

		public String next() {
			if(cur<index){
				String data=str[cur];
				cur++;
				return data;
			}
			return null;
		}
    	
    }
	
}
