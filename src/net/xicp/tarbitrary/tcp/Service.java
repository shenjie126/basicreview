package net.xicp.tarbitrary.tcp;

import java.net.Socket;
import java.io.*;

public class Service implements Runnable {
	private Socket s = null;

	public Service(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os, true);
			
			while (true) {
				String st = br.readLine();
				/*System.out.println(st);
				if (null == st) {
					System.out.println("null");
					break;
				}*/
				if (null == st || st.trim().equalsIgnoreCase("quit")) {
					break;
				}
				StringBuilder sr = new StringBuilder(st).reverse();
				pw.print(st + "--->");
				pw.println(new String(sr));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("i'm finally");
			try {
				pw.close();
				br.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
