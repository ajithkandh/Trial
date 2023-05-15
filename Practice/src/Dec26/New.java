package Dec26;

import java.util.Scanner;

public class New {


	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your name");
		String input=a.nextLine();
		
		int b=input.length();
		System.out.println("Your name has "+b+" letters");
		String c=new StringBuilder(input).reverse().toString();
		System.out.println(c);
		String d="po";
		if(input==d)
		{
			System.out.println("The Best Sister");
		}
		
		
		
		
	}

}
