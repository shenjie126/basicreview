package net.xicp.tarbitrary.innerclass;

public class InnerClassDemo3 {
	/**
	 * 方法内部类要想调用方法中的局部变量，则在局部变量前必须加final
	 * 如果想在方法内部类拿到外部类的实例对象的引用，可以用外部类名.this得到。
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new MyOuter().getInfo());
	}
}
class MyOuter {
	private void print(){
		System.out.println("print method");
	}
	public String getInfo(){
	
		class MethodIneerClass {
			final int i = 20;
			@Override
			public String toString() {
				print();
				System.out.println(MyOuter.this);
				System.out.println("*********************************");
				return "tuqinag ,tarbitrary" + i;
			}
		
		}
		System.out.println("before methodinnerclass initialized");
		return  new MethodIneerClass().toString();
	}
}