package com.cg.lab1.ui;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0,a;
		System.out.print("enter number:");
		int num=sc.nextInt();
		while(num>0) {
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		System.out.print("SUM OF CUBES OF DIGITS OF N NUM :" +sum);
		sc.close();
	}

}
