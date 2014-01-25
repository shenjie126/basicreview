package net.xicp.tarbitrary.thread;

public class diy{
	public static void main(String[] args) {
		new Test().main(null);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					//System.out.println("hello");
				}
			}
		}).start();
	}
	
	
}
