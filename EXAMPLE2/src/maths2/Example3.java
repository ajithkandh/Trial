package maths2;

public class Example3
{
	String Name="Selenium";
	public void Add(int a, int b)
	{
		int c=a+b;
		System.out.println("the add value is:"+c);
	}
	public static void main(String[] args) {
		Example3 obj=new Example3();
		obj.Add(23,33);
	}

}
