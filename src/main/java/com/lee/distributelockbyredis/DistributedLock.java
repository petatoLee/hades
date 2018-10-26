package com.lee.distributelockbyredis;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.util.Collections;

/**
 * Created by liuyang on 2017/4/20.
 */
public class DistributedLock {
	private static final String LOCK_SUCCESS = "OK";
	private static final String SET_IF_NOT_EXIST = "NX";
	private static final String SET_WITH_EXPIRE_TIME = "PX";
	private static final Long RELEASE_SUCCESS = 1L;
	private final JedisPool jedisPool;

	public DistributedLock(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	public boolean lockWithTimeout(String lockKey, String requestId, int expireTime) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
		if (LOCK_SUCCESS.equals(result)) {
			return true;
		}
		return false;

	}

	/**
	 * 释放锁
	 * 
	 * @param lockName   锁的key
	 * @param identifier 释放锁的标识
	 * @return
	 */
	public boolean releaseLock(String lockKey, String requestId) {
		Jedis jedis = jedisPool.getResource();
		String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
		Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
		if (RELEASE_SUCCESS.equals(result)) {
			return true;
		}
		return false;
	}
}