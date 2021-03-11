package com.cg.lab6.ui;
import java.util.HashMap;
import java.util.Set;
public class Ex4 {
	public HashMap<String,String> getStudent(HashMap<String,Integer> stu){
		 HashMap<String,String> medal = new HashMap<>();
         Set<String> set = stu.keySet();
         for(String s:set) {
        	 Integer marks = stu.get(s);
             if(marks>=90) {
            	 medal.put(s,"Gold"); 
             }
             else if(marks >=80) {
            	 medal.put(s,"Silver");
             }
             else if(marks>=70) {
            	 medal.put(s,"Bronze");
             }
         }
         return medal;
	}
	public static void main(String[] ar) {
		HashMap<String,Integer> stu = new HashMap<>();
        Ex4 p = new Ex4();
        stu.put("aash",65);
        stu.put("min",76);
        stu.put("Aditya",89);
        stu.put("manu",90);
        stu.put("teja",93);
        System.out.println(p.getStudent(stu));
	}

}
