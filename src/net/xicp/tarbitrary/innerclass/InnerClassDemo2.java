package net.xicp.tarbitrary.innerclass;

public class InnerClassDemo2 {
	/**
	 *如果在内部类的名称之前加了static 则该内部类变成了外部类
	 *就可以用外部类名称.内部类名称　内部类实例名 = new 外部类名称.内部类名称();
	 *方法调用 
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Outer1.Inner inner1 = new  Outer1.Inner();
		inner1.print();
	}
	
}
class Outer1 {
	private static String info = "hello tarbitrary";
	static {
		System.out.println("I'm coming!");
	}
	{
		System.out.println("come in");
	}
	static class Inner{
		public void print() {
			System.out.println("abc" + info);
		}
	}
	
	
}
