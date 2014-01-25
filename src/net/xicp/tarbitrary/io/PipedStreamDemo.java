package net.xicp.tarbitrary.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * PipedInputStream, PipedOutputStream管道流，
 * 主要用于进程间的通信。
 * @author tuqiang
 *
 */
public class PipedStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recive recive = new Recive();
		Send send = new Send();
		try {
			/**
			 * 在通信前必须先进行管道连接，将输入输出的管道进行相连才能完成后续的通信。
			 */
			send.getPos().connect(recive.getPipedInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(send).start();
		new Thread(recive).start();
	}

}

class Recive implements Runnable {
	private PipedInputStream pis = new PipedInputStream();;
	
	public PipedInputStream getPipedInputStream() {
		return this.pis;
	}
	
	public void receive() {
		byte[] buf = new byte[1024];
		int len = 0;
		StringBuffer sb = new StringBuffer("");
		try {
			while((len = pis.read(buf))!=-1) {
				sb.append(new String(buf, 0, len));
			}
			System.out.println("接受的信息为：" + sb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

	@Override
	public void run() {
		receive();
	}
	
}

class Send implements Runnable {
	private PipedOutputStream pos =  new PipedOutputStream();;

	public PipedOutputStream getPos() {
		return pos;
	}
	
	public void send() {
		String st = "管道流主要用于线程间的通信";
		try {
			pos.write(st.getBytes());
			pos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		send();
	}
}

