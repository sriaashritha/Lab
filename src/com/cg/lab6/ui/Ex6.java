package com.cg.lab6.ui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Ex6 {
	public static List<Integer> votersList(Map<Integer,Integer> k) {
		List<Integer> li=new ArrayList<>();
		Set<Integer>s=k.keySet();
		for(int i:s) {
			if(k.get(i)>=18) {
				li.add(i);
			}
		}
		return li;
	}
	public static void main(String[] args) {
		Map<Integer,Integer> ba =new HashMap<>();
		ba.put(11,8);
		ba.put(12,32);
		ba.put(13,88);
		ba.put(14,72);
		ba.put(15,9);
		ba.put(15, 32);
		System.out.println(votersList(ba));
	}

}
