package AI;

import java.util.Scanner;

public class Ques4_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the first number");
		double a=sc.nextDouble();
		System.out.println("Please enter a calculate operation(+,-,*,/)");
		char s=sc.next().charAt(0);
		System.out.println("Please enter the second number");
		double b=sc.nextDouble();
		double result= 0.0;
		switch(s)
		{
		case '+':
			 result= a+ b;
			break;
		case '-':
			 result=a-b;
			 break;
		case '*':
			 result= a* b;
			break;
		case '/':
			 result=a/b;
			 break;
			 default:
				 System.out.println("Error: Wrong operator");
				 return;
		}
		System.out.println(result);

	}

}
