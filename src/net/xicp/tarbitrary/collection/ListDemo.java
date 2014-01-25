package net.xicp.tarbitrary.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * List接口下面有很多实现类，其中最重要且最常用的要数<br/>
 * ArrayList与LinkedList <br/>
 * <table>
 * <tr>
 * 	<th>ArrayList</th><th>LinkedList</th>
 * </tr>
 * <tr>
 * 	<td>类似数组的数据结构</td>
 * 	<td>类似链表的数据结构</td>
 * </tr>
  * <tr>
 * 	<td>在随机访问的时候效率较高</td>
 * 	<td>在随机访问的时候效率较ArryList要低</td>
 * </tr>
  * <tr>
 * 	<td>频繁增删数据时ArrayList效率较低</td>
 * 	<td>频率增删数据时LinkedList效率较ArrayList要高</td>
 * </tr>
 * </table>
 * <h3 style="color:red">
 * 总结：在随机访问较多的时候用ArrayList较好，在增删操作比较频繁的时候
 * 建议使用LinkedList较好
 * </h3>
 * <div style="float:left">
 * <ul><li>ArrayList</li>
 * <li>类似数组的数据结构</li>
 * <li>在随机访问的时候效率较高</li>
 * <li>频繁增删数据时ArrayList效率较低</li></ul></div>
 * <div style="float:right">
 * <ul><li>LinkedList</li>
 * <li>类似链表的数据结构</li>
 * <li>在随机访问的时候效率较ArryList要低</li>
 * <li>频率增删数据时LinkedList效率较ArrayList要高</li></ul>
 * </div>
 * <div style="clear:both;"></div>
 * @author tuqiang
 */
public class ListDemo {

	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		list1.add("abc");
		list1.add("def");
		list1.add("ghi");
		
		list2.add("test");
		list2.add("hello");
		list2.add("world");
		
		
		for (String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		Iterator<String> it = list2.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		for (int i = 0; i < list1.size(); i ++) {
			System.out.println(list1.get(i));
		}
		
	}

}
