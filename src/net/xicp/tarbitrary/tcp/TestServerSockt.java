package net.xicp.tarbitrary.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TestServerSockt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8008);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			os.write("hello tarbitrary(强哥)".getBytes());
			String st = br.readLine();
			System.out.println(st.trim());
			
			br.close();
			os.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
