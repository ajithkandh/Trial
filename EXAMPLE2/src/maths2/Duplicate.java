package maths2;

public class Duplicate {

	public static void main(String[] args) {
		String[] a= {"Java","Ruby","JOri","Kodi","Java"};
		boolean s=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
					s=true;
				}
			}
		}
		if (s==false)
		{
			System.out.println("No Duplicates");
		}

	}

}
