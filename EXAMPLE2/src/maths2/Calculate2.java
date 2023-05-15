package maths2;

public class Calculate2
{
	String Name="Selenium";
	public void Add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("The addition value is:"+c);
	}	
	public void Sub()
	{ 
		int e=22;
		int f=11;
		int g=e-f;
		System.out.println("The subtract value is:"+g);
	}
	public void Multiply()
	{
		int i=22;
		int j=3;
		int k=i*j;
		System.out.println("The multiply value is:"+k);
	}
	public void Divide()
	{
		int x=99;
		int y=11;
		int z=x/y;
		System.out.println("The divide Value is:"+z);
	}
	public static void main(String[] args) {
		Calculate2 obj=new Calculate2();
		obj.Add();
		obj.Sub();
		obj.Multiply();
		obj.Divide();
	}

}
