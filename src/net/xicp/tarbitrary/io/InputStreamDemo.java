package net.xicp.tarbitrary.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream为所以字节输入流的父类，　此类为一个抽象类，　不能实例化，　只能依赖于子类
 * 的实例化。所有的字节输出流像FileInputStream等都是IputStream的实际实现子类。
 * @author tuqiang
 *
 */
public class InputStreamDemo {

	public void readMethodOne(String path) {
		InputStream is = null;
		try {
			is = new FileInputStream(path);
			byte[] buf = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer("");
			while ((len = is.read(buf)) != -1) {
				if (len == 0) {
					System.out.println("没有数据可读");
					break;
				}
				sb.append(new String(buf, 0, len) + "\r\n");
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
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 此方法不适用于读取汉字。
	 * @param path
	 */
	public void readMethodTwo(String path) {
		InputStream is = null;
		try {
			File file = new File(path);
			is = new FileInputStream(file);
			int temp = 0;
			StringBuffer sb = new StringBuffer(""); 
			while((temp=is.read())!= -1) {
				byte b = (byte) temp;
				sb.append(b);
			}
			
			
			System.out.println(sb.toString());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
