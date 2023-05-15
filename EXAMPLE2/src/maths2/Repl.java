package maths2;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("HI   How        are       you");
		String a=s.replaceAll("\\s{2,}"," ");
		System.out.println(a);
	}

}
