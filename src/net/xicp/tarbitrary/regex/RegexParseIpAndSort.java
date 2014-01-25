package net.xicp.tarbitrary.regex;

import java.util.TreeSet;

public class RegexParseIpAndSort {
	public static void main(String[] args) {
		init();
	}
	
	/*
	 * 192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.108 18.30.90.10
	  　解题思路：先将ip地址的每一段都变成三位，　再按照字符串顺序排序。
	  　1.　按照每一段需要的最多的０进行补齐，　那么每一段都会保证至少有3位
	  　2.  将每一段只保留3位。这样，　所有的ip地址都是每一段3位。
	 */
	private static void init() {
		String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.108 18.30.90.10";
		
		ip = ip.replaceAll("(\\d+)", "00$1");//补零
		ip = ip.replaceAll("0*(\\d{3})", "$1");//截取最低三位
		
		String[] sr = ip.split(" +");
		TreeSet<String> ts = new TreeSet<String>();
	
		for (String si : sr) {
			ts.add(si);
		}
		
		for (String s : ts) {
			System.out.println(s.replaceAll("0*(\\d+)", "$1"));
		}
		
		
//		System.out.println(ip);
	}
}
