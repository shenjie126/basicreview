package net.xicp.tarbitrary.thread;


public class YieldTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo2 td1 = new ThreadDemo2();
		ThreadDemo2 td2 = new ThreadDemo2();
		new Thread(td1,"线程A").start();
		new Thread(td2,"线程B").start();

	}

}

class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i ++) {
			System.out.println(Thread.currentThread().getName() + i);
			if (i % 5 == 0) {
				Thread.yield();//让出当前cpu的时间片，让别的线程执行　
			}
		}
	}
	
}