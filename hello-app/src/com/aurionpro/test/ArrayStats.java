package com.aurionpro.test;
import java.util.*;
public class ArrayStats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[args.length];
		for(int i=0;i<args.length;i++) {
			a[i] = Integer.parseInt(args[i]);
		}

		System.out.println("Sum is: "+sum(a));
		System.out.println("Average is: "+avg(a));
		System.out.println("Minimum is: "+min(a));
		System.out.println("Maximum is: "+max(a));
		System.out.println("Median is: "+median(a));
		freq(a);
	}
	
	public static int sum(int a[]) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static double avg(int a[]) {
		double average = sum(a)/a.length;
		return average;
	}
	
	public static int min(int a[]) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static int max(int a[]) {
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static double median(int a[]) {
		int half = a.length/2;
		Arrays.sort(a);
		double median = 0;
		if(a.length%2!=0) {
			median = a[half];
		}
		else {
			median = (a[half-1]+a[half+1])/2.0;
		}
		return median;
	}
	
	public static void freq(int a[]) {
		int freq[] = new int[a.length];
		for(int i=0;i<=a.length-1;i++) {
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count+=1;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(freq[i]!=-1) {
				System.out.println(a[i]+" frequency is "+freq[i]);
			}
		}
	}
}
