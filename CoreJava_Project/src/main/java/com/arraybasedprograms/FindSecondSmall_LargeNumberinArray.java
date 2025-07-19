package com.arraybasedprograms;

import java.util.Arrays;

public class FindSecondSmall_LargeNumberinArray {

	public static void getSecondLargest(int[] a){  
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] >  a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }
		      System.out.println(Arrays.toString(a));
		      System.out.println("second largest number is " + a[total-2]); 
		}  
	
	public static void getSecondSmallest(int[] a){  
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] <  a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		      System.out.println(Arrays.toString(a));
		      System.out.println("second smallest number is " + a[total-2]); 
		}  
		public static void main(String args[]){  
		int a[]={5,9,10,-4};  
		int b[]={5,9,10,-4};  
		 
		FindSecondSmall_LargeNumberinArray.getSecondLargest(b);
		FindSecondSmall_LargeNumberinArray.getSecondSmallest(b);
		
		}}  

