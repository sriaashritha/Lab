package com.cg.lab1.ui;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String trafficLight=sc.nextLine();
		switch(trafficLight){
			case "RED":
				System.out.print("STOP");
				break;
			case "YELLOW":
				System.out.print("GET READY");
				break;
			case "GREEN":
				System.out.print("GO");
				break;
		}
		sc.close();
	}

}
