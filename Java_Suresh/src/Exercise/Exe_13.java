package Exercise;

public class Exe_13 {

	public static void main(String[] args) {
		int a=100;
		
		for(int i=1;i<=a;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
				
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}

	}

}
