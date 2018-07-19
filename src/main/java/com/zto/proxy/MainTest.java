package com.zto.proxy;

import java.lang.reflect.Proxy;

public class MainTest {
	public static void main(String[] args) {
		Birds birds=new Birds();
		MyInvocationHandler hander=new MyInvocationHandler(birds);
		//生成代理对象
		Fly proxy=(Fly) Proxy.newProxyInstance(birds.getClass().getClassLoader(), birds.getClass().getInterfaces(),hander);
		proxy.fly();
		
	}

}
