package interview;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a =0, b=1;
		
		System.out.print(a +" "+b);
		
		int c; 
		
		for(int i =1; i<=n; i++)
		{
			c = a + b;
			System.out.print(" "+ c);
			
			a = b; 
			b= c; 
			
		}
		

	}

}
