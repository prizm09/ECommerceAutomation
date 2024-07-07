package com.ect.testcases;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int a,no,b,temp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		no=sc.nextInt();
		b=no;
		
		while(no>0)
		{
			a = no%10;
			no = no/10;
			temp = temp*10+a;
		}
		if(temp==b)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
		
		
		

	}

}
