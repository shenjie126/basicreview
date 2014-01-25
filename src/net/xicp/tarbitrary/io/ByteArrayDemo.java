package net.xicp.tarbitrary.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ByteArrayInputStream ByteArrayOutputStream内存流 站在内存的角度分析 ByteArrayInputStream
 * 往内存里面放信息----输入 ByteArrayOutputStream 内存里的信息往外写----输出
 * 这个与java里面其它的流处理类都是站在程序的角度来看问题的不同。
 * 
 * @param args
 */
public class ByteArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ByteArrayDemo bad = new ByteArrayDemo();
		String st = "\r\n帘外雨潺潺,春意阑珊。罗衾不耐五更寒。梦里不知身是客,一晌贪欢。";
		String sr = "\r\n独自莫凭栏,无限江山。别时容易见时难。流水落花春去也,天上人间!";
		byte[] buf = (st + sr).getBytes();
		byte[] buf2 = (st + sr).getBytes();
		bad.read(buf);// 往内存写入数据
		bad.write(buf2);
		
		System.out.println("使用内存流转换输入的单词");
		
		String tmp = "abcdefghijklmnopq";
		byte[] src = tmp.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(src);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		transform(in, out);
		System.out.println(new String(out.toByteArray()));

	}

	/*
	 * 相对内存来说是写入
	 */
	public void read(byte[] buf) {
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		int len = bais.read();
		/*
		 * String st = new String(buf, 0, len); System.out.println(st);
		 * System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		 * System.out.println(bais.toString());
		 */try {
			bais.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write(byte[] buf) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int len = 0;

		try {
			baos.write(buf);
			System.out.println("***********************");
			System.out.println(baos.toString());
			System.out.println("***********************");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		byte[] b = baos.toByteArray();
		System.out.println("other method");
		System.out.println(new String(b));
	}

	public static void transform(InputStream in, OutputStream out) {
		int ch = 0;
		try {
			while ((ch = in.read()) != -1) {
				int upperCh = Character.toUpperCase(ch);
				out.write(upperCh);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
