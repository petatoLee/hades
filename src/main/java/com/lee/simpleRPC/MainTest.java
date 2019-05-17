package com.lee.simpleRPC;

public class MainTest {
	public static void main(String[] args) throws Exception {
		ServerCenter server=new ServerCenter();
		server.register(HelloService.class, HelloServiceImpl.class);
		server.start();
	
	}

}
