package com.bipu.core;

import java.io.File;
import java.io.IOException;

public class IOOperations {

	public static void main(String[] args) {
		File file = new File("G:\\Java & Related\\TestFiles\\New_file.txt");
		boolean newFile=false;
		try {
			newFile=file.createNewFile();
			System.out.println(newFile);
			System.out.println("File Exist :"+file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
