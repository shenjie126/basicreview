package net.xicp.tarbitrary.io;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class MyPath {
	public static String getPath() {
		String st = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = null;
		try {
			String myPath = URLDecoder.decode(st,"utf-8");
			path = myPath.replace("/bin/", "/src/");
			System.out.println(path);
			path = path + "tuqiang.txt";
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
}
