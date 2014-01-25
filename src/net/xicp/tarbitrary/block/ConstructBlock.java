package net.xicp.tarbitrary.block;

public class ConstructBlock {
	/**
	 * 构造块优先于构造方法执行，且每次新创建一个类的对象实例时都会被调用一次
	 * 静态构造块优先于构造块执行，且仅在类的字节码被加载时执行一次。以后都不会被执行。
	 * 两个静态代码块依据位置的先后先后被执行。
	 * 如果一个静态变量在静态代码块的前面则它会在静态代码块被执行之前完成初始化　
	 */
	public static void main(String args[]) {
		for (int i = 0; i < 10; i ++) {
			new Test();
		}
	}
	
	
}

 class Test {
	 static  int i = 88;
	 static {
		 System.out.println("test");
		 System.out.println(i);
	 }
	 Test() {
		 j = 10;
		 System.out.println("hello");
	 }
	 private int j;
	 
	 {
		 System.out.println("j" + j);
		 System.out.println("world");
	 }
	 static {
		 System.out.println("tarbitrary");
	 }
 }
