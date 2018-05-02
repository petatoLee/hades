package com.lee.learning.days20180417;

import com.lee.utils.JsonUtil;

public class TestJson {
	public static void main(String[] args) {
		//测试1
		JsonObject1 j1=new JsonObject1();
		j1.setDays("3");
		j1.setId("2");
		j1.setKey("4324");
		j1.setName("54545");
		String json=JsonUtil.toJSON(j1);
		System.out.println(JsonUtil.toJSON(JsonUtil.parse(json, JsonObject2.class)));
		
		JsonObject2 j2=new JsonObject2();
		j2.setId("4324");
		j2.setKey("43243");
		j2.setName("43243");
		String json2=JsonUtil.toJSON(j2);
		System.out.println(JsonUtil.toJSON(JsonUtil.parse(json2, JsonObject1.class)));
	}

}
