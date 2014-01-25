package net.xicp.tarbitrary.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector是线程安全的，相对ArrayList来说Vector效率较低
 * @author tuqiang
 *
 */
public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.addElement("abc");
		vector.add("def");
		vector.add(0, "tuqiang");
		
		Enumeration<String> enums = vector.elements();
		
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement());
		}
	}

}
