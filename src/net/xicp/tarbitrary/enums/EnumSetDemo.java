package net.xicp.tarbitrary.enums;

import java.util.EnumSet;

public class EnumSetDemo {

	/**EnumSet没有构造方法，只能通过静态方法来得到实例。
	 * @param args
	 */
	public static void main(String[] args) {
		EnumSet<Week3> es = EnumSet.allOf(Week3.class);
		es.add(Week3.FRI);
		es.add(Week3.MON);
		es.add(Week3.SUN);
		
		for (Week3 w : es) {
			System.out.println(w.name() + "---->" + w.ordinal());
		}
	}

}
