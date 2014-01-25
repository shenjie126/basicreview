package net.xicp.tarbitrary.commoninterface;

public class CloneableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Diagram diagram1 = new Diagram("test cloneable", 34);
		Diagram diagram2 = null;
		try {
			diagram2 = (Diagram) diagram1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(diagram1==diagram2);//表明克隆的对象与原对象不是同一个实例对象只是原对象在内存里面重新做的一份拷贝
		
		diagram2.setSt("abc");
		diagram1.setA(25);
		
		System.out.println(diagram1.getSt() + " :" + diagram1.getA());
		System.out.println(diagram2.getSt() + " :" + diagram2.getA());
		
	}

}

/*
 * cloneable只是一个标识接口， 没有要实现的方法。
 * 实现的cloneable接口的类可以调用Object类的clone()方法
 * 为了调用clone方法必须 覆写Object的clone()方法并将其
 * protected 的访问权限改为public
 */
class Diagram implements Cloneable {
	public String st;
	public int a;
	
	Diagram(String st , int a) {
		this.st = st;
		this.a = a;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}