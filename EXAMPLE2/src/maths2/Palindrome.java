package maths2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a value");
		int name=sc.nextInt();
		int con=name;
		int rev=0;
		while(name!=0)
		{
			rev=rev*10+name%10;
			name=name/10;
		}
		if(rev==con)
		{
			System.out.println("This is Polindrome");
		}
		else
		{
			System.out.println("Not a polyndrome");
		}
	}

}
