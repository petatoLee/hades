package com.lee.dubbo.learn;

public class SayHelloImpl implements SayHello{

	@Override
	public void sayHell() {
		System.out.println(Thread.currentThread().getName()+" hello dubbo.");
	}

}
