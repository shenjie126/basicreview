package net.xicp.tarbitrary.io;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class IOStreamDemo {

	public static void main(String[] args) {
		String st = Thread.currentThread().getContextClassLoader()
				.getResource("").getPath();
		String path = null;
		try {
			String myPath = URLDecoder.decode(st, "utf-8");
			path = myPath.replace("/bin/", "/src/");
			System.out.println(path);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		InputStreamDemo isd = new InputStreamDemo();
		isd.readMethodOne(path + "tuqiang.txt");
		System.out.println("**********************************");
		isd.readMethodTwo(path + "tuqiang.txt");

		System.out.println("写入文件");
		OutputStreamDemo osd = new OutputStreamDemo();
		osd.writeMethodOne(path + "tuqiang.txt");

	}

}
