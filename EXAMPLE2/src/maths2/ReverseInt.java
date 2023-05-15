package maths2;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		//int con=num;
		int rev=0;
		while(num!=0)//456
		{
			rev=rev*10+num%10;
						//1st loop: 0+456%6 = 6
						//2nd loop: 6*10+45%10 = 60+5 = 65
						//3rd loop: 65*10+4%10 = 650+4 = 654
						// % takes remainder
			num=num/10;
						//1st loop:456/10 = 45
						//2nd loop:45/10 = 4
						//3rd loop:4/10 = 0(Loop terminated.Last rev value is 654 updated in sysout.
						// / takes whole number
			
		}
		System.out.println(rev);//654
	} 

}
