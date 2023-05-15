package AI;

import java.util.Random;
import java.util.Scanner;

public class Ques4_1 {

	public static void main(String[] args) {
		int max=100;
		Random num=new Random();
		int r_num=num.nextInt(max);
		//System.out.println(r_num);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a num between 1 - 100");
		int in=sc.nextInt();
		while(in!=r_num)
		{
			if(in>(r_num+10))
			{
				System.out.println("Too high");
			}
			else if(in<(r_num-10))
			{
				System.out.println("Too low");
			}
			else
			{
				System.out.println("You are close to it (+/- 10)");
			}
			System.out.println("Please enter a num between 1 - 100");
			int in1=sc.nextInt();
			in=in1;
		}
		if(in==r_num)
		{
			System.out.println("You guessed correct. The answer is :"+in);
		}
			

	}

}
