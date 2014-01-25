package net.xicp.tarbitrary.finaltest;

public class FinalDemo1 {
	public static  final int PAGE_COUNT = 12;
	public int age;
	/**
	 * final修饰的类不可以被继承
	 * final修饰的变量称为常量
	 * final修饰的方法不可以被子类重写
	 * 用public static final修饰的常量称为全局变量， 全局变量的标识符必须全部为大写。
	 */
	public static void main(String[] args) {
		System.out.println(PAGE_COUNT);
		int a = 3;
		if (a == 3) {
			System.out.println("fjeo");
		}
		
	}
	
	
	
	
}
