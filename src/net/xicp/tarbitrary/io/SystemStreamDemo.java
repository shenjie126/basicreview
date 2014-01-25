package net.xicp.tarbitrary.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * 系统流
 * 主要包括System.in System.out System.err
 * System.in得到键盘的输入流
 * System.out、System.err向屏幕输出的流
 * 其中System.err是用于打印错误信息的
 * @author tuqiang
 *
 */
public class SystemStreamDemo {
	public static void main(String[] args) {
//		readFromKeyboard();
		readFromKeyboard2();
		sysOutput();
		sysRedirect(MyPath.getPath());
	}
	
	public static void readFromKeyboard() {
		InputStream is = System.in ;
		try {
			System.out.println("请输入内容");
			int b = (int)is.read();
			System.out.println("接受的输入的ASCII码为：" + b);
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void readFromKeyboard2() {
		InputStream is = System.in;
		byte[] buf = new byte[1024];
		System.out.println("请输入一句话");
		try {
			int len = is.read(buf);
			String st = new String(buf, 0, len);
			System.out.println(st);
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sysOutput() {
		try {
			Integer.parseInt("fjeofe");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("***********************");
			System.out.println(e);
			System.out.println("***********************");
			System.err.println(e);
			
		}
	}
	
	public static void sysRedirect(String path) {
		try {
			System.setOut(new PrintStream(new FileOutputStream(path,true)));
			System.out.println("使用打印流的重定向输出");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


