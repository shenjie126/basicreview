package net.xicp.tarbitrary.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class TCPClient {

	public static void main(String[] args) {
		Socket s = null;
		BufferedReader bf = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		if (args.length < 2) {
			System.out.println("invalidate parameter");
			return;
		} else {
			try {
				s = new Socket(/* InetAddress.getByName(args[0]) */args[0],
						Integer.parseInt(args[1]));
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				bf = new BufferedReader(new InputStreamReader(is));
				br = new BufferedReader(new InputStreamReader(System.in));
				pw = new PrintWriter(os, true);

				while (true) {
					String st = br.readLine().trim();
					System.out.println(st);
					pw.println(st);
					if (st.equalsIgnoreCase("quit")) {
						break;
					} else {
						System.out.println(st + "---" + bf.readLine());
					}
				}

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("byebye");
				try {
					pw.close();
					br.close();
					bf.close();
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
