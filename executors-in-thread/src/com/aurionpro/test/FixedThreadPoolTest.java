package com.aurionpro.test;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
import com.aurionpro.model.*;

public class FixedThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new FixedThreadPool(1));
		executorService.execute(new FixedThreadPool(2));
		executorService.execute(new FixedThreadPool(3));

		executorService.shutdown();
	}
}
