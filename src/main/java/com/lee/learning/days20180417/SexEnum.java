package com.lee.learning.days20180417;

public enum SexEnum {
	MALE("male"),FEMALE("female");
	
	private SexEnum(String sex){
		this.sex=sex;
	}
	
	private SexEnum(String sex,int age){
		this.sex=sex;
		this.age=age;
	}
	
	private String sex;
	
	public String getSex(){
		return sex;
	}
	private int age;
	
	public int getAge(){
		return age;
	}
	
	

}
