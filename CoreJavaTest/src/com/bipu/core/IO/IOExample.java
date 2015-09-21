package com.bipu.core.IO;

import java.io.File;

public class IOExample {

	public static void main(String[] args) {
		File file = new File("G:\\Java & Related");
		String[] files = file.list();
		
		for ( String fn: files) {
			System.out.println(fn);
		}
	}
}
