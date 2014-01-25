package net.xicp.tarbitrary.thread;

public class ThreadTest1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt,"线程一").start();
		new Thread(mt,"线程二").start();
		new Thread(mt,"线程三").start();
	}
}
