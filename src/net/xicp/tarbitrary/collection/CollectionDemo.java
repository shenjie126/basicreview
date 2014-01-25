package net.xicp.tarbitrary.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Collection接口下面有两个主要的子接口
 * 一为List, 一为Set
 * List接口里面能添加重复的元素，　
 * 而set里面不能有相同的元素。
 * @author tuqiang
 *
 */
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> col1 = new ArrayList<String>();
		Collection<String> col2 = new HashSet<String>();
		
		col1.add("who");
		col1.add("are");
		col1.add("you");
		col1.add("?");
		col2.add("I'm");
		col2.add("tarbitrary");
		col2.add("!");
		
		boolean b = col1.contains("w");
		boolean b1 = col1.contains("who");
		System.out.println(b);
		System.out.println(b1);
		
		Iterator<String> it1 = col1.iterator();
		Iterator<String> it2 = col2.iterator();
		col2.remove("!");
		System.out.println(col2);
		
		System.out.println(col1);
		
		while(it1.hasNext()) {
			String s = it1.next();
			if("are".equals(s)) {
				/*下面的第一句会报异常，因为itreator()方法会把整个集合
				 * 都给了迭代器，在迭代的时候用Collection的移除方法会
				 * 报异常，可以用Iterator接口的remove()方法才能安全移除
				 */
				//col1.remove(s);
				it1.remove();
			}
			System.out.println(s);
		}
		
		System.out.println("**************");
		System.out.println(col1);
		
/*		col2.clear();
		System.out.println("调用clear方法之后：" + col2);
		System.out.println(col2.isEmpty());*/
		System.out.println(col2.toArray());
		Object[] a = col2.toArray();
		String[] s = col2.toArray(new String[]{});
		String[] si = {"abc"}; 
		String[] s1 = col1.toArray(si);
		System.out.println("s的内容");
		
		for(String st : s) {
			System.out.print(st + " ");
		}
		System.out.println();
		System.out.println("s1的内容: " );
		for (String st : s1) {
			System.out.print(st + " ");
		}
	}

}
