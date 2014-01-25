package net.xicp.tarbitrary.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassInstancetInitDemo {

	/**
	 * 得到 类的字节码有三种方式一种是Class.forName(包名.类名)
	 * 另一种是类名.class
	 * 最后 一种是类的对象名.getClass()(该方法继承自Object类)
	 * 推荐优先使用顺序为上面的排列顺序
	 * @param args
	 */
	public static void main(String[] args) {
		testInit1();
		System.out.println("***************************");
		testInit2();
		System.out.println("***************************");
		testInit3();
		
	}
	
	public static void testInit1() {
		try {
			Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
			Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();//只适用于有无参构造方法的类的实例化否则会抛异常
			System.out.println(tarbitrary.toString());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testInit2() {
		try {
			Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.TuQiang");
			Constructor<?> con = clazz.getConstructor(int.class,String.class,String.class);
			TuQiang tq = (TuQiang) con.newInstance(22,"涂强","15549438499");
			System.out.println(tq);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testInit3() {
		try {
			Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.ShiShuiLiu");
			Constructor[] cons = clazz.getConstructors();
			
			for (Constructor con : cons) {
				Class[] cl = con.getParameterTypes();
				if (cl.length == 0) {
					ShiShuiLiu ssl = (ShiShuiLiu) con.newInstance();
					System.out.println(ssl);
				} else {
					int len = cl.length;
					Object[] params = new Object[len];
					for (int i = 0; i < len; i ++) {
						if ("int".equals(cl[i].getName())) {
							params[i] = 22;
						} else if ("java.lang.String".equals(cl[i].getName())) {
							params[i] = "tarbitrary";
						}
					}
					ShiShuiLiu ssl = (ShiShuiLiu) con.newInstance(params);
					System.out.println(ssl);
				}
			}
			//Constructor<?> con = clazz.getConstructor(int.class,String.class,String.class);
			//TuQiang tq = (TuQiang) con.newInstance(22,"涂强","15549438499");
			//System.out.println(tq);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


