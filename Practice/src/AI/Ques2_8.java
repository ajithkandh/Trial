package AI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques2_8 {

	public static void main(String[] args) {
		int a[]= {23,5,54,66,9,41,33,99,14};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int[] b= {23,5,54,66,9,41,33,99,14};
		int c=b.length;
		for(int i=0;i<c-1;i++)
		{
			for(int j=0;j<c-1;j++)
			{
				if(b[j]>b[j+1])
				{
					int num=b[j];
					b[j]=b[j+1];
					b[j+1]=num;
				}
			
			}
		}
		System.out.print(Arrays.toString(b));
	}

}
