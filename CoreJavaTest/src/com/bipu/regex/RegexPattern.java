package com.bipu.regex;

import java.util.Scanner;

public class RegexPattern {
	public static void main(String[] args) {
		
		System.out.print("Input :");
		System.out.flush();
		
		try {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String token;
			String input = s.nextLine();
			
			do {
				token = s.findInLine(input);
				System.out.println("Found :"+token);
			} while (token!=null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
