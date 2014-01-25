package net.xicp.tarbitrary.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		read(MyPath.getPath());
		read2(MyPath.getPath());
	}
	
	public static void read(String path) {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		byte[] buf = new byte[1024];
		try {
			int len = bis.read(buf);
			System.out.println(new String(buf, 0, len));
			bis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void read2(String path) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(path)));
			int len = 0;
			while((len = br.read())!=-1) {
				char c = (char) len;
				System.out.print(c);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}
