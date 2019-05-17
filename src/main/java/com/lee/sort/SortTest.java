package com.lee.sort;

/**
 * @author zt
 *
 */
public class SortTest {
	// 从小到大排序
	static int[] sort = new int[] { 1, 4, 6, 7, 9, 4, 8, 88, 23, 54, 87, 43, 76, 87, 32, 54, 34 };

	public static void main(String[] args) {
		maopaoSort();
		
	}

	// 1.0
	public static void maopaoSort() {
		int length = sort.length;
		int k = length - 1;// 排序次数
		for (int i = 1; i <= k; i++) {
			for (int j = i - 1; j < k; j++) {
				if (sort[j] > sort[j + 1]) {
					int temp = sort[j + 1];
					sort[j + 1] = sort[j];
					sort[j] = temp;
				}
			}
		}
		print();
	}
	
	public static void quickSort() {
		int i=0;
		int j=sort.length-1;
		
//		while(i!=j) {
//			for() {}
//			
//			
//		}
		
		
		
		
	}
	
	
	
	
	

	public static void print() {
		for (int i : sort) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
	}

}
