package AI;

public class Ques2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,i;
		a=30;
		b=0;
		c=1;
		for(i=0;i<=a;i++)
		{
		d=b+c;
		if(d>a)
		{
			break;
		}
		System.out.println(d);
		b=c;
		c=d;
			}
	
		
	}

}
