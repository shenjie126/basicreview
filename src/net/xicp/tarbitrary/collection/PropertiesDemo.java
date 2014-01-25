package net.xicp.tarbitrary.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("abc", "涂");
		pro.put("def", "强");
		String st = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String sr = null;
		try {
			sr = URLDecoder.decode(st,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sr);
		String sb  =sr.replace("/bin", "/src");
		try {
			pro.store(new FileOutputStream(sb + "/Pro.properties"), "将properties文件的属性写入文件");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("Pro.properties"));
			System.out.println(p.get("abc"));
			System.out.println(p.get("def"));
			System.out.println(p.getProperty("test", "没有就输出这行字"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
