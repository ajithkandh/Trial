package maths2;

public class Odd_Even_Test {

	public static void main(String[] args) {
		int[] b= {1,2,3,4,5,6,7,8,9};
		for(int d:b)
		{
			if(d%2!=0)
			{
				System.out.println("The test ID is"+d); 
			}
		}
		System.out.println("=============================");
		for(int d:b)
		{
			if(d%2==0)
			{
				System.out.println("The test ID is"+d); 
			}
		}

	}

}
