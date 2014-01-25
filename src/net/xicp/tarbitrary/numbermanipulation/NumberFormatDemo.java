package net.xicp.tarbitrary.numbermanipulation;

import java.text.NumberFormat;

public class NumberFormatDemo {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		
		String st = nf.format(192464646.3445246);
		System.out.println(st);
	}
}
