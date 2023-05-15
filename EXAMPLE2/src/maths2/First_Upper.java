package maths2;

public class First_Upper {

	public static void main(String[] args) {
		String name="ranger";
		String befo=name.substring(0, 1);
		String remain=name.substring(1, name.length());
		String k=befo.toUpperCase();
		String u=k+remain;
		System.out.println(u);
	}

}
