package maths2;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<Integer> Org=new HashSet<Integer>();
		Org.add(34);
		Org.add(33);
		Org.add(36);
		Org.add(76);
		Org.add(56);
		Org.add(55);
		Org.add(35);
		System.out.println("The org size is:"+Org.size());
		for(Integer ids:Org)
		{
			System.out.println("The Org Id is:"+ids);
		
		}
		Org.remove(36);
		//Validate remove first
		for(Integer idss:Org)
		{
			System.out.println("THe Org id is:"+idss);
		}
		//2nd method
		if(Org.contains(36))
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Pass");
		}
		
		
	}

}
