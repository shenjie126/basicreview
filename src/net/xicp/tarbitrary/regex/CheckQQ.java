package net.xicp.tarbitrary.regex;

import java.util.Scanner;

public class CheckQQ {

	/**
	 * @param args
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
				System.out.println("qq号码正确");	
			} else {
				System.out.println("qq号码格式非法,必须为0-15位数字, 且不能以0开头!");
			}   
		}
		
		
		
	}

	private static boolean check(String st) {
		boolean flag = false;
		String regex = "[1-9][0-9]{4,14}";
		if (st.trim().isEmpty()) {
			return flag;
		} else if (st.trim().matches(regex)) {
				flag =  true;
		}
		return flag;
	}

}
