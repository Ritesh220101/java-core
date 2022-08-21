package com.aurionpro.model;

public class MethodSynchronization {
	public synchronized void print(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
