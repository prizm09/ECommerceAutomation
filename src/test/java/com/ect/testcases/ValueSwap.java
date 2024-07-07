package com.ect.testcases;

import java.util.Scanner;

public class ValueSwap {
	
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		b = sc.nextInt();
		
		System.out.println("Before swapping values");
		System.out.println("A: " + a + " B: " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping values");
		System.out.println("A: " + a + " B: " + b);
		
	}

}
