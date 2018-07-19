package com.lee.aop;

import org.springframework.stereotype.Component;

@Component
public class Birds implements Fly{
	@Override
	public void fly() {
		System.out.println("I am flying ...");
	}

}
