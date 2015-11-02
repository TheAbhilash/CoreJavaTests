package com.bipu.collection;

import java.util.Arrays;


public class PersonData {

	public static void main(String[] args) {
		Person[] p = new Person[4];
		p[0]=new Person(10, "Abhilash");
		p[1]=new Person(8, "Rajesh");
		p[2]=new Person(13, "Pratyush");
		p[3]=new Person(17, "Piyush");
		
		Arrays.sort(p);
		
		System.out.println(Arrays.toString(p));
		
		Arrays.sort(p, Person.IdComparator);
		System.out.println(Arrays.toString(p));
		
		Arrays.sort(p, Person.NameComparator);
		System.out.println(Arrays.toString(p));
	}
}
