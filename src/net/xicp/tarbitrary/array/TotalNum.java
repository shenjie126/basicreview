package net.xicp.tarbitrary.array;

import java.util.concurrent.TimeUnit;

public class TotalNum {
	public static void main(String[] args) throws InterruptedException {
		int sum = 0;
		long l1 = System.currentTimeMillis();
		TimeUnit.SECONDS.sleep(1);
		for (int i = 1; i <= 100; i ++) {
			sum += i;
		}
		long l2 = System.currentTimeMillis();
		System.out.println("method one :" + (l2 - l1));
		System.out.println("result" + sum);
		
		sum = 0;
		long l3 = System.currentTimeMillis();
		TimeUnit.SECONDS.sleep(1);
		sum = recursion(100);
		long l4 = System.currentTimeMillis();
		System.out.println("method two :" + (l4 - l3));
		System.out.println("result" + sum);
		
		sum = 0;
		long l5 = System.currentTimeMillis();
		TimeUnit.SECONDS.sleep(1);
		sum = myMethod(1, 4, 1);
		long l6 = System.currentTimeMillis();
		System.out.println("method three:" + (l6 - l5));
		System.out.println("result" + sum);
	}
	
	public static int recursion(int temp) {
		if (temp == 1) {
			return 1;
		}
		
		return temp + recursion(temp -1);
		
	}
	public static int myMethod(int a1, int n, int step) {
		return (a1 + a1 + step*(n-1))*n/2;
	}

}
