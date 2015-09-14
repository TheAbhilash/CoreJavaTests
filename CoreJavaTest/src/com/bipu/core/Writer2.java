package com.bipu.core;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {

	public static void main(String[] args) {
		char[] in = new char[11];
		
		int size = 0;
		
		File file = new File("G:\\Java & Related\\TestFiles\\New_file2.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write("how are you");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println(size);
			for (char c : in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
