package net.xicp.tarbitrary.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {
	private ServerSocket ss = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			new ReverseServer().init(0);
		} else {
			int c = Integer.parseInt(args[0]);
			new ReverseServer().init(c);
		}
	}

	private void init(int port) {
		System.out.println("port" + port);
		try {
			if (port == 0) {
				ss = new ServerSocket(7777);
			} else {
				ss = new ServerSocket(port);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = true;

		while (flag) {
			try {
				Socket s = ss.accept();
				new Thread(new Service(s)).start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
