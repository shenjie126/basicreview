package net.xicp.tarbitrary.regex;

public class ReplaceDemo {

	/**
	 * @param args
	 * 正则表达式
	 * 替换功能演示
	 */
	public static void main(String[] args) {
		String st = "fjefjefo123545,fejeo3949540jgrogrj45405tfjr-=-990009";
		replaceRegex(st, "\\d{5,}", "*");//将连续五个（包含五个）以上的数字替换成为*
		
		String sr = "aaadff5349584u4tkkkfjeiffjeio4545949-9999ddddiiiifjefijjjj";
		replaceRegex(sr, "(.)\\1+", "~");
		replaceRegex(sr, "(.)\\1+", "$1");//$1用来在正则表达式外面得到第一组的内容
		
	}
	
	public static void replaceRegex(String st, String regex, String replacement) {
		st = st.replaceAll(regex, replacement);
		System.out.println(st);
	}

}
