package com.lee.jdk;

public class TestClone {
	int total;

	public static void main(String[] args) {
//		TestClone clone=new TestClone();
//		Thread t1=new Thread(clone.new MyRunable(clone));
//		Thread t2=new  Thread(clone.new MyRunable2(clone));
//		t1.setName("t1");
//		t2.setName("t2");
//		t1.start();
//		t2.start();
		System.out.println(4 << 2);
	}

	class MyRunable implements Runnable {
		private TestClone testClone;
		
		
		
		
		
		public MyRunable(TestClone testClone) {
			super();
			this.testClone = testClone;
		}

		@Override
		public synchronized void run() {
			while (true) {
				synchronized (testClone) {
					if (total == 10) {
						try {
							wait();
							System.out.println(Thread.currentThread().getName() + " 等待中");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						total++;
						System.out.println(Thread.currentThread().getName() + " " + total);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

	class MyRunable2 implements Runnable {
		private TestClone testClone;
		public MyRunable2(TestClone testClone) {
			super();
			this.testClone = testClone;
		}
		@Override
		public synchronized void run() {
			while (true) {
				synchronized (testClone) {
					if (total >= 10) {
						notify();
						total++;
						System.out.println(Thread.currentThread().getName() + " " + total);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						total++;
						System.out.println(Thread.currentThread().getName() + " " + total);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

}
