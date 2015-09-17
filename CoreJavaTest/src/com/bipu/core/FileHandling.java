package com.bipu.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {
 
	public static void main(String[] args) throws IOException {
		File myDir = new File("G:\\myDir");
		myDir.mkdir();
		File myFile = new File(myDir, "test.txt");
		myFile.createNewFile();
		PrintWriter pw = new PrintWriter(myFile);
		pw.println("New file1");
		pw.println("New file2");
		pw.println("New file3");
		pw.flush();
		pw.close();
		
		FileReader reader = new FileReader(myFile);
		BufferedReader br = new BufferedReader(reader);
		
		String s;
		
		while ((s = br.readLine())!=null) {
			System.out.println(s);
		}
		
		br.close();
		
		File file = new File("myDir", "newName.txt");
		myFile.renameTo(file);
		
		File newDir = new File("newDir");
		myDir.renameTo(newDir);
	}
}
