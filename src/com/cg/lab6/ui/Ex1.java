package com.cg.lab6.ui;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	public static List<String> getValues(HashMap<String, String> ee) {
		List<String> mm=new ArrayList<>();
		 Collection<String> list=ee.values();
		 mm.addAll(list);
		 Collections.sort(mm);
		 return mm;
	}
	public static void main(String[] args) {
		HashMap<String, String> ee = new HashMap<>();
		 ee.put("Teja", "18");
		 ee.put("manu", "35");
		 ee.put("Aash", "62");
		 ee.put("raju", "11");
		 System.out.println(getValues(ee));
	 }
	}
