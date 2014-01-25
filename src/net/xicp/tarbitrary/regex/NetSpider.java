package net.xicp.tarbitrary.regex;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetSpider {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		mailAddressCapture2();
	}
	
	public static void mailAddressCapture1() throws IOException {
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		
		BufferedInputStream bis = new BufferedInputStream(
				NetSpider.class.getResourceAsStream("/mailtest.txt"));
		
		byte[] buf = new byte[1024];
		int len = 0;
		
		Pattern p = Pattern.compile(regex);
		
		while((len = bis.read(buf)) != -1){
			String st = new String(buf, 0, len);
			Matcher m = p.matcher(st);
			
			while (m.find()) {
				System.out.println(m.group());
			}
			
		}
		
		bis.close();
	}
	
	public static void mailAddressCapture2() throws IOException {
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		URL url = new URL("http://202.114.176.31/asp/grade/MyScore.asp?Submit=查询&textfield=0910312107");
		//URL ur2 = new URL("202.114.176.31/asp/grade/frameset.htm?textfield=0910312107&Submit=%B2%E9%D1%AF");
		String s = URLEncoder.encode("查询", "gb2312");
		System.out.println(s);
		String rt =new String("查询".getBytes("UTF-8"));
		System.out.println(rt);
		/*String a = URLDecoder.decode("%B2%E9%D1%AF", "gb2312");
		String bc = URLDecoder.decode("%B2%E9%D1%AF");
		

		String b = new String("%B2%E9%D1%AF".getBytes("UTF-8"), "gb2312");
		System.out.println("a" + a + b + bc);*/
		URLConnection uc = url.openConnection();
		
		//url.getContent();
		
		BufferedInputStream bis = new BufferedInputStream(
			uc.getInputStream());
		
		byte[] buf = new byte[1024];
		int len = 0;
		
		Pattern p = Pattern.compile(regex);
		
		while((len = bis.read(buf)) != -1){
			String st = new String(buf, 0, len);
			System.out.println(st);
			Matcher m = p.matcher(st);
			
			while (m.find()) {
				System.out.println(m.group());
			}
			
		}
	}
}
