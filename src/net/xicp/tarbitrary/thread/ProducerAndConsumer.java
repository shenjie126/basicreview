package net.xicp.tarbitrary.thread;


public class ProducerAndConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basket basket = new Basket();
		Producer producer = new Producer(basket);
		Consumer consumer = new Consumer(basket);

		new Thread(producer, "生产者一").start();
		new Thread(producer, "生产者二").start();
		new Thread(producer, "生产者三").start();

		new Thread(consumer, "消费者一").start();
		new Thread(consumer, "消费者二").start();
		new Thread(consumer, "消费者三").start();

	}

}

class Producer implements Runnable {
	private Basket basket;

	Producer(Basket basket) {
		this.basket = basket;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i ++) {
			synchronized (Producer.class) {
				basket.push(produce());
				/*try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}

	public SteamedBuns produce() {
		return new SteamedBuns();
	}

}

class Consumer implements Runnable {
	private Basket basket;

	Consumer(Basket basket) {
		this.basket = basket;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i ++){
			synchronized(this) {
				basket.pop();
			}
		}
	}

}

class SteamedBuns {
	private static int id;
	private int myid;

	{
		id++;
		myid = id;
	}

	public  int getId() {
		return myid;
	}

}

class Basket {
	public SteamedBuns[] sbs = new SteamedBuns[20];
	public static int index = 0;

	public synchronized void push(SteamedBuns sb) {
		while (index == 20) {
			System.out.println("筐里面装满了、");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notifyAll();

		sbs[index] = sb;
		index++;
		System.out.println(Thread.currentThread().getName() + "生产了第"
				+ sb.getId() + "个馒头");

	}

	public synchronized SteamedBuns pop() {
		while (index == 0) {
			try {
				System.out.println("筐子里面的馒头被吃完了。");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notifyAll();

		SteamedBuns sb = sbs[index - 1];
		sbs[index - 1] = null;
		index--;
		System.out.println(Thread.currentThread().getName() + "吃掉了第"
				+ sb.getId() + "个馒头");

		return sb;
	}
}