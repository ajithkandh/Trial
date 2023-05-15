package maths2;

public class MinMax {

	public static void main(String[] args) {
		int[] a= {4,45,76,88,3,54,1,7,87};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				//45>4==max=45
				//76>45==max=76
				//88>76==max=88
				//88<3==max=88
			}
			
		}
		System.out.println(max);
		for(int j=1 ;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
			
		}
		System.out.println(min);
	}

}
