package com.lee.dubbo.learn.java;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

/**
 * dubbo服务暴露逻辑
 * 
 * @author zt
 *
 */
public class ServerExport {
//	进一步初始化 ServiceConfig 对象。
//	校验 ServiceConfig 对象的配置项。
//	使用 ServiceConfig 对象，生成 Dubbo URL 对象数组。
//	使用 Dubbo URL 对象，暴露服务。
	public static void main(String[] args) throws InterruptedException {
		// 服务实现
		SayDubbo sayDubbo = new SayDubboImpl();
		// 当前应用的设置
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("SayDubbo");
		// 注册中心配置
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://10.9.20.100:2181?backup=10.9.20.101:2181,10.9.20.65:2181");
		// 服务提供者协议配置
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(12000);
		protocolConfig.setThreadpool("fixed");// 固定线程数
		protocolConfig.setThreads(10);
		// 服务提供者暴露服务
		ServiceConfig<SayDubbo> serviceConfig = new ServiceConfig<>();
		serviceConfig.setApplication(applicationConfig);
		serviceConfig.setRegistry(registryConfig);
		serviceConfig.setProtocol(protocolConfig);
		serviceConfig.setInterface(SayDubbo.class);
		serviceConfig.setRef(sayDubbo);
		serviceConfig.setVersion("1.0");
		serviceConfig.export();
		while(true) {
			Thread.sleep(10000);
		}
	}

}
