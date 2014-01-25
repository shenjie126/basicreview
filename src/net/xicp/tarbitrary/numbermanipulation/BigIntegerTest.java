package net.xicp.tarbitrary.numbermanipulation;

import java.math.BigInteger;

public class BigIntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bg1 = new BigInteger("9999999999999999999999999");
		BigInteger bg2 = new BigInteger("9999999999999999999999999");
		BigInteger bg3 = new BigInteger("9999999999999999998999999");
		
		
		System.out.println("相加： " + (bg1.add(bg2)));
		System.out.println("相减： " + bg1.subtract(bg3));
		System.out.println("相乘：" + bg1.multiply(bg3));
		System.out.println("相除: " + bg1.divide(bg2));
		BigInteger[] bis = bg1.divideAndRemainder(bg3);
		System.out.println("结果为" + bis[0] + "余数为： " + bis[1]);

	}

}


