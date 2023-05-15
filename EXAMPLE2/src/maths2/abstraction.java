package maths2;
abstract class Gold 
{
	abstract void Java();
	abstract void Mono();
	}
class Kani extends Gold
{
public void Java()
{
	System.out.println("Hi");
}
public void Mono()
{
	System.out.println("23");
}
}
public class abstraction {

	public static void main(String[] args) {
		Kani obj=new Kani();
		obj.Java();
		obj.Mono();
	}

}
