package net.xicp.tarbitrary.regex;

import java.util.Scanner;

/*
 * 切割
 */
public class SplitDemo {
	public static void main(String[] args) {
		Object obj;
		//String[] arrs = splitRegex("abc   def jhi    i  j", " +");//按空格来切割
		
		/*按.来切割, 由于.在正则表达式中表示任意个字符。所以在正则表达式中的
		.号用\.表示， 又由于在java中\是特殊字符需要转义所以最终结果写成\\.
		*/
//		String[] arrs = splitRegex("test.def.jhi.i.j", "\\.");
		
		//String[] arrs = splitRegex("c:\\user\\e", "\\\\");//反斜杠转义
		//String[] arrs = splitRegex("fec://user//e", "//");//正斜杠转义
		
		/*
		 * 按照叠词完成切割。
		 * 可以将规则封装成一个组， 用()完成。组的出现都有编号
		 * 从1开始想要使用已有的组可以用\n(n就是组的编号)的形式
		 * 来获取。 加上java转义就是\\n
		 */
		String[] arrs = splitRegex("abefcccghfe--5++660feijjklmnopppqrsooooot", "(.)\\1+");
		
		
		for (String st : arrs) {
			System.out.println(st);
		}
		
		
	}

	private static String[] splitRegex(String st, String regex) {
		return st.split(regex);
	}
}
