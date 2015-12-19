package com.bipu.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {

	static class PQsort implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,5,3,7,6,9,8};
		
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		
		for (Integer x : a) {
			pq1.offer(x);
		}
		
		for (Integer x : a) {
			System.out.print(pq1.poll()+" ");
		}
		System.out.println(" ");
		PQsort pq = new PQsort();
		PriorityQueue<Integer> pq2=new PriorityQueue<>(pq);
		
		for (Integer x : a) {
			pq2.offer(x);
		}
		
		for (Integer x : a) {
			System.out.print(pq2.poll()+" ");
		}
	}
}
