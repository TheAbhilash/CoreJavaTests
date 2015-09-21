package com.bipu.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public interface SerializarExample {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat c = new Cat();
		c.color = "white";
		c.name = "Kitty";

	FileOutputStream fout = new FileOutputStream("G:\\test.txt");
	ObjectOutputStream oout = new ObjectOutputStream(fout);
	oout.writeObject(c);
	
	FileInputStream fin = new FileInputStream("G:\\test.txt");
	ObjectInputStream oin = new ObjectInputStream(fin);
	Cat c1 = (Cat) oin.readObject();
	System.out.println(c1.color);
	System.out.println(c1.name);
}
}

class Cat implements Serializable{
	String color;
	String name;
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
}