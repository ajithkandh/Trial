package maths2;

import java.util.Scanner;

public class Reverse_Select {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String na=sc.nextLine();
		String[] naArray=na.split("\\s");
		String first=naArray[0];
		String second=naArray[1];
		String third=naArray[2];
		String sec_reverse=new StringBuilder(second).reverse().toString();
		System.out.println(first+" " +sec_reverse+" " +third+" ");
		
		
	}

}
