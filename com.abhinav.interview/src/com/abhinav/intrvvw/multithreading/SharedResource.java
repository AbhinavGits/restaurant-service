package com.abhinav.intrvvw.multithreading;

public class SharedResource {
	
	private int data;
    private boolean available = false;
    
    public synchronized void produce(int value) {
    	while (available) {
    		try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	data = value;
    	System.out.println("Produced:"+data);
    	available=true;
    	notify();
    }
	
	public synchronized void consume() {
			
		while(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed:"+data);
		available = false;
		notify();
	}

}
