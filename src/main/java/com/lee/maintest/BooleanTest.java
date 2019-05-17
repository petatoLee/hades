package com.lee.maintest;

import com.lee.utils.JsonUtil;

public class BooleanTest {
	private boolean isSuccess;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
	public static void main(String[] args) {
		BooleanTest test=new BooleanTest();
		test.setSuccess(true);
		String data=JsonUtil.toJSON(test);
		System.out.println(data);
		
	}
}
