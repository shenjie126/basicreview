package net.xicp.tarbitrary.innerclass;

public class InnerClassDemo1 {
	/**
	 * 在外部类的外部构造一个内部类的实例
	 * 应该用外部类名.内部类名 　实例名　= 外部类实例名.new 内部类名();
	 * @param args
	 */
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		Outer.Inner inner2 = outer.new Inner();
		
		inner.print();
		inner2.print();
	}
	
}
class Outer {
	private String info = "hello tarbitrary";
	class Inner{
		public void print() {
			System.out.println("abc" + info);
		}
	}
	
	
}
