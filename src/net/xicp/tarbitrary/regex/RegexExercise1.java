package net.xicp.tarbitrary.regex;

public class RegexExercise1 {
	public static void main(String[] args) {
		String st = "我我.....要......要...要要学.....编编编编...编程";
		st = st.replaceAll("\\.+", "");
		st = st.replaceAll("(.)\\1+", "$1");
		
		System.out.println(st);
		
	}
}
