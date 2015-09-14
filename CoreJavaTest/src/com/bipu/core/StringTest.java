package com.bipu.core;

public class StringTest {

	public static void main(String[] args) {
		String s ="    abhilash   ";
		
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.toString());
		System.out.println(s.trim());
		
		StringBuffer sb = new StringBuffer("0123456789");
		System.out.println("sb="+sb);
		System.out.println(sb.append(" Numbers"));
		System.out.println(sb.delete(2, 4));
		System.out.println(sb.insert(2, "-----"));
		System.out.println(sb.reverse());
	}
}
