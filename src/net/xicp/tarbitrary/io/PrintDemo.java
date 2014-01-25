package net.xicp.tarbitrary.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 打印流主要包括PrintStream, PrintWriter
 * 主要就是多了一个print方法
 * 利用println()方法可以方便的进行换行输出
 * 打印流属于装饰类，　根据实例化其子类不同，完成的打印功能也不同
 * @author tuqiang
 *
 */
public class PrintDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		print(path);
		print2(path);
		
		
		
	}
	
	
	public static void print(String path) {
		try {
			PrintStream ps = new PrintStream(new FileOutputStream(path, true));
			ps.println();
			ps.println("这是用打印流的println()方法打印的文字");
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void print2(String path) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(path, true));
			pw.println("测试打印流的printf方法");
			pw.printf("姓名%s, 年龄%d", "涂强", 22);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


