package com.cg.lab6.ui;
import java.util.HashMap;
import java.util.Map;
public class Ex2 {
	public void register(char c[]) {
		Map<Character,Integer> me =new HashMap<>();
		for(char c1:c) {
			if(me.containsKey(c1)) {
				int a=me.get(c1);
				me.put(c1,a+1);
			}
			else {
				me.put(c1,1);
			}
		}
		System.out.println(me);
	}
	public static void main(String[] args) {
		String str = "sri aashritha";
		char arr[]=str.toCharArray();
		Ex2 obj=new Ex2();
		obj.register(arr);

	}
	

}
