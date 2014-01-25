package net.xicp.tarbitrary.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map接口包含键值对，常用实现类有HashMap,HashTable,TreeMap 前面两个是散列存放的，后者为排序存放。Map中的key不能重复。
 * HashTable是与List接口下的Vector同一时代的，都是线程安全的 而ArrayList与HashMap则都是非线程安全的，但它们的操作效率要
 * 较“前辈”们高得多。
 * 
 * @author tuqiang
 * 
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("aaa", "test");
		map.put("BBB", "test");
		map.put("BBB", "test");
		map.put("CCC", "test");
		System.out.println(map);

		Set<Entry<String, String>> sets = map.entrySet();
		Iterator<Entry<String, String>> it = sets.iterator();
		
		while(it.hasNext()) {
			Entry<String,String> entry = it.next();
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}
		
		for(Entry<String,String> en : map.entrySet()) {
			System.out.println(en.getKey() + " ---->" + en.getValue());
		}

	}

}
