package com.bipu.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<String, String> tm = new TreeMap<String,String>();
		tm.put("a", "ant");
		tm.put("d", "dog");
		tm.put("h", "horse");
		tm.put("c", "cat");
		
		SortedMap<String, String> submap = tm.subMap("a", "g");
		submap.put("b", "ball");
		
		System.out.println(tm+"..."+submap);
		
		SortedMap<String, String> submap1 = tm.headMap("d",true);
		System.out.println(submap1);
	}
}
