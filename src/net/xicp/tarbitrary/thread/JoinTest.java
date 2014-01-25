package net.xicp.tarbitrary.thread;


public class JoinTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo3 td1 = new ThreadDemo3();
		Thread t = new Thread(td1,"线程A");
		t.start();
		t.join();//将线程合并
		for (int i = 0; i < 10; i ++) {
			System.out.println(Thread.currentThread().getName());
		}
		

	}

}

class ThreadDemo3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i ++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
	
}