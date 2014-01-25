package net.xicp.tarbitrary.reflect;

public class ClassInitDemo {

	/**
	 * 得到 类的字节码有三种方式一种是Class.forName(包名.类名)
	 * 另一种是类名.class
	 * 最后 一种是类的对象名.getClass()(该方法继承自Object类)
	 * 推荐优先使用顺序为上面的排列顺序
	 * @param args
	 */
	public static void main(String[] args) {
		Tarbitrary tarbitrary = new Tarbitrary();
		Class<? extends Tarbitrary> clazz = tarbitrary.getClass();
		Class<?> clazz2 = tarbitrary.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz2);
		System.out.println(clazz2.getName());
		System.out.println(ClassInitDemo.class);
		try {
			Class<?> clazz3 = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
			System.out.println(clazz2==clazz3);
			System.out.println(clazz2==clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


