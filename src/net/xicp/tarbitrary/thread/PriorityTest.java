package net.xicp.tarbitrary.thread;

public class PriorityTest {
	public static void main(String[] args) {
		/**
		 * 主线程的优先级是normal
		 * 由于线程A的优先级比较低，　所以cpu分给它的时间片相对较优先级高的线程B来说要少一些。
		 */
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		ThreadDemo4 td = new ThreadDemo4();
		Thread t1 = new Thread(td, "线程A");
		Thread t2 = new Thread(td, "线程B");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}
}

class ThreadDemo4 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}