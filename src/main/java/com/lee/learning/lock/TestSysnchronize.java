package com.lee.learning.lock;

/**
 * 测试同步块
 * 
 * @author Administrator
 *
 */
public class TestSysnchronize {
	private int num1;
	private int num2;
	private int num3;
	public static void main(String[] args) {
		final TestSysnchronize test=new TestSysnchronize();
//		new Thread(new Runnable() {
//			
//			public void run() {
//				test.synchronizedAdd();
//				test.add();
//				test.add2();
//			}
//		}).start();
		new Thread(new Runnable() {
			
			public void run() {
				test.synchronizedAdd();
				test.add();
				test.add2(test);
			}
		}).start();
	}

	public synchronized void  synchronizedAdd() {
		for (int i = 0; i < 20000000; i++) {
			num1 += 1;
		}
		System.out.println("num1->"+num1);
	}
	
	public  void  add() {
		for (int i = 0; i < 20000000; i++) {
			num2 += 1;
		}
		System.out.println("num2->"+num2);
	}
	
	public  void  add2(TestSysnchronize test) {
		synchronized (this) {
			for (int i = 0; i < 20000000; i++) {
				num3 += 1;
			}
			System.out.println("num3->"+num3);
		}
		
	}

}
