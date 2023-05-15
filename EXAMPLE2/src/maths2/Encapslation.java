package maths2;

public class Encapslation {
	private String Employee_name;
	private int Employee_age;
	private int Employee_batch;
	private String Employee_Designation;
	public void setname(String name)
	{
		this.Employee_name=name;
	}
	public String getname()
	{
		return Employee_name;
	}
	public void setage(int age2)
	
	{
		this.Employee_age=age2;
		
	}
	public int getage()
	{
		return Employee_age;
	
	}
	public void setbatch(int batch)
	{
		this.Employee_batch=batch;
	
	}
	public int getbatch()
	{
		return Employee_batch;
	}
	public void setdest (String Destination)
	{
		this.Employee_Designation=Destination;
		
	}
	public String getdest()
	{
		return Employee_Designation;
	}
	public static void main(String[] args)

	{
		Encapslation obj=new Encapslation();
		obj.setname("Ajithkandh");
		obj.setage(27);
		obj.setbatch(2015);
		obj.setdest("Team Member");
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getbatch());
		System.out.println(obj.getdest()); 
	}

}
