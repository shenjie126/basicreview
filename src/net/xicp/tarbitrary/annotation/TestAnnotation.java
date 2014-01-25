package net.xicp.tarbitrary.annotation;

import java.lang.annotation.Annotation;

@MyAnnotation(age=3,color=Color.WHITE,myarray={"tarbitrary", "tuqiang"},value="fjei")
public class TestAnnotation {
	@Override
	public String toString() {
		return "hello world";
	}
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("net.xicp.tarbitrary.annotation.TestAnnotation");
		Annotation[] annos = clazz.getAnnotations();
		
		for (Annotation an : annos) {
			System.out.println(an.annotationType());
			System.out.println(an.toString());
			System.out.println(an.getClass());
		}
		
	}
	
}
