package com.aurionpro.model;

public class BlockSynchronization {
	public void print(int n) {
		synchronized (this) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
