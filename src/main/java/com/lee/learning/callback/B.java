package com.lee.learning.callback;

public class B {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B(String name) {
		super();
		this.name = name;
	}
	
	
	public void doThing(A a){
		System.err.println("A 让b doing 洗碗" );
	}
	
	

}
