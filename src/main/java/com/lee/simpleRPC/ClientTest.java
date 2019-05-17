package com.lee.simpleRPC;

public class ClientTest {
	public static void main(String[] args) {
		//客户端
		RPCClients client=new RPCClients();
		HelloService proxy = (HelloService) client.getProxy(HelloService.class);
		String result=proxy.sayHello("hello");
		System.out.println(result);
	}

}
