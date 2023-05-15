package maths2;
class AKG

{
public void Kiso()
{
	System.out.println("Waiting for");
}
}
class Puni extends AKG

{
public void Kiso()
{
	super.Kiso();
System.out.println("Success");

}
}
public class Sup1 {

	public static void main(String[] args) {
		Puni obj=new Puni();
		obj.Kiso();
	}

}
