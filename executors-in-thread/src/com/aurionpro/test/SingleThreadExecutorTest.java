package com.aurionpro.test;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import com.aurionpro.model.SingleThreadExecutor1;
import com.aurionpro.model.SingleThreadExecutor2;

public class SingleThreadExecutorTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new SingleThreadExecutor1());
		executorService.execute(new SingleThreadExecutor2());
		
		executorService.shutdown();
	}
}
