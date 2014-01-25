package net.xicp.tarbitrary.enums;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnumMap<Week3, String> em = new EnumMap<Week3, String>(Week3.class);
		em.put(Week3.MON, "星期一");
		em.put(Week3.FRI, "星期五");
		em.put(Week3.WED, "星期三");
		
		for (Entry<Week3,String> entry : em.entrySet()) {
			System.out.println(entry.getKey());
			entry.getKey().say();
			entry.getKey().info();
			System.out.println(entry.getKey().getTemp());
			System.out.println(entry.getValue());
		}
		
	}

}
