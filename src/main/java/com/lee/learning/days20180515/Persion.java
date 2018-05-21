package com.lee.learning.days20180515;

public class Persion {
	static final  String name="lili";
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	static{
		System.out.println("init ---");
	}

}
