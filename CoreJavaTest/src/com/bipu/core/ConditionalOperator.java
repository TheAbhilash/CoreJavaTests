package com.bipu.core;

public class ConditionalOperator {

	public static void main(String[] args) {
		int sizeOfYard = 10;
		int numOfPets = 5;
		
		String status = (numOfPets < 4) ? "Pet count okay" : (sizeOfYard > 8) ? "pet limit on the edge":"too many pets";
		System.out.println(status);
	}
}
