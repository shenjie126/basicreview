package net.xicp.tarbitrary.thread;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class Test {
	public static  boolean flag = false;
	public static boolean dosthflag = false;
	public static Thread t = null;
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		Thread th = new Thread(new Thread1(sb));
		th.setDaemon(true);
		Thread tr = new Thread(new Thread2());
		th.setPriority(Thread.MAX_PRIORITY);
		//new Thread(new Thread1()).start();
		tr.start();
		th.start();
	
	
	}
}

class Thread1 implements Runnable {
	private StringBuilder sb;

	public Thread1(StringBuilder sb) {
		super();
		this.sb = sb;
	}



	@Override
	public void run() {
		/*System.out.println("dosomething");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束吧");
		Test.flag = false;*/
		Test.t = Thread.currentThread();
		doThat();
		
	}
	
	
	
	public void doThat() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("hello");
		try {
			TimeUnit.SECONDS.sleep(3);
			//System.out.println("我要继续睡");
			//TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("我要唤醒了");
		synchronized (Test.class) {
			Test.flag = true;
			Test.class.notifyAll();
		}
		
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		doThat();
		System.out.println("hello");
	}
	
	public   void doThat() {
		System.out.println("ceshi");
		synchronized (Test.class) {
			System.out.println("diy");
			try {
					Test.class.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("我结束了");
			/*if (Test.t != null) {
				Test.t.interrupted();
			}*/
			
		}
		
	}
}
