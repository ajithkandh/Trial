package maths2;

public class Prime_num {

	public static void main(String[] args) {
		int con=100;
		for(int i=2;i<=con;i++)
			
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
