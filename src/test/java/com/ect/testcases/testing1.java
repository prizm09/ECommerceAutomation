package com.ect.testcases;

public class testing1 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=5; i++)
		{
			//System.out.print(" " + i);
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<=5; i++)
		{
			//System.out.print(" " + i);
			for(j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(i=1; i<=4; i++)
//		{
//			for(j=1; j<=i-1; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println(i);
//		}
		

	}

}

