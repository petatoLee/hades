package com.lee.distributelockbyredis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by liuyang on 2017/4/20.
 */
public class Service {
	private static final String LOCK_KEY = "LOCK_KEY_1";
	private static final long GET_TIME_OUT = 5000;
	private static JedisPool pool = null;
	static {
		JedisPoolConfig config = new JedisPoolConfig();
		// 设置最大连接数
		config.setMaxTotal(200);
		// 设置最大空闲数
		config.setMaxIdle(8);
		// 设置最大等待时间
		config.setMaxWaitMillis(1000 * 100);
		// 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例均是可用的
		config.setTestOnBorrow(true);
		pool = new JedisPool(config, "10.9.20.64", 6388, 3000, "rds3459##^^");
	}

	DistributedLock lock = new DistributedLock(pool);

	int n = 500;

	public void lock() {
		// 返回锁的value值，供释放锁时候进行判断
		// String value=UUID.randomUUID().toString();
		final long end = System.currentTimeMillis() + GET_TIME_OUT;
		boolean result = false;
		int i = 0;
		while ((System.currentTimeMillis() <= end) && !result) {
			result = lock.lockWithTimeout(LOCK_KEY, "test", 1000 * 10);
			i++;
			if (!result) {
				if (i > 1) {
					System.out.println(Thread.currentThread().getName() + "重新获取锁");
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (!result) {
			System.out.println(Thread.currentThread().getName() + "获取锁超时");
			return;
		}

		System.out.println(Thread.currentThread().getName() + "获得了锁");

		System.out.println(--n);
		//查询表数据  更新表数据
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		lock.releaseLock(LOCK_KEY, "test");
		System.out.println(Thread.currentThread().getName() + "释放了锁");
	}
}