package com.lee.learning.days20180515;

public class Car extends Tools{
	private String name;
	private String weight;
	
	public int size=5;
	
	String type;
	
	
	public void say1(){
		System.out.println(name);
	}
	
	public void say2(){
		System.out.println(size);
	}
	
	private void say3(){
		System.out.println(weight);
	}
	
	
	private  String test(String data){
		return data;
	}
	
	
	public Car() {
		super();
	}
	public Car(String name, String weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
}
