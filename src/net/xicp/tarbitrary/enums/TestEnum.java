package net.xicp.tarbitrary.enums;

import org.junit.Test;


public class TestEnum {
	@Test 
	public void testEnum() {
		System.out.println(Color.values());
		System.out.println(Color.BLUE.name());
		
		for (Color c : Color.values()) {
			System.out.println(c);
		}
		
		System.out.println(Color.RED.ordinal());
	}
	
	@Test
	public void testEnum1() {
		Week w = Week.valueOf("MON");
		System.out.println("temp is "  + w.getTemp());
		w.setTemp(10);
		System.out.println("temp is "  + w.getTemp());
		System.out.println("得到枚举实例的另一种方法");
		Week sun = Enum.valueOf(Week.class, "SUN");
		System.out.println("temp is "  + sun.getTemp());
		sun.setTemp(18);
		System.out.println("temp is "  + sun.getTemp());
	}
	
	@Test
	public void testEnum2() {
		Week2 w = Week2.valueOf("THU");
		System.out.println("调用里面的抽象方法");
		w.info();
		System.out.println("temp is " + w.getTemp());
	}

	@Test
	public void testEnum3() {
		Week3 w = Week3.valueOf("THU");
		System.out.println("调用里面的抽象方法");
		w.info();
		System.out.println("调用里面的公共方法");
		System.out.println("temp is " + w.getTemp());
		System.out.println("调用它们实现的接口里面的方法");
		w.say();
	}

}
