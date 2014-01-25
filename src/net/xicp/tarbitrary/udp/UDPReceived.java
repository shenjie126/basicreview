package net.xicp.tarbitrary.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceived {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			byte[] buf = new byte[1024];
			DatagramSocket ds = new DatagramSocket(8888);
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String st = new String(dp.getData(), 0, dp.getLength());
			String sr = new String(buf, 0, dp.getLength());
			System.out.println(st);
			System.out.println( dp.getAddress() + ":" + dp.getPort());
			System.out.println(sr);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
