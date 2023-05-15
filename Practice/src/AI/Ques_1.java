package AI;

public class Ques_1 {

	public static void main(String[] args) {
		int num[]= {2,45,65,3,6,33,22,9,17,55};
		int l=num.length;
		int lar=num[0];
		for(int i=0;i<l;i++)
		{
			if(num[i]>lar)
			{
				lar=num[i];
			}
		}
		
			
			System.out.println(lar);
		}

	}
//Unable to do
