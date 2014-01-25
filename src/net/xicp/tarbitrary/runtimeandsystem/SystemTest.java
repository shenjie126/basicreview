package net.xicp.tarbitrary.runtimeandsystem;

public class SystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.gc();//调用此句等于调用Runtime.getRuntime().gc();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000; i ++) {
			String sr = "fdf"+i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("程序执行用的总时间为：" + (end-start) + "毫秒");
		
	}

}
