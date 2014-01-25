package net.xicp.tarbitrary.regex;

import java.util.Scanner;

public class CheckTelephone {

	/**
	 * @param args
	 * @author tuqiang
	 *正则表达式 , 功能:
	 *1: 匹配
	 *2: 替换
	 *3: 切割
	 *4：获取
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String st = scanner.nextLine();
			if (st.equals("quit")) {
				scanner.close();
				break;
			} 
			if (check(st)) {
				System.out.println("电话号码正确");	
			} else {
				System.out.println("电话号码格式非法,必须为11位数字!");
			}   
		}
		
		
		
	}

	private static boolean check(String st) {
		boolean flag = false;
		String regex = "1[358]\\d{9}";
		if (st.trim().isEmpty()) {
			return flag;
		} else if (st.trim().matches(regex)) {
				flag =  true;
		}
		return flag;
	}

}
