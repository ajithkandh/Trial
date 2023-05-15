package AI;

public class Ques_5 {

	public static void main(String[] args) {
		String name="Roman";
		int a=name.length();
		String str="";
		for(int i=a-1;i>=0;i--)
		{
			str=str+name.charAt(i);
		}
				System.out.println(str);
				
	}

}
