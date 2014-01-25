package net.xicp.tarbitrary.numbermanipulation;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		decimalFormat("000,000,000.000",6789215.215486);
		decimalFormat("###,###,###.###",56789215.215486);

	}
	
	public static void decimalFormat(String pattern, Number value) {
		DecimalFormat df = new DecimalFormat(pattern);
		String st = df.format(value);
		System.out.println("result :" + st);
	}
	
	public <T> T getResult(T t) {
		return t;
	}

}
