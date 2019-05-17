package com.lee.dubbo.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationConsumerStart {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContextConsumer.xml");
		
		app.start();
		@SuppressWarnings("unused")
		SayHello sayhello=(SayHello) app.getBean("demoService");
		sayhello.sayHell();
	}
}
