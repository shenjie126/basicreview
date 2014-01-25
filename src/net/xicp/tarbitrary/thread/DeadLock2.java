package net.xicp.tarbitrary.thread;

public class DeadLock2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basket2 basket = new Basket2();
		Consumer2 consumer = new Consumer2(basket);
		Producer2 producer = new Producer2(basket);
		
		new Thread(consumer, "生产者一").start();
		new Thread(consumer, "生产者二").start();
		new Thread(consumer, "生产者三").start();
		
		new Thread(producer, "消费者一").start();
		new Thread(producer, "消费者二").start();
		new Thread(producer, "消费者三").start();
		

	}

}

class SteamedBuns2 {
	public static int count;

	private int id;

	{
		count++;
		id = count;
	}

	public int getId() {
		return id;
	}

}

class Basket2 {
	public SteamedBuns2[] sbs = new SteamedBuns2[20];

	private int index = 0;

	public synchronized void push(SteamedBuns2 sb) {
		while (index == 20) {
			System.out.println("筐子已经被装满了。");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//this.notifyAll();如果不加这一句就会造成死锁。

		sbs[index] = sb;
		index++;
		System.out.println(Thread.currentThread().getName() + "生产了第" + sb.getId() + "个馒头");

	}

	public synchronized SteamedBuns2 pop() {
		while (index == 0) {
			System.out.println("筐子里面的馒头已经被吃完了。");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notifyAll();
		SteamedBuns2 sb = sbs[index - 1];
		sbs[index - 1] = null;
		index--;
		System.out.println(Thread.currentThread().getName() + "吃掉了第" + sb.getId() + "个馒头");
		return sb;
	}
}

class Producer2 implements Runnable {
	private Basket2 basket;

	Producer2(Basket2 basket) {
		this.basket = basket;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				SteamedBuns2 sb = new SteamedBuns2();
				basket.push(sb);
			}
		}
	}

}

class Consumer2 implements Runnable {
	private Basket2 basket;
	
	Consumer2(Basket2 basket) {
		this.basket = basket;
	}

	@Override
	public void run() {
		while(true) {
			basket.pop();
		}
	}
}