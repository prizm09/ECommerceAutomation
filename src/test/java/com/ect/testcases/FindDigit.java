package com.ect.testcases;

import java.util.Scanner;

public class FindDigit {

	public static void main(String[] args) {
		int a = 0,no;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		no = sc.nextInt();
		
		if(no<0) {
			no = no * -1;
		}
		else if(no == 0) {
			no = 1;
		}
		while(no>0) {
			no = no/10;
			a++;
		}
		System.out.println("Number of digits are: " + a);
	}

}
