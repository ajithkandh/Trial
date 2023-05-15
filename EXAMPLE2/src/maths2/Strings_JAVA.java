package maths2;

public class Strings_JAVA {

	public static void main(String[] args) {
		String name="Ajith";
		char i=name.charAt(2);
		System.out.println(i);
		String name1=" Kandh";
		String F_Name=name.concat(name1);//Adding two strings
		System.out.println(F_Name);
				
		String a="PonnITha";
		String b=a.toLowerCase();
		String c=a.toUpperCase();
		System.out.println(b+" "+c);
		
		String e="";
		boolean f=e.isEmpty();//VAlidate any data is there including whitespace
		{
			String h="a";
	//	boolean g=h.isBlank();//Validate data only
		}
		String p="Selenium with Java";
		boolean q=p.startsWith("Selenium");
		if(q)
		{
			System.out.println("TC1 Pass");
		}
		boolean r=p.endsWith("Java");
		if(q)
		{
			System.out.println("TC2 Pass");
		}
		boolean s=p.startsWith(e, 3);
		if (s) {
			System.out.println("TC3 PAss");
		}
		String x="JaVa";
		String y="JAva";
		boolean z=x.equals(y);
		if(z)
		{
			System.out.println("TC4 pass");
		
		}
		else
		{
			System.out.println("TC4 Fail");
		}
		boolean w=x.equalsIgnoreCase(y);
		if(w)
		{
			System.out.println("TC5 Pass");
		}
	}

}
