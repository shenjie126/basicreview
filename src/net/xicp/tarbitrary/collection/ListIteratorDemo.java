package net.xicp.tarbitrary.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	/**
	 * ListIterator接口与Iterator接口的最大不同之处在于，它可以向前遍历，但前提是
	 * 必须得先向后遍历一遍才能向前遍历。
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("abc");
		list1.add("def");
		list1.add("ghi");
		
		ListIterator<String> li = list1.listIterator();
	
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
