package net.xicp.tarbitrary.numbermanipulation;

import java.math.BigDecimal;

public class BigDecimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bd1 = new BigDecimal("9999999999999999999999999999.489496496496496");
		BigDecimal bd2 = new BigDecimal("9999999999999999999999999993.489496496496496");
		BigDecimal bd3 = new BigDecimal(1);
		System.out.println(format(bd1.add(bd2), bd3 , 3));
		System.out.println(format(bd1.subtract(bd2), bd3 , 3));
		System.out.println(format(bd1.multiply(bd2), bd3 , 3));
		System.out.println(format(bd1, bd2 , 5));
	}
	
	public static BigDecimal format(BigDecimal big1, BigDecimal big2, int scale) {
		return big1.divide(big2, scale, BigDecimal.ROUND_HALF_UP);
	}

}
