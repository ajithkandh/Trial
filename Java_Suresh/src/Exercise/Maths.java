package Exercise;

public class Maths {
	int a,b,c,d,f,g,h;
	double e;
	public void Add()
	{
		a=234;
		b=456;
		c=345;
		d=(a+b+c);
		e=Math.pow(d, 3);
		f=d*d*d;
		System.out.println(e+"  "+f);
	}
	public static void main(String[] args) {
		Maths obj=new Maths();
		obj.Add();
	}

}
