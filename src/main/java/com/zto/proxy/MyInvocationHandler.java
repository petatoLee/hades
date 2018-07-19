package com.zto.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理类对象
 * @author zt 
 *
 */
public class MyInvocationHandler implements InvocationHandler{
	private Object obj=null;//
	
	public  MyInvocationHandler(Object obj) {
		this.obj=obj;
	}
	/**
	 * 代理类执行的方法
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable {
		System.out.println("bofore ........");
		Object result=method.invoke(obj,arg2);
		System.out.println("after ........");
		return result;
	}
	
	
	

}
