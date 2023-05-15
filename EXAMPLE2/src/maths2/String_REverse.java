package maths2;

public class String_REverse {

	public static void main(String[] args) {
		String name="Ponnappan";
		String sr="";
		int count=name.length();
		for(int i=count-1;i>=0;i--)
		{
			sr=sr+name.charAt(i);
		}
		System.out.println(sr);
	}

}
