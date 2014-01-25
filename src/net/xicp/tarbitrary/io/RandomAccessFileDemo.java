package net.xicp.tarbitrary.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = null;
		try {
			path = URLDecoder.decode(st, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = path.substring(0, path.lastIndexOf('/'));
		String myPath = new File(path).getParentFile().getPath();
		System.out.println(path);
		System.out.println(s);
		System.out.println(myPath);
		
		randomAccessFileWrite(myPath + File.separator + "src" + File.separator+ "tarbitrary.txt");
		randomAccessFileRead(myPath + File.separator + "src" + File.separator+ "tarbitrary.txt");

	}
	
	public static void randomAccessFileWrite(String path) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(path, "rw");//定义为读写模式，如果文件不存在， 会自动创建
			int a = "hello中".getBytes().length;
			System.out.println(a);
			raf.writeBytes("天中");
			System.out.println("天中".getBytes().toString());
			raf.writeInt(23);
			
			raf.writeBytes("tarbitrary");
			raf.writeInt(22);
			
			raf.writeBytes("test");
			raf.writeInt(1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void randomAccessFileRead(String path) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(path, "r");//定义为读取模式，如果文件不存在， 会自动创建
			int a = "天中".getBytes().length;
			System.out.println("a" + a);
			raf.skipBytes(2 + 4);
			byte[] b = new byte[10];
			
			raf.read(b);
			int v = raf.readInt();
			String s = new String(b);
			System.out.println(s);
			System.out.println(v);
			
			raf.seek(0);
			b = new byte[2];
			
			raf.read(b);
			v = raf.readInt();
			System.out.println(new String(b));
			System.out.println(v);
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
