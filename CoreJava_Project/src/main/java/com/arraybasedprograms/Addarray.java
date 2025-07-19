package com.arraybasedprograms;

import java.util.Arrays;

public class Addarray {

	public static void main(String[] args) 
	{
		 int a[] = { 1, 2, 3 };
		    int b[] = { 4, 5, 6 };


		    int n = a.length;

		    int c[] = new int[n];

		    for (int i = 0; i < n; i++)
		      c[i] = a[i] + b[i];

		    
		      System.out.println("Final array is " + Arrays.toString(c));

		
	}

}
