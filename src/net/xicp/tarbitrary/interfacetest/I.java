package net.xicp.tarbitrary.interfacetest;

public interface I {
	/**
	 * 在interface中，只能够有静态的不能被修改的数据成员(也就是必须是static final的，不过在 interface中一般不定义数据成员)，
	 * 所有的成员方法都是abstract的。
	 * 抽象类可以有非抽象方法，而接口只能有抽象方法。
	 * 接口可以继承多个接口，但接口不能继承抽象类。
	 * 而抽象类可以继承接口。但反之则不行。
	 * 一个类可以实现多个接口，但一个类只能继承一个抽象类。
	 * 利用 接口可以实现软件开发领域的低耦合. 
	 */
	//其实它的完整表示方式是public static final int a = 9;只不过通常前面的public static final关键字可以省略。
	int a = 9;
	public static int b = 9;
	
	//下面的方法省略了public abstract 写全就是 public abstract  void print();
	void print();
	
	public abstract  void printInfo();
	
	
	

}
