package Dec26;

public class Polymorph {
	public void Selenium(int a,String java)
	{
		System.out.println(a);
		System.out.println(java);
		
	}
	public  void Selenium(String colour,String Mono)
	{
		System.out.println(colour);
		System.out.println(Mono);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorph obj=new Polymorph();
		obj.Selenium(3, "REctangle");
		obj.Selenium("RObo", "Robot");
	}

}
