package com.ect.testcases;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int no,fect=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		
		for(int i=1; i<=no; i++) {
			fect=fect*i;
		}
		System.out.println("Factorial of " + no + " is: " + fect);
	}

}
