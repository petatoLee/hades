package com.lee.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//@EnableAspectJAutoProxy
public class MainTest {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext app=new AnnotationConfigApplicationContext("com.lee.aop");
		Fly test=(Fly) app.getBean("birds");
		test.fly();
		//test.test();
		//FlyAop aop=(FlyAop) app.getBean("flyAop");
		//System.out.println(aop);
		Thread.sleep(5000);
	}

}

