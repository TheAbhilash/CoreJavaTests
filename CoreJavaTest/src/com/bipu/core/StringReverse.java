package com.bipu.core;

public class StringReverse {

	public static void main(String[] args) {
		String a = "How are you today";
		
		String[] str = a.split(" ");
		
		for (int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i]+" ");
		}
	}
}
