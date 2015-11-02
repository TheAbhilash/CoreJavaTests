package com.bipu.collection;

import java.util.Comparator;

public class Person implements Comparable<Object>{

	private int person_id;
	private String name;
	
	@Override
	public int compareTo(Object o) {

		Person p =(Person)o;
		
		//return this.person_id - p.person_id;
		return this.name.compareTo(p.name);
	}

	public int getPerson_id() {
		return person_id;
	}

	public String getName() {
		return name;
	}

	public Person(int person_id, String name){
		this.person_id = person_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Id:"+person_id+","+"Name:"+name;
	}
	
	public static Comparator<Person> IdComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return (int)(o1.person_id-o2.person_id);
		}
	};
	
public static Comparator<Person> NameComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	};
}
