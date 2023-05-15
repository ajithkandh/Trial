package maths2;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		int min,max,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the min value");
		min=sc.nextInt();
		System.out.println("Enter the max value");
		max=sc.nextInt();
		for(i=min;i<=max;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				
					break;
				
				
			}
			if(i==j)
			System.out.println(i);
		}
	}

}
