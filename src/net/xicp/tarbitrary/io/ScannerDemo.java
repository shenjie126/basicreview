package net.xicp.tarbitrary.io;

import java.util.Scanner;

public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.delimiter());
		scanner.useDelimiter("\\*+");//scanner默认使用空格与回车作为分隔符，此句话设定分隔符为一个或多个*
		System.out.println("请输入一句话：");
		while (scanner.hasNext()) {
			System.out.println("输入为：" + scanner.next());
		}
		scanner.close();
 	}

}
