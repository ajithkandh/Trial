package Example;

import java.util.Scanner;

public class BugLifeCycle {
	String a= "Correct ANswer";
	String b="Wrong Answer";
	Scanner sc;
	public void Defect()
	{
		System.out.println("You got a defect while testing");
		System.out.println("What is the status(Select the option)");
		System.out.println("a.New");
		System.out.println("b.Open");
		System.out.println("c.Reopen");
		sc=new Scanner(System.in);
		String first=sc.nextLine();
		
		switch(first)
		{
		case "a":
			System.out.println(a);
			break;
		case "b":
			System.out.println(b);
			System.out.println("Correct ANswer is: a.New");
			break;
		case "c":
			System.out.println(b);
			System.out.println("Correct ANswer is: a.New");
			break;
			default:
			System.out.println("Select a option");
			
		}
	}
	public void  Correction()
	{
		System.out.println("The developer Accepts the defect");
		System.out.println("The status now");
		System.out.println("a.New");
		System.out.println("b.Open");
		System.out.println("c.Reopen");
		sc=new Scanner(System.in);
		String Sec=sc.nextLine();
		switch(Sec)
		{
		case "a":
			System.out.println(b);
			System.out.println("Correct ANswer is: b.Open");
			break;
		case "b":
			System.out.println(a);
			break;
		case "c":
			System.out.println(b);
			System.out.println("Correct ANswer is: b.Open");
			break;
			default:
			System.out.println("Select a option");
		}
	}
	public void Retest() throws InterruptedException
	{
		System.out.println("After developer solve the issue, what type of  testing we need to do");
		sc=new Scanner(System.in);
		String Test=sc.nextLine();
		if(Test.equalsIgnoreCase("Retesting"))
		{
			System.out.println("Correct answer");
		}
		else
		{
			System.out.println("wrong answer");
			System.out.println("Ans: We do Retesting");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		BugLifeCycle obj=new BugLifeCycle();
		obj.Defect();
		obj.Correction();
		obj.Retest();

	}

}
