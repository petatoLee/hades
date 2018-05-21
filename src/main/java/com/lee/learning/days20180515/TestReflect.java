package com.lee.learning.days20180515;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lee.utils.JsonUtil;

/**
 * 
 * 测试反射
 * @author Administrator
 *
 */
public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//1.根据类  测试构造器
		Class<?> cl=Class.forName("com.lee.learning.days20180515.Car");
		//无参构造方法
		Car car=(Car) cl.newInstance();
		car.setName("呵呵");
		car.setWeight("10");
		System.out.println(JsonUtil.toJSON(car));
		//获取所有的构造方法
		Constructor<?>[] con=cl.getConstructors();
		System.out.println(con);
		//获取指定参数的构造方法
		Constructor<?> con2=cl.getDeclaredConstructor(String.class,String.class);
		con2.setAccessible(true); //设置属性可访问
		Car car2=(Car) con2.newInstance("122","222");
		System.out.println(JsonUtil.toJSON(car2));
		
		//2.根据类  测试方法
		Class<?> cl3=Class.forName("com.lee.learning.days20180515.Car");
		//获取所有的属性，包括私有属性,包访问权限的
		System.out.println("--------------getDeclaredFields");
		Field [] filed1=cl3.getDeclaredFields();
		for(Field filed:filed1){
			System.out.println(filed.getName());
		}
		System.out.println("-----------getFields");
		//获取public修饰符修饰的属性
		Field [] filed2=cl3.getFields();
		for(Field filed:filed2){
			System.out.println(filed.getName());
		}
		System.out.println(cl3.getDeclaredField("name"));
		System.out.println(cl3.getField("size"));
		//3.根据类测试method
		System.out.println("测试method");
		Class<?> cl4=Class.forName("com.lee.learning.days20180515.Car");
		Method [] methods=cl4.getMethods();
		for(Method method:methods){
			System.out.println(method);
		}
		
		//4.根据对象
		System.out.println("--------------根据对象---------------");
		//修改属性
		Car car4=new Car("测试", "1");
		Class<?> class11=car4.getClass();
		Field filed111=class11.getDeclaredField("name");
		filed111.setAccessible(true);
		filed111.set(car4, "测试。。。。");
		System.out.println(JsonUtil.toJSON(car4));
		//调用方法
		Method method111=class11.getDeclaredMethod("say3", null);
		method111.setAccessible(true);
		method111.invoke(car4, null);
		
		Method method1112=class11.getDeclaredMethod("test", String.class);
		method1112.setAccessible(true);
		System.out.println(method1112.invoke(car4, "测试"));
	}

}
