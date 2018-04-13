package com.lee.learning.days20180411;

/**
 * 手动实现list
 * @author Administrator
 *
 */
public class SelfArrayList{
	public static final int default_dize=10;
	public static final int max_size=10000000;
	public int index;
	public int currentSize;
	public Object[] container;
	
	public SelfArrayList(){
		container=new Object[default_dize];
		currentSize=default_dize;
	}
	
	public SelfArrayList(int size){
		container=new Object[size];
		currentSize=size;
	}
	
	public void add(Object obj){
		container[index]=obj;
		index++;
	}
	

}
