package com.ect.testcases;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i, no, first = 0, second = 1, next;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		no = sc.nextInt();
		
		System.out.println("Fibonacci Series are: ");
		for(i=0; i<no; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
			
		}
	}

}


