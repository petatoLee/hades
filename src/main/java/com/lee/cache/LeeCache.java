package com.lee.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LeeCache<K, V> {
	private Queue<K> lruQueue = new LinkedList<>();// 最近最少使用算法实现
	private static final int deault = 3;// 默认缓存数量
	private volatile int max = deault;
	private Map<K, V> map = null;

	public LeeCache() {
		map = new HashMap<>(deault);
	}

	public LeeCache(int size) {
		map = new HashMap<>(size);
	}

	public synchronized V getValue(K key) {
		V value = map.get(key);
		if (null == value) {
			return null;
		}
		lruQueue.remove(key);
		lruQueue.add(key);
		return value;
	}

	public synchronized V addValue(K key, V value) {
		int current = map.size();
		if (current >= max) {
			clear();
		}
		lruQueue.add(key);
		map.put(key, value);
		return value;
	}

	public void clear() {
		K k = lruQueue.poll();
		map.remove(k);
	}

}
