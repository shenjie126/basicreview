package net.xicp.tarbitrary.regex;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CopyOfNetSpider1 {

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
				CopyOfNetSpider1.class.getResourceAsStream("/mailtest.txt"));
		
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
		URL url = new URL("http://127.0.0.1:8080/mail/mailtest.html");
		URL ur2 = new URL("http://www.douban.com/group/topic/8045949/");
		URLConnection uc = ur2.openConnection();
		
		//url.getContent();
		
		BufferedInputStream bis = new BufferedInputStream(
			uc.getInputStream());
		
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
	}
}
