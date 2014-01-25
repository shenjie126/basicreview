package net.xicp.tarbitrary.io;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class FileDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL url1 = Thread.currentThread().getContextClassLoader().getResource("");
		String url2 = System.getProperty("user.dir");
		String url3, url4 = null;
		try {
			url3 = URLDecoder.decode(url1.toString(), "utf-8");
			url4 = URLDecoder.decode(url1.getPath(), "utf-8");
			System.out.println(url3);
			System.out.println(url4);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(url1);
		System.out.println(url2);
		
		createFile(url4 + File.separator +"test.txt");
		createFile("D:" + File.separator + "abc" + File.separator + "cd.txt");
		deleteFile("d:\\" + File.separator + "test");
		deleteFile("D:" + File.separator + "abc" + File.separator + "cd.txt");
		
		File file = new File("D:\\", "cre.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file2 = new File("D:\\");
		File file3 = new File(file2, "myfile.txt");
		
		System.out.println("***************");
		list("d:\\");
		System.out.println("IIIIIIIIIIIIIII");
		listFiles("d:\\");
	
	}
	
	public  static void createFile(String path) {
		File file = new File(path);
		if (file.exists()&&file.isFile()) {
			System.out.println("文件已存在");
			return;
		}
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		} 
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		} else {
			System.out.println("文件路径不存在");
		}
	}
	
	public void getPath() {
		URL url = FileDemo01.class.getClassLoader().getResource("tarbitrary.properties");
		URL url2 = FileDemo01.class.getClassLoader().getResource("");
		URL url3 = FileDemo01.class.getResource("");
		URL url4 = FileDemo01.class.getResource("/");
		URL url5 = Thread.currentThread().getContextClassLoader().getResource("");
		System.out.println(url5);
		System.out.println(url5.getPath());
		
		System.out.println(url3);
		System.out.println(url4);
		System.out.println(url2.getPath());
		String path = url.getPath();
		System.out.println(url);
		System.out.println(path);
		try {
			String st = URLDecoder.decode(path, "utf-8");
			System.out.println(st);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void list(String path) {
		File file = new File(path);
		String[] sts = file.list();
		for (String s : sts) {
			System.out.println(s);
		}
		
	}
	
	public static void listFiles(String path) {
		File file = new File(path);
		File[] sts = file.listFiles();
		for (File s : sts) {
			System.out.println(s.getPath());
		}
		
	}
}
