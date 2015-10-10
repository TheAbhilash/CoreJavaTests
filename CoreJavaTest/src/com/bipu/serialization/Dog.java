package com.bipu.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{

	private Collar theCollar;
	private int dogSize;
	
	public Dog(Collar collar, int size){
		theCollar = collar;
		dogSize = size; 
	}
	
	public Collar getCollar(){
		return theCollar;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Collar c = new Collar(10);
		Dog d = new Dog(c, 8);
		
		System.out.println("Before :"+d.getCollar().getCollarSize());
		
		FileOutputStream fout = new FileOutputStream("G:\\test2.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(d);
		oout.close();
		
		FileInputStream fin = new FileInputStream("G:\\test2.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		d = (Dog) oin.readObject();
		System.out.println("After :"+d.getCollar().getCollarSize());
		
	}
}
class Collar{
	private int collarSize;
	public Collar(int size){
		collarSize = size;
	}
	public int getCollarSize(){
		return collarSize;
	}
}
