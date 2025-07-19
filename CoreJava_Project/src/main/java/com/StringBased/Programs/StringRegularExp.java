package com.StringBased.Programs;

public class StringRegularExp {

	public static void main(String[] args) 
	{
		String s = "Anitha is working in TCS";
		
		String latest = s.replace("is", "was");
		
		System.out.println(latest);
		
		String e = "Rama456";
		
		String num = e.replaceAll("[0-9(.)]", "");
		
		System.out.println(num);
		
        String alp = e.replaceAll("[a-zA-Z(.)]", "");
		
		System.out.println(alp);
		
		
		
		

	}

}
