package net.xicp.tarbitrary.regex;

public class MailValidate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "23@sina.com";
		String sr = "1@1.1";
		String regex = "\\w+@\\w+(\\.\\w+)+";//相对不太精确的匹配
		String regex1 = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//相对精确点的匹配
		
		
		boolean b = st.matches(regex);
		if (st.matches(regex)) {
			System.out.println("邮箱格式正确！");
		} else {
			System.out.println("邮箱格式错误");
		}
		
		if (sr.matches(regex)) {
			System.out.println("邮箱格式正确！");
		} else {
			System.out.println("邮箱格式错误");
		}
		
		System.out.println("------------------------------");
		
		if (st.matches(regex1)) {
			System.out.println("邮箱格式正确！");
		} else {
			System.out.println("邮箱格式错误");
		}
		
		if (sr.matches(regex1)) {
			System.out.println("邮箱格式正确！");
		} else {
			System.out.println("邮箱格式错误");
		}

	}

}
