package AI;

public class Ques3_3 {

	public static void main(String[] args) {
		long a=345987697;
		long num=0;
		long sum=0;
		while(a!=0)
		{
			num=a%10;
			sum=sum+num;
			a=a/10;
		}
System.out.println(sum);
	}

}
