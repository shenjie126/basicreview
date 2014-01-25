package net.xicp.tarbitrary.array;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int a[] = {23, 34, 21, 12, 45, 6};
		int b[] = {23, 34, 21, 12, 45, 6};
		int c[] = {233, 123, 334, 21, 342, 345, 36};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		System.arraycopy(b, 1, c, 3, 3);
		for (int j :c) {
			System.out.println(j);
		}
		
		changeParameter(1);
		changeParameter(1, 2);
		changeParameter(1, 2, 3);
		changeParameter(1, 2, 3, 4);
		
	}
	
	public static void changeParameter(int a, int ... b) {
		System.out.println("可变参数");
		System.out.println(a);
		for (int t : b) {
			System.out.print(t);
		}
		System.out.println();
	}
}
