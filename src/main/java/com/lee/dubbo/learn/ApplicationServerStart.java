package com.lee.dubbo.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @dubbo 服务端
 * @author zt
 *
 */
public class ApplicationServerStart {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		app.start();
		@SuppressWarnings("unused")
		SayHello sayhello=(SayHello) app.getBean("dubboHello");
		//sayhello.sayHell();
		while(true) {
			Thread.sleep(10000);
		}
	}
}
