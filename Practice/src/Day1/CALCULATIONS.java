package Day1;

public class CALCULATIONS {
	public void Area()
	{
		String Area="Area=Length*Width";
		int L=4;
		int W=6;
		int A=L*W;
		System.out.println(Area);
		System.out.println(A);
				
	}
	public void Radius()
	{
		int d=47;
		double r=d/2;
		System.out.println(r);
				
	}
	
	
	public static void main(String[] args) { 
		CALCULATIONS obj=new CALCULATIONS();
		obj.Area();
		obj.Radius();
			

	}

}
