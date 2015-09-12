package com.bipu.core;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 20;
		
		int series[] = new int[number];
		
		series[0]=0;
		series[1]=1;
		
		for (int i = 2; i < number; i++) {
			series[i]=series[i-1]+series[i-2];
		}
		
		for (int i = 0; i < series.length; i++) {
			System.out.print(series[i]+" ");
		}
	}
}
