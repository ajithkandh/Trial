package AI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques3_2 {

	public static void main(String[] args) {
		int []a= {34,22,9,15,45,8,27,53};
		int b=a.length;
		
		for(int i=0;i<b-1;i++)
		{
			for(int j=0;j<b-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int num=a[j];
					a[j]=a[j+1];
					a[j+1]=num;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
			System.out.println("THe second largest num is:"+Array.get(a, (b-2)));
		
	}

}
