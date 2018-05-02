package com.lee.learning.days20180413;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.lee.utils.JsonUtil;

//测试对象克隆
public class TestClone {
	public static void main(String[] args) {
		HashSet<Students> set1=new HashSet<Students>();
		set1.add(new Students("1", "xiaoli", "N"));
		set1.add(new Students("2", "xiaohua", "N"));
		
		HashSet<Students> set2=(HashSet<Students>) set1.clone();
		for(Students s:set1){
			s.setName("改变了");
		}
		System.out.println(JsonUtil.toJSON(set1));
		System.out.println(JsonUtil.toJSON(set2));
		
	}

}
