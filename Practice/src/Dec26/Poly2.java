package Dec26;

public class Poly2 extends Polymorph {
	public void Selenium(int b,String Come)
	{
		System.out.println(b);
		System.out.println(Come);
		
	}
	public  void Selenium(String Kill,String Rest)
	{
		System.out.println(Kill);
		System.out.println(Rest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly2 obj2=new Poly2();
		obj2.Selenium(44, "Rust");
		obj2.Selenium("Rema", "Sen");
	}

}
