package com.cg.lab5.ui;
import java.util.Scanner;
class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	private String salary;
	public MyException(String salary) {
		this.salary=salary;
	}
	public String toString()
	{
		return salary;
	}
}
public class Ex3 {
		public static void main(String args[])
		{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Salary:");
		 Double salary=scan.nextDouble();
		try {
			if(salary<3000) 
			{
				System.out.println("Salary="+salary);
				throw new MyException("Invalid salary");
			}
			else
				System.out.println("Salary="+salary);
				System.out.println("valid Salary");
		}
		catch(MyException a) {
			System.out.println(a);
		}
	}
}