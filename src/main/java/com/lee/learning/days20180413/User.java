package com.lee.learning.days20180413;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private transient String id;
	private String name;
	private static int num=10;
	
	
	
	
	
	
	
	
	public User() {
		super();
	}
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		User.num = num;
	}
	
	
	
	
	

}
