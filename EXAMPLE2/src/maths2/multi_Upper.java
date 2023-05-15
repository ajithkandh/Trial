package maths2;

public class multi_Upper {

	public static void main(String[] args) {
		String name="ajith kandh ponnappan";
		String tr=name.replaceAll("\\s{2,}", " ").trim();
		
		String[] split=tr.split("  ");
		
		for(String c:split)
		{
			System.out.println(c.substring(0, 1).toUpperCase()+c.substring(1,c.length())+" ");
		}
	}

}
