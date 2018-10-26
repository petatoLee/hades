package com.lee.abstractclass;

public abstract class BigAnimals extends StardAnimals{

	@Override
	public void eat() {
		test();
		System.out.println("eat ....big");
	}
	
	public void test() {}
	
}
