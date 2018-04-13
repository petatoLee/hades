package com.lee.learning.days20180413;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试序列化
 * @author Administrator
 *
 */
public class TestSerializable {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//测试序列化
		File file=new File("E://test.txt");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));
		User user=new User("1", "2");
		user.setNum(100);
		out.writeObject(user);
		out.close();
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
		Object o=in.readObject();
		User u=(User) o;
		System.out.println(o);
		System.out.println(u);
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getNum());
		
	}

}
