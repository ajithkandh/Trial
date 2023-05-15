package maths2;

public class Inheritance_C1 extends Inheritance_P {
	String java="Important";
	int Sub()
	{
		int x=56-45;
		return x;
	}

	public static void main(String[] args) {
		Inheritance_C1 obj=new Inheritance_C1();
		System.out.println(obj.name);
		obj.Add();
		System.out.println(obj.java);
		System.out.println(obj.Sub());
	}

}
