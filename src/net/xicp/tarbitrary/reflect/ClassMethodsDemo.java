package net.xicp.tarbitrary.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassMethodsDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		getMethod();
		getAllMethods();
		System.out.println("得到所有的方法包括私有的");
		getAllDeclaredMethods();
	}
	
	public static void getMethod() throws Exception {
		Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		Method method = clazz.getMethod("getAge", null);//第一个参数为方法名称，后面的可变参数为方法参数的类的字节码，如果无参则传null
		Method method2 = clazz.getMethod("setAge", int.class);
		Method method3 = clazz.getMethod("say", null);
		//非公共的方法不能通过此方法得到．并且会抛异常
		//Method method4 = clazz.getMethod("myAge", null);
		Method method5 = clazz.getDeclaredMethod("say", null);//得到非公共的方法
		method5.invoke(null, null);
		method2.invoke(tarbitrary, 3);
		System.out.println("*************************");
		method.invoke(tarbitrary, null);//无参则调用时传null
		System.out.println("***********调用静态方法*****************");
		method3.invoke(null, null);//静态方法第一个调用者参数可以传null也可以像调用普通方法一样传递类的实例对象进去
		method3.invoke(tarbitrary, null);
	}
	
	public static void getAllMethods() throws Exception {
		Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		Method[] methods = clazz.getMethods();//此方法不能得到一个类中的私有方法．如果要连私有方法也得到应该调用getDeclaredMethods()
		for (Method m : methods) {
			int a = m.getModifiers();
			String st = Modifier.toString(a);
			String sr = m.getName();
			Class[] cl = m.getParameterTypes();
			Class<?> ct = m.getReturnType();
			System.out.print(st + " " +  ct.getName().substring(ct.getName().lastIndexOf(".")+1) + " " +sr );
			System.out.print("参数：" );
			for (Class c : cl) {
				System.out.print(c.getName() + " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void getAllDeclaredMethods() throws Exception {
		Class<?> clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			int a = m.getModifiers();
			String st = Modifier.toString(a);
			String sr = m.getName();
			Class[] cl = m.getParameterTypes();
			Class<?> ct = m.getReturnType();
			System.out.print(st + " " +  ct.getName().substring(ct.getName().lastIndexOf(".")+1) + " " +sr );
			System.out.print("参数：" );
			for (Class c : cl) {
				System.out.print(c.getName() + " ");
			}
			System.out.println("");
		}
		
	}
	
	
	

}
