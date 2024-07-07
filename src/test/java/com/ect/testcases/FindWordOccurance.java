package com.ect.testcases;

import java.util.Scanner;

public class FindWordOccurance {

	public static void main(String[] args) {
		
		String text = "Hello all! This is all we got.";
		System.out.println("Given String is: " + text);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the letter to find it's occurance: ");
		String letter = sc.next();
		
		int count = text.length() - text.replace(letter, "").length();
		
		System.out.println("The number of time letter " + letter + " occurred is/are: " + count);

	}

}
