package com.ect.testcases;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.print("Entered value is: ");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Entered value is even");
		}
		else {
			System.out.println("Entered value is odd");
		}

	}

}
