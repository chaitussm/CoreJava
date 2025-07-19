package com.StringBased.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountStringUsingMap 
{
    //general way of using Hashmap
	public static void CountString(String str)
	{
		
		char[] words = str.toCharArray();
		
		
		
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for(Character ch : words)
		{
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch) + 1);
			}
			
			else 
			{
				charmap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charmap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entrySet ) 
	       {
	    	   System.out.println(entry.getKey() + ":" + entry.getValue());
	    	   
	       }
		
		
		
	}
	
	//Using Split method and for loop
	public static int CountWordsInString(String str)
	{
		int count = 0;
		
		String[] arr = str.split(" ");
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println("Words in the string are " + arr[i]);
			count++;
		}
		
		return count;
	}
	
	//Using HashMap to count words
	public static int CountWordsUsingMap(String str)
	{
		int count = 0;
		
		String[] arr = str.split(" ");
		
		Map<String , Integer> strmap = new HashMap<String , Integer>();
		
		for(String ele : arr)
		{
			if(strmap.containsKey(ele))
			{
				strmap.put(ele, strmap.get(ele) + 1);
			}
			
			else 
			{
				strmap.put(ele , 1);
			}
		}
		
		Set<Map.Entry<String,Integer>> entryset = strmap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entryset)
		{
			System.out.println(entry.getKey() + "======" + entry.getValue());
			count++;
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		//CountString("This this is is anitha");
		int count = CountWordsInString("This this is is anitha");
		
		System.out.println(count);
		
		int strcount = CountWordsUsingMap("This this is is anitha");
		
		System.out.println(strcount);
	}

}
