package net.xicp.tarbitrary.reflect;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class ClassSetterAndGetterDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		getterAndSetterTest();
		System.out.println("自动得到所有的get和set方法");
		allSetterAndGetterMethods();
	}
	
	public static void getterAndSetterTest() throws Exception {
		Class clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		
		PropertyDescriptor pd = new PropertyDescriptor("age", clazz);
		pd.getReadMethod().invoke(tarbitrary,null);
		pd.getWriteMethod().invoke(tarbitrary, 18);
	}
	
	public static void allSetterAndGetterMethods() throws Exception{
		Class clazz = Class.forName("net.xicp.tarbitrary.reflect.Tarbitrary");
		Tarbitrary tarbitrary = (Tarbitrary) clazz.newInstance();
		BeanInfo bis = Introspector.getBeanInfo(Tarbitrary.class);
		PropertyDescriptor[] ppts = bis.getPropertyDescriptors();
		for (PropertyDescriptor ppt : ppts) {
			if (ppt.getName().equals("name")) {
				ppt.getWriteMethod().invoke(tarbitrary, "who are you");
				Method method = ppt.getReadMethod();
				System.out.println(method.invoke(tarbitrary));
			}
		}
	}

}
