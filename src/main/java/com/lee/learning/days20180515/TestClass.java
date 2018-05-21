package com.lee.learning.days20180515;
/**
 * 测试Class对象
 * @author Administrator
 *
 */
public class TestClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println(Persion.class);
		System.out.println(Persion.name);
		Class class1 =Class.forName("com.lee.learning.days20180515.Persion");
		System.out.println(class1.getName());
		Class class2 =Class.forName("com.lee.learning.days20180515.Persion");
		System.out.println(class1==class2);//证明java虚拟机中只有Persion类的一个Class对象，不管新建多少实例
		//System.out.println(class2.newInstance());
		Persion p=new Persion();
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass()==class1);
		System.out.println(p.getClass().newInstance());
		System.out.println(boolean.class.getName());//基础数据类型
		System.out.println(Boolean.class.getName());
		System.out.println(boolean.class);
		
		Class<? extends Number> numberClass=Integer.class;
		
	}
	
	static{
		System.out.println("ddddd");
	}

}
