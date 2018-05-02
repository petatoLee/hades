package com.lee.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 累加器
 * @author Administrator
 *
 */
public class AutoAdd {
	private AtomicInteger add;
	public void add(int i){
		add.addAndGet(i);
	}
}
