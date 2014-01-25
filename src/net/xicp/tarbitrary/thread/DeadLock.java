package net.xicp.tarbitrary.thread;

import java.util.concurrent.TimeUnit;

public class DeadLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo5 td1 = new ThreadDemo5(0);
		ThreadDemo5 td2 = new ThreadDemo5(1);
		
		new Thread(td1, "买家").start();
		new Thread(td2, "卖家").start();

	}

}

class ThreadDemo5 implements Runnable {
	public static String a = "", b = "abc";
	public int flag = 0;
	
	ThreadDemo5(int flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if (flag == 0) {
			synchronized(a) {
				System.out.println(Thread.currentThread().getName() + "你先把货过我再付钱");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(b) {
					System.out.println(Thread.currentThread().getName() + "success");
				}
			}
		} else {
			synchronized(b) {
				System.out.println(Thread.currentThread().getName() + "你先把钱付清我再给你货");
				synchronized(a) {
					System.out.println(Thread.currentThread().getName() + "success");
				}
			}
		}
		
	}
	
}