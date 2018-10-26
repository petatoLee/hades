package com.zto.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 指定代理对象所关联的调用处理器
 * @author zt 
 *
 */
public class MyInvocationHandler implements InvocationHandler{
	private Object obj=null;//
	
	public  MyInvocationHandler(Object obj) {
		this.obj=obj;
	}
	/**
	 该方法负责集中处理动态代理类上的所有方法调用。
	 第一个参数既是代理类实例，
	 第二个参数是被调用的方法对象
	 第三个方法是调用参数。
	 调用处理器根据这三个参数进行预处理或分派到委托类实例上发射执行
	*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable {
		System.out.println("bofore ........");
		Object result=method.invoke(obj,arg2);
		System.out.println("after ........");
		return result;
	}
	
	
	

}
