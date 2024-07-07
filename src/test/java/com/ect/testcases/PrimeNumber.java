package com.ect.testcases;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int no, i, fect = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		no = sc.nextInt();

		if (no == 1) {
			System.out.println("The lowest prime number is 2");
		}

		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (no == i) {
			System.out.println("Prime Number");
		}

	}

}
