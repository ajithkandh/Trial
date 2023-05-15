package maths2;

import java.util.HashMap;

public class HashMap_Exp {

	public static void main(String[] args) {
		HashMap<String,Integer> Emp=new HashMap<String,Integer>();
		//to store the data.. put method
		Emp.put("Java", 22);
		Emp.put("Omar", 25);
		Emp.put("Keke", 27);
		Emp.put("Angry", 56);
		Emp.put("Roles", 76);
		Emp.put("Ruby", 45);
		Emp.put("Python", 46);
		//to check the total no of inputs
		System.out.println("The size is:"+Emp.size());
		//to read any particular input.. get method
		System.out.println("The Emp's ID is:"+Emp.get("Java"));
		System.out.println("The Emp's ID is:"+Emp.get("Ruby"));
		//to get all input details
		for(String Emps:Emp.keySet())
		{
			System.out.println("The Emp Name is:"+Emps);
		}
		for(Integer EmpsID:Emp.values())
		{
			System.out.println("The Emp Id is:"+EmpsID);
		}
		Emp.clear();
		//To clear all the inputs
		System.out.println("The size is"+Emp.size());
		
		
	}

}
