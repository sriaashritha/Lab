package com.cg.lab6.ui;
import java.util.ArrayList;
import java.util.Collections;
public class Ex5 {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i:arr){
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(getSecondSmallest(arr));
	}

}
