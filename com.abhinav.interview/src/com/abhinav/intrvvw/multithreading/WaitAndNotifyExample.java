package com.abhinav.intrvvw.multithreading;

public class WaitAndNotifyExample {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		
		Thread producer = new Thread(() -> {
			for (int i = 1; i<10; i++) {
			resource.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		});
		
		Thread consumer = new Thread(() -> {
			for(int i=1;i<10;i++) {
				resource.consume();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}

}
