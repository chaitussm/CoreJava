package com.SetComparatorBased.Programs;

public class ComparableBased {

	public static void main(String[] args) 
	{

         System.out.println("A".compareTo("Z"));
         System.out.println("Z".compareTo("K"));
         System.out.println("A".compareTo("A"));
         // Note: after Java 1.7, null is not allowed in set-based interfaces
         System.out.println("compareTo(null) throws NullPointerException");

	}

}
