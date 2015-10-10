package com.bipu.core;


public class StringTest2 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] second= new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2 > 0)
			{
				second[i]=a[i];
			}
		}
		
		for (int i = 0; i < second.length; i++) {
			System.out.print(second[i]+",");
		}
		
		System.out.println("");
		System.out.println(2%2);
	}
}
