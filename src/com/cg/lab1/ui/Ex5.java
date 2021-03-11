package com.cg.lab1.ui;

import java.util.Scanner;

public class Ex5 {
	int sum=0,n;
	public int calculateSum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			if(sum%3==0 || sum%5==0) {
				System.out.println(sum);
			}	
		}
		System.out.println(sum);
		sc.close();
		return n;	
	}
	public static void main(String[] args) {
		Ex5 sc=new Ex5();
		sc.calculateSum();
	}

}
