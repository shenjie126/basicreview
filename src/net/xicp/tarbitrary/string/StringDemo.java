package net.xicp.tarbitrary.string;

public class StringDemo {
	public static void main(String[] args) {
		String st = "TOM:89|JERRY:90|TONY:99";
		
		String sr[] = st.split("\\|");
		
		for (String s : sr) {
			System.out.println(s.replaceAll(":", " --->"));
		}
		
		String mail = "tar@sina.com";
		String validate = "\\w+@\\w+(\\.\\w+)+";
		
		if (mail.matches(validate)) {
			System.out.println("匹配成功");
		}
	}
}
