package com.aurionpro.model;

public class ThreadJoin extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
