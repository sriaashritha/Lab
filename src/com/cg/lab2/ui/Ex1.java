package com.cg.lab2.ui;
public class Ex1 {
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
	public static void main(String args[]){  
		int a[]={23,43,56,78};  
		int b[]={10,07,13,11,17};  
		System.out.println("Second smallest: "+getSecondSmallest(a,4));  
		System.out.println("Second smallest: "+getSecondSmallest(b,5));  
		}
	} 
