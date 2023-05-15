package maths2;

import java.util.Arrays;

public class Bubble_sort_Func {

	public static void main(String[] args) {
		int[] num= {4,5,2,7,1,8,9,3,6};
		int k=num.length;
		System.out.println(k);
		for(int i=0;i<k-1;i++)
		{
			for(int j=0;j<k-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int sw=num[j];
					num[j]=num[j+1];
					num[j+1]=sw;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
