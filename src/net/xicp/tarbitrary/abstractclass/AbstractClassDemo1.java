package net.xicp.tarbitrary.abstractclass;

public abstract class AbstractClassDemo1 {
	public String st = "abdcc";
	
	public static void main(String[] args) {
		System.out.println("jfoejf");
		//AbstractClassDemo1 acd = new AbstractClassDemo1(3);//错误，抽象类不能被实例化
		A a = new A("abcd");
		AbstractClassDemo1 acd = new A("test");
		acd.run();
		System.out.println("*****************************");
		a.start();
		System.out.println("*****************************");
		System.out.println("_______________________________________");
		acd.start();
		System.out.println("_______________________________________");
		a.run();
	}
	
	public void start() {
		System.out.println("start");
	}
	AbstractClassDemo1(int age) {
		System.out.println("抽象类也可以有构造方法");
	}
	
	/**
	 * 抽象类里面的抽象方法不能有方法体。如果一个类拥有未实现的抽象方法那么这个类即为抽象类。
	 * 抽象类也可以有主方法
	 * 抽象类允许有构造方法，但是此构造方法是不能直接调用的，是交给去调用的，子类对象的实例化
	 * 过程中永远是先调用父类的构造方法。
	 * 抽象类不可以被实例化。
	 * 构造方法、类方法(包含static关键字的方法)不能声明为抽象方法
	 * 抽象类中不一定包含抽象方法，但有抽象方法的类必定是抽象类
	 * 一个抽象类中可以包含多个接口
	 * 一个接口中可以包含多个抽象类
	 */
	public  abstract void run();
	
}
class A extends AbstractClassDemo1 {

	A(String s) {
		super(3);//如果是默认构造方法则可以省略super()不写。
	}

	@Override
	public void run() {
		System.out.println("hello tarbitrary");
	}
	
}