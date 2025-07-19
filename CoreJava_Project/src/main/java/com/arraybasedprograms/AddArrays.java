package com.arraybasedprograms;

import java.util.Arrays;

public class AddArrays 
{
	public static void addArrays(int[] a, int[] b)
	{
		int n = a.length;

	    int c[] = new int[n];

	    for (int i = 0; i < n; i++)
	    c[i] = a[i] + b[i];

	    
		
		
		System.out.println(Arrays.toString(c));
      }

	public static void main(String[] args) 
	{
		int[] a = {1,2,3};
		int[] b = {1,1,1};
		
		
		addArrays(a, b);
		

	}

}
