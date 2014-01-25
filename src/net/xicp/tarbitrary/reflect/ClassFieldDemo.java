package net.xicp.tarbitrary.reflect;

import java.lang.reflect.Field;

public class ClassFieldDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		getField();
		System.out.println("**********************");
		getFields();
	}
	
	public static void getField() throws Exception {
		Class clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		//下面这种形式只能得到公共的字段．
		Field fTel = clazz.getField("tel");
		fTel.set(tarbitrary, "19900808");//调用其set方法，第一个参数为调用的对象实例，第二个参数为要传进set方法的参数
		System.out.println(fTel.get(tarbitrary));//调用其get方法
		
		//得到包访问权限及私有访问和protected权限的方法,但在调用私有成员变量的get及set方法时私有成员变量要先调用fAge.setAccessible(true)否则抛异常;
		Field fName = clazz.getDeclaredField("name");
		Field fNickName = clazz.getDeclaredField("nickName");
		Field fAge = clazz.getDeclaredField("age");
		fName.set(tarbitrary, "tarbitrary");
		System.out.println(fName.get(tarbitrary));
		fAge.setAccessible(true);
		fAge.set(tarbitrary, 20);//从没有打印调用得到年龄这句话看来，此方法将20直接赋给成员变量age，而不是通过调用setAge(20)方法来赋值的
		System.out.println(fAge.get(tarbitrary));
		fNickName.set(tarbitrary, "tq");
		System.out.println(fNickName.get(tarbitrary));
	}
	
	public static void getFields() throws Exception {
		Class clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		//得到所有公共成员变量
		Field[] fields = clazz.getFields();
		for (Field f : fields) {
			System.out.println(f.getName());
		}
		//得到所有成员变量
		Field[] fis = clazz.getDeclaredFields();
		for (Field f : fis) {
			System.out.println(f.getName());
		}
	}

}
