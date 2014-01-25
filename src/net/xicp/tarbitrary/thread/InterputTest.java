package net.xicp.tarbitrary.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InterputTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo1 td1 = new ThreadDemo1();
		Thread t = new Thread(td1,"强哥创建的线程");
		t.start();
		Thread.sleep(10000);
		t.interrupt();
	}
}


class ThreadDemo1 implements Runnable {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 0; i < 50; i ++) {
			System.out.println(Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(new Date().toLocaleString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
	}
	
}
