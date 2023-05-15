package maths2;

public class Trial {

	public static void main(String[] args) {
		String name="     ajith      kandh       ponnappan";
		String tr=name.replaceAll("\\s{1,}"," ").trim();
		System.out.println(tr);
		
	}

}
