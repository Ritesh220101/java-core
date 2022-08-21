package com.aurionpro.test;

import com.aurionpro.model.RunnableThread;

public class RunnableThreadTest {

	public static void main(String[] args) {
		RunnableThread runnable = new RunnableThread();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
