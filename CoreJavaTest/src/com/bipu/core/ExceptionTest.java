package com.bipu.core;

public class ExceptionTest {

	public void doStuff() throws MyException{
		try {
			throw new MyException("Custom Exception");
		} catch (MyException e) {
			throw e;
		}
	}
	
	public void callMethod() throws MyException{
		doStuff();
	}
	
	public static void main(String[] args) throws MyException {
		ExceptionTest test = new ExceptionTest();
		test.callMethod();
	}
}
