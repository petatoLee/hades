package com.lee.dubbo.learn.java;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * dubbo 服务消费者配置
 * @author zt
 *
 */
public class ComsumerReference {
	public static void main(String[] args) {
		// 当前应用的设置
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("Comsumer");
		// 注册中心配置
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://10.9.20.100:2181?backup=10.9.20.101:2181,10.9.20.65:2181");
		// 消费者配置
		ReferenceConfig<SayDubbo> referenceConfig=new ReferenceConfig<>();
		referenceConfig.setApplication(applicationConfig);
		referenceConfig.setRegistry(registryConfig);
		referenceConfig.setInterface(SayDubbo.class);
		referenceConfig.setVersion("1.0");
		SayDubbo sayDubbo=referenceConfig.get();
		sayDubbo.say();

	}
}
