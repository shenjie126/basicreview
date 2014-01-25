package net.xicp.tarbitrary.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * OutputStream为所以字节输出流的父类，　此类为一个抽象类，　不能实例化，　只能依赖于子类
 * 的实例化。所有的字节输出流像FileOutputStream等都是OutputStream的实际实现子类。
 * @author tuqiang
 *
 */
public class OutputStreamDemo {
	
	public void writeMethodOne(String path) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(path, true);
			String st = "\r\n帘外雨潺潺,春意阑珊。罗衾不耐五更寒。梦里不知身是客,一晌贪欢。";
			String sr = "\r\n独自莫凭栏,无限江山。别时容易见时难。流水落花春去也,天上人间!";
			try {
				os.write(st.getBytes());
				os.write(sr.getBytes());
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
