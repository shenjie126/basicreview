package net.xicp.tarbitrary.runtimeandsystem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;

public class RunTimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process p = Runtime.getRuntime().exec("notepad");
			BufferedWriter br = new BufferedWriter(
					new OutputStreamWriter(p.getOutputStream()));
			br.write("abcdfef");
			br.flush();
			br.close();
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
