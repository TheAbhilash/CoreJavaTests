package com.bipu.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog1 implements Serializable{

	transient private Collar1 theCollar;
	private int dogSize;
	
	public Dog1(Collar1 c, int size){
		theCollar = c;
		dogSize = size;
	}
	
	public Collar1 getCollar(){
		return theCollar;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException{
		try{
		os.defaultWriteObject();
		os.writeInt(theCollar.getCollarSize());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is){
		try {
			is.defaultReadObject();
			theCollar = new Collar1(is.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Collar1 c = new Collar1(10);
		Dog1 d = new Dog1(c, 8);
		System.out.println("Before :"+d.getCollar().getCollarSize());
		
		FileOutputStream fout = new FileOutputStream("G:\\test3.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(d);
		oout.close();
		
		FileInputStream fin = new FileInputStream("G:\\test3.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		d = (Dog1)oin.readObject();
		System.out.println("After :"+d.getCollar().getCollarSize());
	}
	
}
class Collar1{
	private int collarSize;
	public Collar1(int size){
		collarSize = size;
	}
	public int getCollarSize(){
		return collarSize;
	}
}
