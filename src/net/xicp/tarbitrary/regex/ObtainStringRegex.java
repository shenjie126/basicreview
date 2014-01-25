package net.xicp.tarbitrary.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取：将字符串中的符合规则的子串取出。
 * 操作步骤：
 * 1，将正则表达式封闭成对象
 * 2，让正则对象和要操作的字符串相关联
 * 3，关联后，　获取正则匹配引擎
 * 4，通过引擎对符合规则的子串进行操作，　比如取出
 */
public class ObtainStringRegex {
	public static void main(String[] args) {
		Obtain();
	}

	private static void Obtain() {
		String st = "To be or not to be , that's a question";
		String regex = "\\b[a-zA-Z']{3,}\\b";//\b在正则表达式中表示单词边界,加上一个反斜杠转义后就变成了\\b
		
		//1:将正则表达式封装成对象
		Pattern p = Pattern.compile(regex); 
		
		//2让正则对象和要操作的字符串相关联, 并获取关联对象（匹配引擎）
		Matcher matcher = p.matcher(st);
		
		//3对字符串进行操作
//		matcher.matches();//st.matches(regex);String的matcher内部实现原理就是这样
//		matcher.replaceAll("xxx");//st.replaceAll(regex, "xxx");String的replaceAll()方法内部实现原理就是这样
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.start() + "--->" + matcher.end());
		}
		
		
		
	}
	
	

}
