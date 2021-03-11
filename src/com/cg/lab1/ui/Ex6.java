package com.cg.lab1.ui;
import java.util.Scanner;
public class Ex6 {
	int i,sum1=0,j,sum2,diff;
	public int squares() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			i=i*i;
			sum1=sum1+i;
		}
		System.out.println("sum of squares is :"  +sum1);
		for(int j=0;j<=n;j++) {
			sum2=sum2+j;
			sum2=sum2*2;
		}
		System.out.println("square of sum is" +sum2);
		diff=sum2-sum1;
		System.out.println("difference is " +diff);
		sc.close();
		return n;	
	}
	public static void main(String args[]) {
		Ex6 obj=new Ex6();
		obj.squares();
	}
	

}

