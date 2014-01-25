package net.xicp.tarbitrary.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i ++) {
			System.out.println(Thread.currentThread().getName() + "正在运行。" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
