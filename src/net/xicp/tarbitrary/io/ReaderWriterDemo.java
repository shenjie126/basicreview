package net.xicp.tarbitrary.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;

/**
 * Reader, Writer皆为抽象类，　所有的字符流皆为它们的实际实现子类。
 * @author tuqiang
 *
 */
public class ReaderWriterDemo {

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
		ReaderWriterDemo rwd = new ReaderWriterDemo();
		rwd.read1(path);
		System.out.println("*******************************");
		System.out.println("*******************************");
		rwd.read2(path);
		rwd.write(path);
	}
	
	public void read1(String path) {
		Reader reader = null;
		try {
			reader = new FileReader(path);
			char[] buf = new char[1024];
			int len = 0; 
			StringBuffer sb = new StringBuffer("");
			while ((len = reader.read(buf))!=-1) {
				sb.append(new String(buf, 0, len));
			}
			
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void read2(String path) {
		Reader reader = null;
		try {
			reader = new FileReader(path);
			int len = 0; 
			StringBuffer sb = new StringBuffer("");
			
			while((len = reader.read())!=-1) {
				char c = (char)len;
				sb.append(c);
			}
			
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void write(String path) {
		try {
			String str = "\r\n别来春半，触目柔肠断。砌下落梅如雪乱，拂了一身还满。\r\n雁来音信无凭，路遥归梦难成。离恨恰如春草，更行更远还生。";
			Writer writer = new FileWriter(path, true);//true表示在文件末尾写入。而如果只写path的话是重新写入。
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
