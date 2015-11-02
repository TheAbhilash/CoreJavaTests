package com.bipu.core;

public class TestHash {

	static int a = 12;
	int b;
	
	public static void main(String[] args) {
		System.out.println(TestHash.a);
		TestHash t1 = new TestHash();
		TestHash t2 = new TestHash();
		System.out.println(t1.equals(t2));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestHash other = (TestHash) obj;
		if (b != other.b)
			return false;
		return true;
	}
}
