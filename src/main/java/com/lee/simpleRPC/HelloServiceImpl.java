package com.lee.simpleRPC;

public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String hello) {
		return Thread.currentThread().getName()+" say "+hello;
	}

}
