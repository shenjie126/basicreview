package net.xicp.tarbitrary.numbermanipulation;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random(50);
		
		for (int i = 0; i < 19; i ++) {
			System.out.print(rd.nextInt() + " ");
		}
		System.out.println();
		
		Random rd1 = new Random(50);
		for (int i = 0; i < 19; i ++) {
			System.out.print(rd1.nextInt() + " ");
		}
	}

}
