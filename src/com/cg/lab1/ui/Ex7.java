package com.cg.lab1.ui;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int num;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a num: ");
		num=sc.nextInt();
		
		int currentDigit=num%10;
		num=num/10;
		
		while(num>0) {
			if(currentDigit<=num%10) {
				flag=true;
				break;
			}
			currentDigit=num%10;
			num=num/10;
		}
		if(flag) {
			System.out.print("NUM IS IN INCREASING ORDER");
		}else {
			System.out.print("NUMBER IS IN DECREASING ORDER");
		}
		sc.close();
	
	}

}
