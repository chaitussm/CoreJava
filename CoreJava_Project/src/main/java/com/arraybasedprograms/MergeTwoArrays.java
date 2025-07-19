package com.arraybasedprograms;

import java.util.Arrays;

public class MergeTwoArrays 
{
	public static int[] MergeArray(int[] a , int[] b )
	{
		int length_a = a.length;
		int length_b = b.length;
		int length_c = length_a + length_b;
		int[] c = new int[length_c];
		int temp = 0;
		for(int i = 0 ; i<a.length; i++)
		{
			c[i] = a[i];
		}
		
		for(int i = 0; i<b.length; i++)
		{
			c[length_a + i] = b[i];
		}
		
		for(int i = 0; i< length_c ; i++)
		{
			for(int j = i +1 ; j< length_c ; j++)
			{
				
			
			if(c[i] > c[j]) 
			{
				
			
			   temp = c[i];
			   c[i] = c[j];
			   c[j] = temp;
			
			}
			}
		}
		
		return c;
	}

	public static void main(String[] args) 
	{
		int[] a = {1,2,3};
		int[] b = {41,6,0};
		
		
		System.out.println(Arrays.toString(MergeArray(a,b)));
		
	}

}
