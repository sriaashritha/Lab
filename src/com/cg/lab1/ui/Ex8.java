package com.cg.lab1.ui;
import java.util.Scanner;

public class Ex8 {
	int num;
	boolean flag=false;
	public int power(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num" );
		num=sc.nextInt();
		while(num!=1) {
			if(num%2==0) {
				
				num=num/2;
			}
			System.out.println("num is power of 2");
		}
		System.out.println("number is not power of 2");
		sc.close();
		return num;
	}

	public static void main(String[] args) {
		Ex8 obj=new Ex8();
		obj.power();	

	}

}
