package maths2;

public class String_occ {

	public static void main(String[] args) {
		String name="Ponnappan";
		int Full_Name=name.length();
		int Replace=name.replace("n", "").length();
		int After_remove=Full_Name-Replace;
		System.out.println("The count of n is:"+After_remove);
		
				

	}

}
