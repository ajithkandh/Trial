package AI;

import java.util.Scanner;

public class Ques_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a word");
		String name=sc.nextLine();
		int a=name.length();
		String str="";
		for(int i=a-1;i>=0;i--) {
			
			str=str+name.charAt(i);
		}
	//	System.out.println(str);
		if(name.equalsIgnoreCase(str))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("The given is not a palindrome");
		}
	}

}
